(function(module) {

    var authCtrl = function ($http, $location) {

        var vm = this;
        var authUrl = "http://localhost:5500/users/login";

        vm.authenticate = function (user, pass) {
            $http.post(authUrl, {username:user, password: pass}, {withCredentials: true})
                .then(
                    function(success) {
                        $location.path("/main");
                    },
                    function(error) {
                        vm.authenticationError = error.data;
                    }
                )
        };
    }

    module.controller("authCtrl", authCtrl);

}(angular.module("sportsStoreAdmin")));