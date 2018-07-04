//var exec = require('cordova/exec');

exports.GetDeviceAdmin = function(Success,error){
	cordova.exec(function(DeviceAdmin){
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


gda(a,b){
exec(a)
exec(b)


}