//管理
app.service("userService",function($http){

    this.regist=function(entity){
			return $http.post("../user/regist",entity);
	};
	
	this.sendSms=function (phone) {
		return $http.get("../sms/sendSms?phone="+phone);
    }
});
