(function (module) {

    var mainCtrl = function () {
        var vm = this;

        vm.screens = ["Products", "Orders"];
        vm.current = vm.screens[0];

        vm.setScreen = function (index) {
            vm.current = vm.screens[index];
        };

        vm.getScreen = function () {
            return vm.current === "Products" ? "/views/admin/adminProducts.html" : "/views/admin/adminOrders.html";
        };
    };

    module.controller("mainCtrl", mainCtrl);

}(angular.module("sportsStoreAdmin")));