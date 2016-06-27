(function() {
	angular.module('app',
			[ 'ui.router', 'ngRoute', 'ngResource', 'ngSanitize' ]).config(
			config);

	config.$inject = [ '$stateProvider', '$urlRouterProvider',
			'$routeProvider', '$sceProvider' ];
	function config($stateProvider, $urlRouterProvider, $routeProvider,
			$sceProvider) {
		$sceProvider.enabled(false);
		// $urlRouterProvider.otherwise('/search');
		$stateProvider
				.state('/home', {
					controller : 'HomeController',
					templateUrl : 'home/home.view.html',
					controllerAs : 'vm'
				})
				.state(
						'displayProduct',
						{
							url : '/displayProduct',
							params : {
								'productType' : 'some default',
								'productName' : 'some default'
							},
							views : {
								'' : {
									templateUrl : 'displayProduct/displayProduct.view.html',
									controller : 'DisplayProductController',
									controllerAs : 'vm'
								},
								'check@displayProduct' : {
									template : 'Look I am a column!'
								},
								'specs@displayProduct' : {
									templateUrl : 'displayProduct/specs/headPhoneSpecs.view.html',
								}
							}
						}).state('search', {
					url : '/search',
					templateUrl : 'search/search.view.html',
					controller : 'SearchController',
					controllerAs : 'vm'
				}).state('display', {
					url : '/display?param1',
					controller : 'DisplayController',
					templateUrl : 'display/display.view.html',
					controllerAs : 'vm'
				});
	}
})();