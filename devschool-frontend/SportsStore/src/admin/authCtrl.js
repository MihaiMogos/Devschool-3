(function (module) {

    var authCtrl = function ($location, $firebaseObject) {
        var vm = this;

        vm.authenticate = function (email, pass) {
            firebase.auth().signInWithEmailAndPassword(email, pass)
                .then(function (user) {
                    $location.path("/main");
                })
                .catch(function (error) {
                    var errorCode = error.code;
                    var errorMessage = error.message;
                    if (errorCode === 'auth/wrong-password') {
                        alert('Wrong password.');
                    } else {
                        alert(errorMessage);
                    }
                    console.log(error);
                    vm.authenticationError = error;
                });
        };
    };

    module.controller("authCtrl", authCtrl);

}(angular.module("sportsStoreAdmin")));