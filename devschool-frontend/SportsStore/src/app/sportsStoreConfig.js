(function (module) {

    var sportsStoreConfig = function ($routeProvider, $locationProvider) {
        $routeProvider
            .when("/checkout", {
                templateUrl: "/views/app/checkoutSummary.html"
            })
            .when("/products", {
                templateUrl: "/views/app/productList.html"
            })
            .when("/complete", {
                templateUrl: "/views/app/thankYou.html"
            })
            .when("/placeorder", {
                templateUrl: "/views/app/placeOrder.html"
            })
            .otherwise({
                templateUrl: "/views/app/productList.html"
            });
        $locationProvider.html5Mode(true);
    };

    module.config(sportsStoreConfig);

}(angular.module("sportsStore")));