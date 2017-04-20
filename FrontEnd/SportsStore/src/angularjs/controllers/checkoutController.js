(function (module) {
    var cartSummaryController = function (cart) {
        var vm = this;
        vm.cartData = cart.getProducts();
        vm.total = function () {
            var total = 0;
            for (var i = 0; i < vm.cartData.length; i++) {
                total += (vm.cartData[i].price * vm.cartData[i].count);
            }
            return total;
        }
        vm.remove = function (id) {
            cart.removeProduct(id);
        }
    };
    module.controller("cartSummaryController", cartSummaryController);
}(angular.module("sportsStore")));