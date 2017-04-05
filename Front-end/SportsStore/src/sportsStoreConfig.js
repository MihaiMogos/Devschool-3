(function (module) {

    var sportsStoreConfig = function ($routeProvider, $locationProvider) {
        $locationProvider.html5Mode(true);
        $routeProvider.when("/checkout", {
            templateUrl: "src/views/checkoutSummary.html"
        })
        .when("/products", {
            templateUrl: "src/views/productList.html"
        })
        .otherwise({
            templateUrl: "src/views/productList.html"
        });
    };

    module.config(sportsStoreConfig);

}(angular.module("sportsStore")));