/**
 * Created by Andrei on 23.03.2017.
 */
//angular.module('toDoApp').controller('toDoCotrl');
(function (app) {

    var ToDoCtrl=function () {
        var vm=this;
        var ref = firebase.database().ref("/events");

        vm.toDo={
            user:"Andrei",
            todos:[]

        };
        vm.add = function (data,name,description,location,projects) {
                           if (name && name.length > 0 ) {
                               if(data>new Date()) {

                                   vm.toDo.todos.push(
                                       {

                                           data: data ,
                                           name: name,
                                           description:description,
                                           location:location,
                                           projects:projects,
                                           done: false



                                       });


                               }
                               else {
                                   window.alert("The date has already passed!!!");
                               }
                           }

            event = {data:data.toString(),name:name,description:description,location:location,projects:projects};
            ref.push(event);
                        }







                };



            app.controller('ToDoCtrl', ToDoCtrl);
    })(angular.module("toDoApp"));