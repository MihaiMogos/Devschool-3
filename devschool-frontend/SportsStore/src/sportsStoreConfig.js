(function (module) {

    var sportsStoreConfig = function ($routeProvider, $locationProvider) {
        $routeProvider
            .when("/checkout", {
                templateUrl: "/views/checkoutSummary.html"
            })
            .when("/products", {
                templateUrl: "/views/productList.html"
            })
            .otherwise({
                templateUrl: "/views/productList.html"
            });
        $locationProvider.html5Mode(true);
    };

    module.config(sportsStoreConfig);

}(angular.module("sportsStore")));