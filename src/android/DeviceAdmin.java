package com.example.cordova.DeviceAdmin;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.Preference.OnPreferenceChangeListener;
import android.provider.Settings;
 
public class DeviceAdmin extends CordovaPlugin {
 
 
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if("Admin".equals(action)){
      callbackContext.success(this.DeviceAdminSample() ? 1 : 0);
      return true;;
    } else {
      callbackContext.error("DeviceAdminSample ."+action+" not found !");
      return false;
    }
  }


 
  public  boolean DeviceAdminSample(){

    int adb = Settings.Secure.getInt(this.getContentResolver(),
              Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);

    if (adb != 0) 
      return true;
    else
      return false;

  }
}   