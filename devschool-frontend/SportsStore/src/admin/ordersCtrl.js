(function (module) {

    var ordersCtrl = function ($firebaseArray) {
        var vm = this;
        var ref = firebase.database().ref("/orders");
        vm.data = {
            "orders": $firebaseArray(ref)
        };
        vm.selectedOrder = null;

        vm.selectOrder = function (order) {
            vm.selectedOrder = order;
        };
        vm.calcTotal = function (order) {
            var total = 0;
            for (var i = 0; i < order.products.length; i++) {
                total += order.products[i].count * order.products[i].price;
            }
            return total;
        };
    };

    module.controller("ordersCtrl", ordersCtrl);

}(angular.module("sportsStoreAdmin")));