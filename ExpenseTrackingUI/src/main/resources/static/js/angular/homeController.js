

var etApp=angular.module("etApp",[ 'ngMaterial', 'ngMessages', 'material.svgAssetsCache','ngResource']);

etApp.controller('homeController',['$scope','$log','$rootScope','homeService','$timeout','$q','$http','$resource',function($scope,$log,$rootScope,homeService,$timeout,$q, $http,$resource){
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
$scope.addNewExpenseType=function(expenseType){
		
		console.log("Received Data "+ JSON.stringify(expenseType))
		
		$http({
			method:"POST",
			url: "http://localhost:7878/Expense/insertExpenseType",
			data:
			{
			"expenseTypeName":expenseType.expenseTypeName,
			"creator_id":"1"
			}
		}).then(function(resp){
			console.log(JSON.stringify(resp.data));
			expenseType=resp.data;
		},function(err){
			console.log("error:" +JSON.stringify(err))
		});
		$scope.cropid=expenseType.typeId;
		console.log("submit button called");
//		self.isDisabled =true;
//		self.repos.push(expenseType);
		self.repos=loadAll();
		
		console.log(self.repos);
//		self.simulateQuery = true;
	}

	var self = this;

	self.simulateQuery = false;
	self.isDisabled    = false;
	self.crops         = loadAll();
//	debugger;
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
		$scope.cropid=item.typeId;
		console.log('Item changed to ' + JSON.stringify(item));
	}

	/**
	 * Build `components` list of key/value pairs
	 */


	
	function loadAll() {
		var repos = 
		
		$http.get("http://localhost:7878/Expense/getAllExpensesType").then(function(resp){
			console.log(JSON.stringify(resp.data));
			repos=resp.data;
			 repos.map( function (repo) {
				console.log("aa"+repo)
				repo.expenseTypeNameValue = repo.expenseTypeName.toLowerCase();
				console.log(repo)
				
				return repo;
			});
			 self.crops=repos;
		},function(err){
			console.log("error:" +JSON.stringify(err))
		})
//		console.log("Test :: "+t);
	}
	/**
	 * Create filter function for a query string
	 */
	function createFilterFor(query) {
		var lowercaseQuery = query.toLowerCase();
		console.log("create Filter for:"+query)

		return function filterFn(item) {
			console.log("create Filter for: item: "+JSON.stringify(item) +" cond"+item.expenseTypeNameValue.indexOf(lowercaseQuery))
			return (item.expenseTypeNameValue.indexOf(lowercaseQuery) === 0);
		};

	}


	
}]);
etApp.factory('homeService',homeService);

