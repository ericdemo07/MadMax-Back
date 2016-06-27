(function() {
	'use strict';
	angular.module('app').factory('QueryService', QueryService);
	QueryService.$inject = [ '$http', '$location'];

	function QueryService($http, $location) 
	{
		var service = {};
		service.Display = Display;
		var url = "/login";
		var product = new Array();
		return service;
		
		function Display(query) 
		{
			console.log("Hi Till now I am fine");
			var request = $http({
				method : "post",
				url : "/api/display",
				data : query	
			});
			return request.then(handleSuccess, handleError('Faliure'));
		}
		function handleSuccess(data) 
		{
			product = data.data;
			console.log(product[0]);
			console.log(product[0].price);
			return product;
		}
		function handleError(error) {
			return function() {
				return {
					success : false,
					message : error
				};
			};
		}
	}
})();
