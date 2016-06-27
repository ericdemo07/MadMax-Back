(function() {
	'use strict';
	angular.module('app').factory('QueryService', QueryService);
	QueryService.$inject = [ '$http', '$location' ];
	function QueryService($http, $location) {
		var service = {};
		service.Display = Display;
		service.DisplayProduct = DisplayProduct;
		var url = "/login";
		var product = new Array();
		return service;
		function Display(query) {
			var request = $http({
				method : "post",
				url : "/api/display",
				data : query
			});
			return request.then(handleSuccess, handleError('Faliure'));
		}
		function DisplayProduct(productClicked) {
			console.log("Hi I will now dispaly product");
			var request = $http({
				method : "post",
				url : "/api/displayProduct",
				data : productClicked
			});
			return request.then(handleSuccess, handleError('Faliure'));
		}
		function handleSuccess(data) {
			product = data.data;
			console.log(product[0]);
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
