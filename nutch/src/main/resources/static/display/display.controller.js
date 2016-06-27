(function() 
		{
			'use strict';
			angular.module('app').controller('DisplayController', DisplayController);
			DisplayController.$inject = [ '$location', 'QueryService','$scope','$routeParams'];
	
			function DisplayController($location, QueryService,$scope,$routeParams,$route) 
			{
				var vm = this;
				vm.display = display;
				var product = new Array();
		
				var keyWord  = $routeParams.keyWord;
				console.log(keyWord);
				
				QueryService.Display(keyWord).then(function(response) 
				{
					product = response;
					if (product.length >1) 
					{
						$scope.products=product;
					} 
					else 
					{
						vm.dataLoading = false;
					}
				});
				
				//if required to be called from html
				function display() 
				{
					vm.dataLoading = true;
					QueryService.Display().then(function(response,$routeParams) 
					{
						product = response;
						if (product.length >1) 
						{
							$scope.products=product;
						}
						else 
						{
							vm.dataLoading = false;
						}
					});
				}
			}
		}
)();
