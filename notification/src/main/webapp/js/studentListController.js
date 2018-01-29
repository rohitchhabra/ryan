
App.controller('studentListController', function($scope,$http,$location) {
		
	$scope.url =   p.URL+"/student/getAll";
	$http({
	    method: 'GET',
	    url: $scope.url,
	}).then(function successCallback(response) {
		console.log(response);
		if(response.data.responseCode==101){
			$scope.list = response.data.studentDtoList;
		}else{
			alert("failure")
		}
	}, function errorCallback(response) {
		alert("Some thing went wrong pls try again later")
	});
	
	
	$scope.studentList=function(){
		$location.path("/students");
	}	
	
	$scope.registerStudent=function(){
		$location.path("/register");
	}
	
	$scope.sendMail = function(){

	$scope.url = p.URL+"/forgotPassword";
	$scope.request = {
			"user": {
				"emailAddress": $("#email").val()//$scope.email,
			}
		}
	$http({ 
			method: 'POST',
		    url: $scope.url,
		    data: $scope.request
		    }).then(function successCallback(response) {
				console.log(response);
				if(response.data.resultCode==1){
					alert("password is reset and send over mail")
					$location.path("/login")
				}else if(response.data.resultCode==102){
					alert(response.data.resultDesc)
					//$location.path("/login")
				}else {
					alert("failure")
				}
			}, function errorCallback(response) {
				alert("error")
			});
		
	}
	});
