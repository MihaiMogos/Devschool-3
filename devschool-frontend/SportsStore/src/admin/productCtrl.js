(function (module) {

    var productCtrl = function ($firebaseArray) {
        var vm = this;

        var ref = firebase.database().ref("/products");
        vm.data = {
            "products": $firebaseArray(ref)
        };

        vm.deleteProduct = function (product) {
            vm.data.products.$remove(product);
        };

        vm.createProduct = function (product) {
            product.id = Date.now();
            vm.data.products.$add(product).then(function (ref) {
                vm.editedProduct = null;
            }, function (error) {
                console.log("Error:", error);
            });
        };

        vm.updateProduct = function (product) {
            vm.data.products.$save(product).then(function (ref) {
                vm.editedProduct = null;
            }, function (error) {
                console.log("Error:", error);
            });
        };

        vm.startEdit = function (product) {
            vm.editedProduct = product;
        };

        vm.cancelEdit = function () {
            vm.editedProduct = null;
        };
    };

    module.controller("productCtrl", productCtrl);

}(angular.module("sportsStoreAdmin")));