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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.PluginResult;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;


public class DeviceAdmin extends CordovaPlugin {

 private Context mContext = null;

 public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
  if ("DebugDevice".equals(action)) {

   int adb = Settings.Secure.getInt(mContext.getContentResolver(),
    Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0);

   JSONObject json = new JSONObject().put("DEVELOPMENT_SETTINGS_ENABLED", adb);

   PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, json);
   pluginResult.setKeepCallback(true);
   callbackContext.sendPluginResult(pluginResult);

   return true;
  } else {
   callbackContext.error("DeviceAdminSample ." + action + " not found !");
   return false;
  }
 }


}