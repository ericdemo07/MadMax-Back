(function() {
	'use strict';
	angular.module('app').controller('SearchController', SearchController);
	SearchController.$inject = [ '$location', '$routeParams', '$route',
			'$state', '$stateParams' ];
	function SearchController($location, $routeParams, $route, $state,
			$stateParams) {
		var vm = this;
		vm.search = search;
		var keyWord;
		var url = '/search';
		function search() {
			keyWord = vm.query;
			if (!keyWord) {
				keyWord = "blank";
			} else {
				keyWord = keyWord;
			}
			console.log(vm);
			console.log(keyWord);
			vm.dataLoading = true;
			$state.go('display', {
				param1 : keyWord
			});
		}
		;
	}
})();
