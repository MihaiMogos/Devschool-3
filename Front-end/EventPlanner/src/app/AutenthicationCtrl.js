(function (app) {

    var AuthenticationCtrl = function ($location, $rootScope) {
        var vm = this;

        vm.isOnline = false;

        vm.autheticate = function (providerName) {
            var provider = null;
            switch (providerName) {

                case "google":
                    provider = new firebase.auth.GoogleAuthProvider();
                    break;

                case "github":
                    provider = new firebase.auth.GithubAuthProvider();
                    break;

                case "twitter":
                    provider = new firebase.auth.TwitterAuthProvider();
                    break;

                case "facebook":
                    provider = new firebase.auth.FacebookAuthProvider();
                    break;
            }
            firebase.auth().signInWithPopup(provider).then(function (result) {
                vm.user = result.user;
                vm.isOnline = true;
                $rootScope.$apply(function () {
                    $location.path("/app");
                    console.log($location.path());
                });
            });
        };

        vm.logOut = function () {
            firebase.auth().signOut().then(function () {
                vm.isOnline = false;
            }, function (error) {
                console.error('Sign Out Error', error);
            });
        };

        vm.goToLogin = function () {
            $location.path("/login");
        };
    };
    app.controller('AuthenticationCtrl', AuthenticationCtrl);
}(angular.module("eventApp")));
