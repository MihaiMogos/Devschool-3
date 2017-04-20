(function (module) {
    var sportsStoreCtrl = function (sportsStoreService, $http, $location, cart) {
        var vm = this;
        vm.data = {};
        vm.orderUrl = "http://localhost:5500/orders";
        sportsStoreService.getItems().then(function (response) {
            vm.data.products = response.data;
        });
        vm.sendOrder = function (shippingDetails) {
            var order = angular.copy(shippingDetails);
            order.products = cart.getProducts();
            vm.send(order);
        }
         vm.send = function(order){
                $http.post(vm.orderUrl, order)
                .then(function (data) {
                   vm.data.orderId = data.id;
                    cart.getProducts().length = 0;
                     $location.path("/complete");
                })
               
            }
    };
    module.controller("sportsStoreCtrl", sportsStoreCtrl);
}(angular.module("sportsStore")));