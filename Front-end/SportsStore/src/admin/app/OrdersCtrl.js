(function (module) {

    var OrdersCtrl = function ($firebaseObject) {

        var vm = this;
        vm.selectedOrder = null;

        var ref = firebase.database().ref("/orders");
        vm.data = {
            "orders": $firebaseObject(ref)
        };

        vm.selectOrder = function (order) {
            vm.selectedOrder = order;
        };

        vm.calcTotal = function (order) {
            var total = 0;
            for (var i = 0; i < order.products.length; i++) {
                total +=
                    order.products[i].count * order.products[i].price;
            }
            return total;
        };
    };

    module.controller("ordersCtrl", OrdersCtrl);
}(angular.module("sportStoreAdminApp")));
