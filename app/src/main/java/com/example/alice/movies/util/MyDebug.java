package com.example.alice.movies.util;

import android.util.Log;

/**
 * Created by alice on 3/2/18.
 */

class MyDebug {

    private final static String APP_HEADER = "MOTB_";
    public static boolean debug = true;
    public static String DebugLog = "";
    private static final int MAX_LOG_LINES = 10;

    public static void LOGW(final String tag, String message){
        if (debug){
            Log.w(APP_HEADER + tag, message);
        }

        updateLogHolder(tag,message);

    }

    public static void LOGD(final String tag, String message){
        if (debug) {
            Log.d(APP_HEADER + tag, message);
        }

        updateLogHolder(tag,message);

    }


    public static void LOGE(final String tag, String message) {
        if (debug) {
            Log.e(APP_HEADER + tag, message);
        }
        else {
            Log.e(APP_HEADER + tag, message);
        }
        updateLogHolder(tag,message);
    }

    public static void LOGE(final String tag, String message, Throwable tr) {
        //noinspection PointlessBooleanExpression,ConstantConditions
        if (debug) {
            Log.e(APP_HEADER + tag, message, tr);
        }
        updateLogHolder(tag,message);
    }

    public static void LOGI(final String tag, String message) {
        if (debug) {
            Log.i(APP_HEADER + tag, message);
        }
        updateLogHolder(tag,message);
    }

    public static void LOGV(final String tag, String message) {
        if (debug) {
            Log.v(APP_HEADER + tag, message);
        }
        updateLogHolder(tag,message);
    }

    private static void updateLogHolder(String tag, String message) {

        String[] lines = DebugLog.split("\r\n|\r|\n");
        if (debug) {
            Log.v(APP_HEADER + tag,message);
        }

        updateLogHolder(tag,message);
    }


}
