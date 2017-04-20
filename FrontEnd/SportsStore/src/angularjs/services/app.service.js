(function(module){
    var sportsStoreService = function($http){
        var getItems = function () {
            return $http.get("http://localhost:5500/products");
        };
        return {
            getItems: getItems
        };
        
    };
    module.factory("sportsStoreService",sportsStoreService);
}(angular.module("sportsStore")));