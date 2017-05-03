(function(module) {

    var adminRouteConfig = function ($routeProvider, $locationProvider) {

        $routeProvider.when("/login", {
            templateUrl: "/views/adminLogin.html"
        });

        $routeProvider.when("/main", {
            templateUrl: "/views/adminMain.html"
        });

        $routeProvider.otherwise({
            redirectTo: "/login"
        });

        $locationProvider.html5Mode(true);


    };

    module.config(adminRouteConfig);

}(angular.module("sportsStoreAdmin")));