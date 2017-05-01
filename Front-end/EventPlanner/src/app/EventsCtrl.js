(function (app) {

    var EventsCtrl = function ($firebaseArray, $location, $filter, uiGmapGoogleMapApi, $q) {
        var vm = this;

        vm.event = {};
        vm.events = [];
        vm.calendarEvents = [];
        vm.newEvent = {};
        vm.pageSize = 4;
        vm.viewDate = Date.now();
        vm.calendarView = "month";
        vm.title = "Events";
        var ref = firebase.database().ref("/events");
        vm.events = $firebaseArray(ref);
        vm.totalEvents = 0;

        vm.map = {center: {latitude: 44.439663, longitude: 26.096306}, zoom: 8};
        vm.geocoder = new google.maps.Geocoder();

        vm.active = false;


        vm.findMarkersForAddress = function (i) {
            vm.events[i].coords = vm.map.center;
            vm.geocoder.geocode({'address': vm.events[i].address}, function (results, status) {
                if (status === google.maps.GeocoderStatus.OK) {
                    vm.events[i].coords = {
                        longitude: results[0].geometry.location.lng(),
                        latitude: results[0].geometry.location.lat()
                    };
                }
            });
        };

        vm.events.$loaded().then(function (arr) {
            vm.totalEvents = arr.length;

            for (var i = 0; i < arr.length; i++) {
                var dateNameStart = $filter("date")(vm.events[i].date + " " + vm.events[i].startTime, "M/d/yy h:mm");
                var dateValueStart = new Date(dateNameStart);
                var dateNameEnd = $filter("date")(vm.events[i].date + " " + vm.events[i].endTime, "M/d/yy h:mm");
                var dateValueEnd = new Date(dateNameEnd);
                vm.calendarEvents[i] = {};
                vm.calendarEvents[i].startsAt = dateValueStart;
                vm.calendarEvents[i].endsAt = dateValueEnd;
                vm.calendarEvents[i].title = vm.events[i].title;
                vm.calendarEvents[i].color = {
                    primary: "#ff0000",
                    secondary: "#00ff00"
                };

                vm.findMarkersForAddress(i);
            }
            console.log(vm.calendarEvents);
        });

        vm.getNumberOfPages = function () {
            return Math.max(Math.ceil(vm.totalEvents / vm.pageSize), 1);
        };

        vm.getCurrentPage = function (currentIndex) {
            var actual = vm.events.slice(currentIndex * vm.pageSize, (currentIndex + 1) * vm.pageSize);
            return actual;
        };

        vm.addEvent = function (event) {
            var actualEvent = angular.copy(event);
            actualEvent.startTime = document.getElementById("startTime").value;
            actualEvent.date = $filter("date")(actualEvent.date, "longDate");
            actualEvent.endTime = document.getElementById("endTime").value;
            // console.log(actualEvent);
            var newCmd = ref.push(actualEvent);
            $location.path("/events");
        };

        vm.isInvalidDate = function (date) {
            var dateName = $filter("date")(date, "shortDate");
            var dateValue = Date.parse(dateName);
            var currentTime = new Date();
            return dateValue < currentTime;
        };

        vm.range = function (dim) {
            return new Array(dim);
        };
    };

    app.controller('EventsCtrl', EventsCtrl);
}(angular.module("eventApp")));