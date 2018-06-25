
Plugin.alert = function(content){
  var onSuccess = function(){};
  var onFail = function(){};
  cordova.exec(onSuccess, onFail, 'AlertPlugin', 'alert', [content]);
};