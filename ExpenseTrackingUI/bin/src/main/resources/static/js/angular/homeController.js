

var etApp=angular.module("etApp",[ 'ngMaterial', 'ngMessages', 'material.svgAssetsCache']);

etApp.controller('homeController',['$scope','$log','$rootScope','homeService','$timeout','$q','$http',function($scope,$log,$rootScope,homeService,$timeout,$q, $http){
	//debugger;
	console.log("homeController");
	//$scope.expense={}
	$scope.cropid="";
	$scope.getCall=function($scope){
		console.log("shodjfpsdf");
		homeService.logouterror(function(data){
			
		}).success(function(result)
				{
			 
			 console.log("result" + JSON.stringify(result));
			 
			 

			}); 
		}
		
	
	$scope.submitData=function(expense){
		
		console.log("Received Data "+ JSON.stringify(expense))
		console.log("submit button called");
	}
$scope.addNewCrop=function(crop){
		
		console.log("Received Data "+ JSON.stringify(crop))
		$scope.cropid="Testid";
		console.log("submit button called");
//		self.isDisabled =true;
		self.repos.push(crop);
		self.repos=loadAll();
		
		console.log(self.repos);
//		self.simulateQuery = true;
	}

	var self = this;

	self.simulateQuery = false;
	self.isDisabled    = false;
	self.crops         = loadAll();
	debugger;
	self.querySearch   = querySearch;
	self.selectedItemChange = selectedItemChange;
	self.searchTextChange   = searchTextChange;

	// ******************************
	// Internal methods
	// ******************************

	/**
	 * Search for repos... use $timeout to simulate
	 * remote dataservice call.
	 */
	function querySearch (query) {
		console.log("querySearch "+ query);
		var results = query ? self.crops.filter( createFilterFor(query) ) : self.crops,
				deferred;
		if (self.simulateQuery) {
			console.log("simulateQuery "+ self.simulateQuery);
			deferred = $q.defer();
			$timeout(function () { deferred.resolve( results ); }, Math.random() * 1000, false);
			return deferred.promise;
		} else {
			console.log("simulateQuery "+ self.simulateQuery +" result "+results);
			return results;
		}
	}

	function searchTextChange(text) {
//		$log.info('Text changed to ' + text);
		console.log("Text changed to" + JSON.stringify(text));
	}

	function selectedItemChange(item) {
//		$log.info('Item changed to ' + JSON.stringify(item));
		if(item == null)
			{
			$scope.cropid=""
			}else
		$scope.cropid=item.cropid;
		console.log('Item changed to ' + JSON.stringify(item));
	}

	/**
	 * Build `components` list of key/value pairs
	 */

	/*$scope.loadAll=function () {
	var crops =  [
		{
				'name'      : 'AngularJS',
				'url'       : 'https://github.com/angular/angular.js',
				'watchers'  : '3,623',
				'forks'     : '16,175',
			},
			{
				'name'      : 'ejpwe',
				'url'       : 'https://github.com/angular/angular',
				'watchers'  : '469',
				'forks'     : '760',
			},
			{
				'name'      : 'AngularJS Material',
				'url'       : 'https://github.com/angular/material',
				'watchers'  : '727',
				'forks'     : '1,241',
			},
			{
				'name'      : 'ad349 Material',
				'url'       : 'https://github.com/angular/material2',
				'watchers'  : '727',
				'forks'     : '1,241',
			},
			{
				'name'      : '1234 Material',
				'url'       : 'https://github.com/angular/bower-material',
				'watchers'  : '42',
				'forks'     : '84',
			},
			{
				'name'      : 'Material Start',
				'url'       : 'https://github.com/angular/material-start',
				'watchers'  : '81',
				'forks'     : '303',
			}
			];
		
			$http({
			method: 'GET',
			
			url: '/Crop/getAllCropInfo',
				
		}).then(function success(response) {
			
			console.log("Client JSON response   "+JSON.stringify(response.data));
			repos=response.data.data;
//			$scope.size=response.data.size;
			console.log(repos);
			
		}, function error(response) {
			
			console.log("error:: "+response)
			// this function will be called when the request returned error status
			
		});
//		console.log(crops)
		return crops.map( function (repo) {
			console.log(repo)
			repo.value = repo.name.toLowerCase();
			console.log(repo);
			return repo;
		});
	};
*/
	
	function loadAll() {
		var repos = [];
		$http({
			method: 'GET',
			
			url: 'localhost:7878/Crop/getAllCropInfo',
				
		}).then(function success(response) {
			
			console.log("Client JSON response   "+JSON.stringify(response.data));
			repos=response.data.data;
//			$scope.size=response.data.size;
			console.log(repos);
			
		}, function error(response) {
			
			console.log("error:: "+response)
			// this function will be called when the request returned error status
			
		});
		return repos.map( function (crop) {
			repo.cropName = crop.cropName.toLowerCase();
		
			return repo;
		});
	}
	/**
	 * Create filter function for a query string
	 */
	function createFilterFor(query) {
		var lowercaseQuery = query.toLowerCase();
		console.log("create Filter for:"+query)

		return function filterFn(item) {
			console.log("create Filter for: item: "+JSON.stringify(item) +" cond"+item.value.indexOf(lowercaseQuery))
			return (item.value.indexOf(lowercaseQuery) === 0);
		};

	}
/*
var self = this;

self.simulateQuery = false;
self.isDisabled    = false;

self.repos         = loadAll();
self.querySearch   = querySearch;
self.selectedItemChange = selectedItemChange;
self.searchTextChange   = searchTextChange;

// ******************************
// Internal methods
// ******************************

*//**
 * Search for repos... use $timeout to simulate
 * remote dataservice call.
 *//*
function querySearch (query) {
	console.log("querySearch "+ query);
	var results = query ? self.repos.filter( createFilterFor(query) ) : self.repos,
			deferred;
	if (self.simulateQuery) {
		console.log("simulateQuery "+ self.simulateQuery);
		deferred = $q.defer();
		$timeout(function () { deferred.resolve( results ); }, Math.random() * 1000, false);
		return deferred.promise;
	} else {
		console.log("simulateQuery "+ self.simulateQuery +" result "+results);
		return results;
	}
}

function searchTextChange(text) {
//	$log.info('Text changed to ' + text);
	console.log("Text changed to" + JSON.stringify(text));
}

function selectedItemChange(item) {
//	$log.info('Item changed to ' + JSON.stringify(item));
	if(item == null)
		{
		$scope.cropid=""
		}else
	$scope.cropid=item.url;
	console.log('Item changed to ' + JSON.stringify(item));
}

*//**
 * Build `components` list of key/value pairs
 *//*
function loadAll() {
	var crops = [
		{
			'name'      : 'AngularJS',
			'url'       : 'https://github.com/angular/angular.js',
			'watchers'  : '3,623',
			'forks'     : '16,175',
		},
		{
			'name'      : 'ejpwe',
			'url'       : 'https://github.com/angular/angular',
			'watchers'  : '469',
			'forks'     : '760',
		},
		{
			'name'      : 'AngularJS Material',
			'url'       : 'https://github.com/angular/material',
			'watchers'  : '727',
			'forks'     : '1,241',
		},
		{
			'name'      : 'ad349 Material',
			'url'       : 'https://github.com/angular/material2',
			'watchers'  : '727',
			'forks'     : '1,241',
		},
		{
			'name'      : '1234 Material',
			'url'       : 'https://github.com/angular/bower-material',
			'watchers'  : '42',
			'forks'     : '84',
		},
		{
			'name'      : 'Material Start',
			'url'       : 'https://github.com/angular/material-start',
			'watchers'  : '81',
			'forks'     : '303',
		}
		];
	console.log(crops)
	return crops.map( function (crop) {
		console.log(crop)
		crop.value = crop.name.toLowerCase();
		console.log(crop)
		return crop;
	});
}*/

/*
function loadAll() {
	var repos = 
	$http({
		method: 'GET',
		
		url: 'localhost:7878/Crop/getAllCropInfo',
			
	}).then(function success(response) {
		
		console.log("Client JSON response   "+JSON.stringify(response.data));
		repos=response.data.data;
//		$scope.size=response.data.size;
		console.log(repos);
		
	}, function error(response) {
		
		console.log("error:: "+response)
		// this function will be called when the request returned error status
		
	});
	return repos.map( function (crop) {
		repo.cropName = crop.cropName.toLowerCase();
	
		return repo;
	});
}*/
/**
 * Create filter function for a query string
 *//*
function createFilterFor(query) {
	var lowercaseQuery = query.toLowerCase();
	console.log("create Filter for:"+query)

	return function filterFn(item) {
		console.log("create Filter for: item: "+JSON.stringify(item) +" cond"+item.value.indexOf(lowercaseQuery))
		return (item.value.indexOf(lowercaseQuery) === 0);
	};

}*/
	
}]);
allowCrossDomain = function(req, res, next) {
	  res.header('Access-Control-Allow-Origin', '*');
	  res.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE,OPTIONS');
	  res.header('Access-Control-Allow-Headers', 'Content-Type, Authorization, Content-Length, X-Requested-With');
	  if ('OPTIONS' === req.method) {
	    res.send(200);
	  } else {
	    next();
	  }
	};

	etApp.use(allowCrossDomain);
etApp.factory('homeService',homeService);