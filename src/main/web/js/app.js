var omnibrokerApp = angular.module('omnibrokerApp', [ 'ngRoute',
		'omnibrokerControllers', 'omnibrokerServices' ]);

omnibrokerApp.config(function($routeProvider) {

	$routeProvider.when('/', {
		templateUrl : 'views/serviceList.html',
		controller : 'ServiceListCtrl'
	}).otherwise({
		redirectTo : '/'
	});

});