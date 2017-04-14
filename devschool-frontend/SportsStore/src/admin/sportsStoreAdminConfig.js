(function (module) {

    var sportsStoreAdminConfig = function ($routeProvider, $locationProvider) {
        $routeProvider
            .when("/login", {
                templateUrl: "/views/admin/adminLogin.html"
            })
            .when("/main", {
                templateUrl: "/views/admin/adminMain.html"
            })
            .otherwise({
                redirectTo: "/login"
            });
        $locationProvider.html5Mode(true);
    };

    module.config(sportsStoreAdminConfig);

}(angular.module("sportsStoreAdmin")));
