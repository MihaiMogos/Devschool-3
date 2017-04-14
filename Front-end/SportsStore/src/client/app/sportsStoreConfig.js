(function (module) {

    var sportsStoreConfig = function ($routeProvider, $locationProvider) {
        $locationProvider.html5Mode(true);

        $routeProvider.when("/checkout", {
            templateUrl: "client/views/checkoutSummary.html"
        })
            .when("/products", {
                templateUrl: "client/views/productList.html"
            })
            .when("/complete", {
                templateUrl: "client/views/thankYou.html"
            })
            .when("/placeorder", {
                templateUrl: "client/views/placeOrder.html"
            })
            .otherwise({
                templateUrl: "client/views/productList.html"
            });
    };

    module.config(sportsStoreConfig);

}(angular.module("sportsStore")));