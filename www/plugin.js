var exec = cordova.require('cordova/exec');

// exports.GetDeviceAdmin = function(Success,error){
// 	cordova.exec(function(DeviceAdmin){
// 		//Success(DeviceAdmin);
// 		Success();
// 		alert("titi");
// 	},error,"DeviceAdmin","Admin",[]);
// };


// Plugin.GetDeviceAdmin = function(){
//   var onSuccess = function(){
//   	alert("titi");
//   };
//   var onFail = function(){};
//   cordova.exec(onSuccess, onFail, 'DeviceAdmin', 'Admin', []);
// };

// module.exports = Plugin;
var GetDeviceAdmin = {};

GetDeviceAdmin.Device = function(successCallback) {

     exec(successCallback,errorCallback, 'DeviceAdmin', 'DebugDevice', []);
};

module.exports = GetDeviceAdmin;