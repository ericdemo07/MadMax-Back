(function() 
	{
		'use strict';
		angular.module('app').controller('SearchController', SearchController);
		SearchController.$inject = [ '$location','$routeParams','$route'];
		function SearchController($location,$routeParams,$route) 
		{
			var vm = this;
			vm.search = search;
			var keyWord;
			var url = '/search';
			function search() 
			{
				keyWord=vm.query;
				console.log(keyWord);
				url = '/display/'+keyWord;
				console.log(url);
				vm.dataLoading = true;
				$location.path(url);
			};
		}
	}
)();
