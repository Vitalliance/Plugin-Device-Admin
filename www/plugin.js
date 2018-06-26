
Plugin.Admin = function(){
  var onSuccess = function(data){
  	console.log(data);
  	return data;
  };
  var onFail = function(){};
  cordova.exec(onSuccess, onFail, 'AdminPlugin', 'Admin');
};
module.exports = DeviceAdmin;