
Plugin.Admin = function(){
  var onSuccess = function(data){
  	return data;
  };
  var onFail = function(){};
  cordova.exec(onSuccess, onFail, 'AlertPlugin', 'Admin');
};
module.exports = AlertTest;