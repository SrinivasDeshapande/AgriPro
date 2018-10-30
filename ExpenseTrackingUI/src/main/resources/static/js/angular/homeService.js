var homeService = function homeService($http,$rootScope){
	return {
		logout: function(){
			console.log("homeservice");
			return $http({
				method : 'GET',
				url : '/Crop/getAllCropInfo.htm',
			});
		}, 
}};