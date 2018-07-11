package com.vitalliance.nagoraapp.plugin;

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
import android.util.Log;


public class DeviceAdmin extends CordovaPlugin {

    private  static Context mContext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("DebugDevice".equals(action)) {

            //this.SettingsEnabledPlugin(callbackContext);

            JSONObject json = new JSONObject().put("DEVELOPMENT_SETTINGS_ENABLED", 1);

            callbackContext.success(json);
            
            // PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, json);
            // pluginResult.setKeepCallback(true);
            // if (adb != null ) {

            // } else
            //  callbackContext.error("DeviceAdminSample : Adb is null or undefined !");
            return true;
        } else {
            callbackContext.error("DeviceAdminSample ." + action + " not found !");
            return false;
        }
    }

    private void SettingsEnabledPlugin(CallbackContext callbackContext) {

        //int adb = Settings.Global.getInt(mContext.getContentResolver(),Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0) != 0;
        //Log.i("----------------> DeviceAdminSample: ", Integer.toString(adb));
        callbackContext.success(1);
    }

}
