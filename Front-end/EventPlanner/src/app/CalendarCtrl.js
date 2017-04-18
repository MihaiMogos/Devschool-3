(function (app) {
    var CalendarCtrl = function () {
        var vm = this;
        vm.myDate = new Date();
        vm.isOpen = false;

        $('.clockpicker').clockpicker();
    };
    app.controller('CalendarCtrl', CalendarCtrl);
}(angular.module("Datepicker")));