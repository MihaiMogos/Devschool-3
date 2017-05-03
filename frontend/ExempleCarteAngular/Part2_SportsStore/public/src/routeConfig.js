(function(module) {

    var routeConfig = function ($routeProvider, $locationProvider) {

        $routeProvider.when("/complete", {
            templateUrl: "/views/thankYou.html"
        });

        $routeProvider.when("/placeorder", {
            templateUrl: "/views/placeOrder.html"
        });

        $routeProvider.when("/checkout", {
            templateUrl: "/views/checkoutSummary.html"
        })

        $routeProvider.when("/products", {
            templateUrl: "/views/productList.html"
        })


        $routeProvider.otherwise({
            templateUrl: "/views/productList.html"
        })

        $locationProvider.html5Mode(true);


    };

    module.config(routeConfig);

}(angular.module("sportsStore")));