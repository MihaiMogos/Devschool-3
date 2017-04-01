(function(app){
    var ToDoCtrl = function(){
        var vm = this;

        vm.todo = {
            user: 'Lavinia',
            todos: []
        };
        vm.add = function (action) {
            vm.todo.todos.push({action: action, done:false});
        }
    };
    app.controller('ToDoCtrl', ToDoCtrl);
}(angular.module('toDoApp')));