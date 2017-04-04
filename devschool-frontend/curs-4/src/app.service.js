(function (module) {

    var toDoService = function ($http) {

        var getItems = function () {
            return $http.get("/data/todos.json");
        };

        return {
            getItems: getItems
        };
    };

    module.factory("toDoService", toDoService);
}(angular.module("toDoApp")));