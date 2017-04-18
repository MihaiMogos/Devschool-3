(function (app) {

    var EventPlannerConf = function ($routeProvider, $locationProvider) {
        $routeProvider
            .when("/login", {
                templateUrl: "views/loginUser.html"
            })
            .when("/events", {
                templateUrl: "views/main.html"
            })
            .when("/newEvent", {
                templateUrl: "views/newEvent.html"
            })
            .when("/userEvents", {
                templateUrl: "views/userEvents.html"
            })
            .otherwise({
                redirectTo: "/events"
            });
        $locationProvider.html5Mode(true);
    };

    var mapsConfig = function (uiGmapGoogleMapApiProvider) {
        uiGmapGoogleMapApiProvider.configure({
            key: "AIzaSyAfOn_soz9zZAQCeCKa-EywsdaBc86rvFM",
            v: '3.20',
            libraries: 'weather,geometry,visualization'
        });
    };

    app.config(EventPlannerConf);
    app.config(mapsConfig);
}(angular.module("eventApp")));