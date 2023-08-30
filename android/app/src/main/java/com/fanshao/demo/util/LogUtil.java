package com.fanshao.demo.util;

import android.util.Log;

public class LogUtil {

    public static final String TAG = "TAG";

    public static void e(String message) {
        Log.e(TAG, "e: "+message);
    }
}
