package com.example.cordova.DeviceAdmin;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog;
 
public class DeviceAdmin extends CordovaPlugin {
 
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if("Admin".equals(action)){
      callbackContext.success(DeviceAdminSample());
      return true;;
    } else {
      callbackContext.error("DeviceAdminSample ."+action+" not found !");
      return false;
    }
  }
 
  private int DeviceAdminSample(){

  int adb = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
  
  return adb;
  }
}   