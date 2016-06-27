(function() {
	'use strict';
	angular.module('app').controller('DisplayController', DisplayController);
	DisplayController.$inject = [ '$location', 'QueryService', '$scope',
			'$route', '$routeParams', '$stateParams', '$state' ];

	function DisplayController($location, QueryService, $scope, $routeParams,
			$route, $stateParams, $state) {
		var vm = this;
		vm.display = display;
		vm.displayProduct = displayProduct;

		var product = new Array();
		var productName;
		var productType;
		var keyWord = $stateParams.param1;
		console.log(keyWord);

		QueryService.Display(keyWord).then(function(response) {
			product = response;
			if (product.length > 1) {
				$scope.products = product;
			} else {
				vm.dataLoading = false;
			}
		});
		// if required to be called from html
		function display() {
			vm.dataLoading = true;
			QueryService.Display().then(function(response, $routeParams) {
				product = response;
				if (product.length > 1) {
					$scope.products = product;
				} else {
					vm.dataLoading = false;
				}
			});
		}
		var url;
		function displayProduct(productClicked) {
			productType = productClicked.productType;
			productName = productClicked.productName;
			console.log("Product Id : " + productName);
			console.log("Product Id : " + product.price);
			vm.dataLoading = true;
			$state.go('displayProduct', {
				productType : productType,
				productName : productName
			});
		}
	}
})();
