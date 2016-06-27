(function() {
	'use strict';
	angular.module('app').controller('DisplayProductController',
			DisplayProductController);
	DisplayProductController.$inject = [ '$location', 'QueryService', '$scope',
			'$routeParams', '$stateParams', '$state' ];

	function DisplayProductController($location, QueryService, $scope,
			$routeParams, $route, $stateParams, $state) {
		var vm = this;
		console.log("hi");
		console.log(vm);
		var youtubeVideos = new Array();
		// need to be inspected why the value is coming out of params unlike
		// search controller
		var productType = $stateParams.params.paramType;
		var productClicked = $stateParams.params;
		console.log("I am in product display : " + productClicked);

		QueryService.DisplayProduct(productClicked).then(
				function(response, $stateProvider, $urlRouterProvider) {
					youtubeVideos = response;
					if (youtubeVideos.length > 1) {
						$scope.videos = youtubeVideos;
						$scope.quantity = 5;
					} else {
						vm.dataLoading = false;
					}
				});
	}
})();
