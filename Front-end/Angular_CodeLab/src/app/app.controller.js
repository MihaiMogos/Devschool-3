"use strict";

(function(module) {

    var ToDoCtrl = function(toDoService) {
        var vm = this;

        vm.todo = {
            user: "Lavinia"
            // items: [
            //     {"action": "Make slides", "done": false},
            //     {"action": "Travel to ING", "done": false},
            //     {"action": "Prepare room", "done": false},
            //     {"action": "Order pizza", "done": false}
            // ]

        };

        vm.addNewItem = function(actionText) {
            vm.todo.items.push({ action: actionText, done: false });
        };

        vm.incompleteCount = function() {
            var count = 0;
            angular.forEach(vm.todo.items, function(item) {
                if (!item.done) {
                    count++;
                }
            });
            return count;
        };

        toDoService.getItems().then(function(response) {
            vm.todo.items = response.data;
        });

        vm.warningLevel = function() {
            return vm.incompleteCount() < 3 ? "label-success" : "label-warning";
        };

    };

    module.controller("ToDoCtrl", ToDoCtrl);

}(angular.module("toDoApp")));
