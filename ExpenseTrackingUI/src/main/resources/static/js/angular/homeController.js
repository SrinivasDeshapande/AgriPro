var etApp = angular.module("etApp",[ ]);

etApp.controller('homeController',['$scope',function($scope){
	console.log("homeController");
	
	$scope.getCall=function($scope){
		console.log("shodjfpsdf");
	};
	
	$scope.submitData=function($scope){
		
		console.log("submit button called");
	}
}]);