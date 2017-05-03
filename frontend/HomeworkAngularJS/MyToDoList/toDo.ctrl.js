/**
 * Created by Andrei on 23.03.2017.
 */
//angular.module('toDoApp').controller('toDoCotrl');
(function (app) {

    var ToDoCtrl=function () {
        var vm=this;

        vm.toDo={
            user:"Andrei",
            todos:[],

        };
        vm.add = function (action,date,task) {
                           if (action && action.length > 0 ) {
                               if(date>new Date()) {
                                   vm.toDo.todos.push(
                                       {
                                           action: action,
                                           projects:task,
                                           done: false,
                                           data: date

                                       });
                                   vm.actionText="";

                               }
                               else {
                                   window.alert("The date has already passed!!!");
                               }
                           }

                        }







                };



            app.controller('ToDoCtrl', ToDoCtrl);
    })(angular.module("toDoApp"));