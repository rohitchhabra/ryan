
App.controller('registerStudentController', function($scope,$http,$location) {
	/*$scope.url =   p.URL+"/student/getAll";
	$http({
	    method: 'GET',
	    url: $scope.url,
	}).then(function successCallback(response) {
		console.log(response);
		if(response.data.resultCode==101){
			$scope.productData = response.data.product;
		}else{
			alert("failure")
		}
	}, function errorCallback(response) {
		alert("Some thing went wrong pls try again later")
	});*/
	
	$scope.studentList=function(){
		$location.path("/students");
	}
	
	$scope.registerStudent=function(){
		$location.path("/register");
	}
	
	$scope.register=function(){
		
		$scope.email = $("#name").val();
		$scope.password = $("#password").val();

		$scope.request = 
		{
				//"id": 1,
				"name": $("#name").val(),
				"passportNumber": $("#passport").val(),
				"agentName": $("#agent").val(),
				"course": $("#course").val(),
				"numberOfSemesters": $("#number_of_sem").val(),
				"college": $("#college").val(),
				"city": $("#city").val(),
				"addressLine1": $("#add1").val(),
				"addressLine2": $("#add2").val(),
				"country":$("#country").val()
			}

	$scope.url =   p.URL+"/student/add";
		
		$http({
		    method: 'POST',
		    url: $scope.url,
		    data: $scope.request
		}).then(function successCallback(response) {
			console.log(response);
			if(response.data.responseCode==101){
				//alert("saved successfully")
				//window.location.reload();
				$location.path("/students");
			}else{
				alert(response.data.responseDesc);
			}
		}, function errorCallback(response) {
			alert("some thing went wrong pls try again later.")
		});

	}
	
	
	
	$scope.cancelBtn=function(){
		$location.path("/login");
	}
	
		});
