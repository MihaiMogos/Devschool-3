(function (app) {
    var ToDoCtrl = function () {
        var vm = this;

        vm.toDo = {
            user: 'Ciprian',
            todos: []
        }

        vm.add = function (action) {
            if (action && action.length > 0) {
                vm.toDo.todos.push(
                    {
                        action: action,
                        done: false
                    });
            }
        }
    };

    app.controller('ToDoCtrl', ToDoCtrl);
})(angular.module("toDoApp"));