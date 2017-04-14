(function (module) {

    var cartSummary = function (cart) {
        return {
            restrict: "E",
            templateUrl: "views/app/cartSummary.html",
            controller: function () {
                var vm = this;
                vm.cartData = cart.getProducts();
                vm.total = function () {
                    var total = 0;
                    for (var i = 0; i < vm.cartData.length; i++) {
                        total += (vm.cartData[i].price * vm.cartData[i].count);
                    }
                    return total;
                };
                vm.itemCount = function () {
                    var total = 0;
                    for (var i = 0; i < vm.cartData.length; i++) {
                        total += vm.cartData[i].count;
                    }
                    return total;
                };
            },
            controllerAs: "cvm"
        };
    };

    module.directive("cartSummary", cartSummary);

}(angular.module("cart")));
