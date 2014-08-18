var omnibrokerApp = angular.module('omnibrokerApp', []);

omnibrokerApp.controller('ServiceListCtrl', function ($scope) {
  $scope.services = [
    {'name': 'Service 1',
     'description': 'A service.'},
    {'name': 'Service 2',
     'description': 'A cooler service.'},
    {'name': 'Service 3',
     'description': 'The coolest service.'}
  ];
  
  $scope.addService = function() {
	alert("Hello!");  
  };
});