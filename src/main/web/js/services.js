var omnibrokerServices = angular.module('omnibrokerServices', ['ngResource']);

omnibrokerServices.factory('Service', ['$resource',
  function($resource){
    return $resource('service', {}, {
      query: {method:'GET', isArray:false}
    });
  }]);