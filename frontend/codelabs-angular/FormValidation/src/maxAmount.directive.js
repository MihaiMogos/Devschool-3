(function (module) {

    var link = function (scope, element, attrs, ngModelCtrl) {
        ngModelCtrl.$validators.maxAmount = function(value) {
            if(value<=100){
                return true;
            }else{
                return false;
            }

        };
    };

    var MaxAmount = function () {
        return {
            restrict: 'A',
            require: 'ngModel',
            scope: {
                maxAmount: '=maxAmount'
            },
            link: link
        };
    };

    module.directive("maxAmount", MaxAmount);

}(angular.module("formValidationApp")));