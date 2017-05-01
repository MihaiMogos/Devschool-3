(function (app) {

        var EmployeeCtrl = function ($http) {
            var vm = this;

            vm.newEmployee = {};

            vm.getAll = function () {
                $http.get("rest/getAll").then(function (response) {
                    vm.employees = response.data;
                });
            };

            vm.deleteEmployee = function (id) {
                if (confirm('Really want to do that?')) {
                    $http.delete("rest/deleteEmployee/" + id).then(function (response) {
                        vm.getAll();
                    });
                }
            };

            vm.addEmployee = function () {
                console.log(vm.newEmployee);
                $http.post("rest/addEmployee", vm.newEmployee).then(function (response) {
                    vm.getAll();
                })
            };

            vm.isInvalidId = function (id) {
                return id > 0;
            };

            vm.getAll();

            console.log("yep. i am");
        };
        app.controller('EmployeeCtrl', EmployeeCtrl);
    }(angular.module('employeesApp'))
);