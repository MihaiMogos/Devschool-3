(function (module) {

    var productListCtrl = function ($filter) {
        var vm = this;

        vm.selectedCategory = null;
        vm.selectedPage = 1;
        vm.pageSize = 3;

        vm.selectCategory = function (newCategory) {
            vm.selectedCategory = newCategory;
            vm.selectedPage = 1;
        };

        vm.selectPage = function (newPage) {
            vm.selectedPage = newPage;
        };

        vm.getPageClass = function (page) {
            return vm.selectedPage == page ? "btn-primary" : "";
        };


        vm.categoryFilter = function (product) {
            return vm.selectedCategory == null ||
                product.category == vm.selectedCategory;
        };

        vm.getCategoryClass = function (category) {
            return vm.selectedCategory == category ? "btn-primary" : "";
        };
    };

    module.controller("productListCtrl", productListCtrl);

}(angular.module("sportsStore")));