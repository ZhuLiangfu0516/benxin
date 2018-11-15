//管理
app.controller('userController',function($scope,userService){

	$scope.regist=function(){
		if($scope.entity.password1 !=$scope.entity.password2){
			alert("两次输入的密码不一致,请重新输入");
            $scope.entity.password1 ="";
            $scope.entity.password2 ="";
		}else {
            $scope.entity.password = $scope.entity.password1;
            userService.regist($scope.entity).success(
                function(request){
                    if(request.flag==true){
                        alert(request.message);
                        window.location.href="http://localhost:8080/login.html";
                    }else {
                        alert(request.message);
                        window.location.href="http://localhost:8080/register.html";
                    }
                    //$scope.entity=response;
                }
            );
		}
	};

	$scope.sendSms=function () {
		userService.sendSms($scope.entity.username).success(
			function (request) {
			    if(request==true){
                    alert("验证码已发送");
                }else{
                    alert("短信发送失败,请重试")
                }
            }
		)
    }
});
