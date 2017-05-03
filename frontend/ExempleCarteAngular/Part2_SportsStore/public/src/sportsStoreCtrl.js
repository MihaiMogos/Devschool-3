(function (module) {

    var sportsStoreCtrl = function($http, $location, cart) {
        var vm = this;

        vm.data = {};
        var dataUrl = "http://localhost:5500/products";
        var orderUrl = "http://localhost:5500/orders";
        $http.get(dataUrl)
            .then (
                function (success) {
                    vm.data.products = success.data;
                },
                function(error) {
                    vm.data.error = error.data;
                }
            )

        vm.sendOrder = function(shippingDetails) {
            var order = angular.copy(shippingDetails);
            order.products = cart.getProducts();
            $http.post(orderUrl, order)
                .then (
                    function(success) {
                        vm.data.orderId = success.data.id;
                        cart.getProducts().length = 0;
                    },
                    function(error) {
                        vm.data.orderError = error.data;
                    }
                )
                .finally(function () {
                    $location.path("/complete");
                })
        }
    };

    module.controller("sportsStoreCtrl", sportsStoreCtrl);

}(angular.module("sportsStore")));