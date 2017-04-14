(function (module) {
    var sportStoreAdminConfig = function ($routeProvider, $locationProvider) {
        $routeProvider
            .when("/login", {
                templateUrl: "admin/views/adminLogin.html"
            })
            .when("/main", {
                templateUrl: "admin/views/adminMain.html"
            })
            .otherwise({
                redirectTo: "/login"
            });
        $locationProvider.html5Mode(true);
    };

    module.config(sportStoreAdminConfig);
}(angular.module("sportStoreAdminApp")));