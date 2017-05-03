(function(module) {

    var ordersCtrl = function($http) {
        var vm = this;

        var ordersUrl = "http://localhost:5500/orders";

        $http.get(ordersUrl, {withCredentials: true})
            .then (
                function(success) {
                    vm.orders = success.data;
                },
                function(error) {
                    vm.error = error.data;
                }
            );

        vm.selectedOrder;

        vm.selectOrder = function (order) {
            vm.selectedOrder = order;
        };

        vm.calcTotal = function (order) {
            var total = 0;
            for (var i = 0; i < order.products.length; i++) {
                total += order.products[i].count * order.products[i].price;
            }
            return total;

        }
    };

    module.controller("ordersCtrl", ordersCtrl);


}(angular.module("sportsStoreAdmin")));