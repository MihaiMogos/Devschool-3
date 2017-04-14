(function (module) {

    var sportsStoreCtrl = function ($firebaseArray, $location, cart) {
        var vm = this;

        var ref = firebase.database().ref("/products");
        vm.data = {
            "products": $firebaseArray(ref)
        };

        vm.sendOrder = function (shippingDetails) {
            var order = angular.copy(shippingDetails);
            order.products = angular.copy(cart.getProducts());
            var newOrder = firebase.database().ref().child('/orders').push(order);
            vm.lastOrderId = newOrder.key;
            cart.getProducts().length = 0;
            $location.path("/complete");
        };
    };

    module.controller("sportsStoreCtrl", sportsStoreCtrl);

}(angular.module("sportsStore")));