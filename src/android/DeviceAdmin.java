package com.example.cordova.DeviceAdmin;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;

 
public class DeviceAdmin extends CordovaPlugin {
 
 @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if("Admin".equals(action)){
      callbackContext.success(this.DeviceAdminSample() ? 1 : 0);
      return true;;
    } else {
      callbackContext.error("DeviceAdminSample ."+action+" not found !");
      return false;
    }
  }


 
  protected boolean DeviceAdminSample(){

    int adb = Settings.Secure.getInt(this.getContentResolver(),
              Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);

    if (adb != 0) 
      return true;
    else
      return false;

  }
}   