(function (module) {

    var productListCtrl = function (cart) {
        var vm = this;
        vm.selectedCategory = undefined;
        vm.selectedPage = 1;
        vm.pageSize = 3;

        vm.selectCategory = function (newCategory) {
            vm.selectedCategory = newCategory;
            vm.selectedPage = 1;
        };

        vm.selectPage = function (newPage) {
            vm.selectedPage = newPage;
        };

        vm.categoryFilterFn = function (product) {
            return !vm.selectedCategory || product.category === vm.selectedCategory;
        };

        vm.getCategoryClass = function (category) {
            return vm.selectedCategory === category ? "btn-primary" : "";
        };

        vm.getPageClass = function (page) {
            return vm.selectedPage === page ? "btn-primary" : "";
        };

        vm.addProductToCart = function (product) {
            cart.addProduct(product.id, product.name, product.price);
        }
    };

    module.controller("productListCtrl", productListCtrl);

}(angular.module("sportsStore")));