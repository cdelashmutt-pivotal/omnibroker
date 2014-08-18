var omnibrokerControllers = angular.module('omnibrokerControllers', []);

omnibrokerControllers.controller('ServiceListCtrl', ['$scope', 'Service', function ($scope, Service) {
  var services = Service.query(function(){
	  if(services && services._embedded && services._embedded.service)
	  $scope.services = services._embedded.service;
  });

  $scope.addService = function() {
	alert("Hello!");  
  };
}]);