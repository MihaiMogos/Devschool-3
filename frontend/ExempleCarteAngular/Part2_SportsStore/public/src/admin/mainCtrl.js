(function(module) {

    var mainCtrl = function() {

        var vm = this;

        vm.screens = ["Products", "Orders"];
        vm.current = vm.screens[0];

        vm.setScreen = function(index) {
            vm.current = vm.screens[index];
        };

        vm.getScreen = function() {
            return vm.current == "Products" ? "/views/adminProduct.html" : "/views/adminOrders.html";
        };
    }

    module.controller("mainCtrl", mainCtrl);

}(angular.module("sportsStoreAdmin")));