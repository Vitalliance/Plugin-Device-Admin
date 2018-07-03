package com.example.cordova.DeviceAdmin;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;

 
public class DeviceAdmin extends CordovaPlugin {
 
 private Context mContext = null;

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if("Admin".equals(action)){
      callbackContext.success(this.DeviceAdminSample() ? 1 : 0);
      return true;;
    } else {
      callbackContext.error("DeviceAdminSample ."+action+" not found !");
      return false;
    }
  }

 
  public boolean DeviceAdminSample(){

    int adb = Settings.Secure.getInt(mContext.getContentResolver(),
              Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);

    if (adb != 0) 
      return true;
    else
      return false;

  }
}   