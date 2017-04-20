var app = angular.module('sportsStore', ["customFilters", "ngRoute"]);
app.config(function ($routeProvider) {
    $routeProvider.when("/checkout", {
        templateUrl: "/views/checkoutSummary.html"
    });
    $routeProvider.when("/products", {
        templateUrl: "/views/productList.html"
    });
    $routeProvider.otherwise({
        templateUrl: "/views/productList.html"
    });
    $routeProvider.when("/complete", {
        templateUrl: "/views/thankYou.html"
    });
    $routeProvider.when("/placeorder", {
        templateUrl: "/views/placeOrder.html"
    });
});
app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.hashPrefix('');
}]);
