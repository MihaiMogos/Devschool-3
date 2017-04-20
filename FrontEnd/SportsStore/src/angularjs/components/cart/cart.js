(function (module) {
    var cart = function () {
        var vm = this;
        vm.cartData = [];
        return {
            addProduct: function (id, name, price) {
                var addedToExistingItem = false;
                for (var i = 0; i < vm.cartData.length; i++) {
                    if (vm.cartData[i].id == id) {
                        vm.cartData[i].count++;
                        addedToExistingItem = true;
                        break;
                    }
                }
                if (!addedToExistingItem) {

                    vm.cartData.push({
                        count: 1, id: id, price: price, name: name
                    });
                }
            },
            removeProduct: function (id) {
                for (var i = 0; i < vm.cartData.length; i++) {
                    if (vm.cartData[i].id == id) {
                        vm.cartData.splice(i, 1);
                        break;
                    }
                }
            },
            getProducts: function () {
                return vm.cartData;
            }
        }
    };
    module.factory("cart", cart);
    module.directive("cartSummary", function (cart) {
        return {
            restrict: "E",
            templateUrl: "components/cart/cartSummary.html",
            controller: function ($scope) {
                var cartData = cart.getProducts();
                $scope.total = function () {
                    var total = 0;
                    for (var i = 0; i < cartData.length; i++) {
                        total += (cartData[i].price * cartData[i].count);
                    }
                    return total;
                }
                $scope.itemCount = function () {
                    var total = 0;
                    for (var i = 0; i < cartData.length; i++) {
                        total += cartData[i].count;
                    }
                    return total;
                }
            }
        };
    });
}(angular.module("sportsStore")));