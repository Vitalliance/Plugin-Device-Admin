var exec = require('cordova/exec');

exports.GetDeviceAdmin = function(Success,error){
	exec(function(DeviceAdmin){
		Success(!!DeviceAdmin);
	},error,"DeviceAdmin","Admin",[]);
};


// Plugin.Admin = function(){
//   var onSuccess = function(data){
//   	console.log(data);
//   	return data;
//   };
//   var onFail = function(){};
//   cordova.exec(onSuccess, onFail, 'DeviceAdmin', 'Admin',[]);
// };
// module.exports = DeviceAdmin;