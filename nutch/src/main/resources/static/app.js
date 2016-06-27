(function () 
	{
		angular
		.module('app', ['ngRoute','ngResource'])
		.config(config);

		config.$inject = ['$routeProvider'];
		function config($routeProvider) 
		{
			$routeProvider
			.when('/home', 
			{
				controller: 'HomeController',
				templateUrl: 'home/home.view.html',
				controllerAs: 'vm'
			})
			.when('/login', 
			{
				controller: 'LoginController',
				templateUrl: 'login/login.view.html',
				controllerAs: 'vm'
			})
			.when('/search', 
			{
				controller: 'SearchController',
				templateUrl: 'search/search.view.html',
				controllerAs: 'vm'
			})
			.when('/display/:keyWord', 
			{
				controller: 'DisplayController',
				templateUrl: 'display/display.view.html',
				controllerAs: 'vm'
			})
			.otherwise({ redirectTo: '/search' });
		}
	}
)();