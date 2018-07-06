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

var GetDeviceAdmin = function(successCallback, errorCallback) {

setTimeout(function() {
    successCallback = function(result) {
        successCallback(result);
        alert(result);
    };
    errorCallback = function(error) {
        errorCallback(error);
    }
     exec(successCallback,
        errorCallback, 'DeviceAdmin', 'Admin', []);
   }, 300);
}

module.exports = GetDeviceAdmin;