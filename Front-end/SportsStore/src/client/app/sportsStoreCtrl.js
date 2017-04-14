(function (module) {

    var sportsStoreCtrl = function ($firebaseObject, $location, cart) {
        var vm = this;

        var ref = firebase.database().ref();
        vm.data = $firebaseObject(ref);

        vm.sendOrder = function (shippingDetails) {
            var order = angular.copy(shippingDetails);
            order.products = angular.copy(cart.getProducts());

            var newCmd = ref.child('/orders').push(order);
            vm.orderId = newCmd.key;
            cart.getProducts().length = 0;
            $location.path("/complete");
        };
    };

    module.controller("sportsStoreCtrl", sportsStoreCtrl);

}(angular.module("sportsStore")));