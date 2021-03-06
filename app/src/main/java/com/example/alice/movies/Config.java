package com.example.alice.movies;

import android.os.Build;

import com.example.alice.movies.util.MyDebug;

import java.util.TimeZone;

/**
 * Created by alice on 3/5/18.
 */

public class Config {

    public final static String TAG = "Config";
    public final static boolean DEBUG = false;

    public static final String BOOTSTRAP_DATA_TIMESTAMP = "Wen, 29 March 2017 00:42:42 GMT";

    public static final TimeZone EXHIBIT_TIMEZONE = TimeZone.getTimeZone("Kenya/Nairobi");

    public static boolean isCustomRom() {
        if(DEBUG) MyDebug.LOGD(TAG, "Build=" + Build.DISPLAY.toLowerCase() + "  isCustomRom=" + Build.DISPLAY.toLowerCase().contains("motb"));
        return Build.DISPLAY.toLowerCase().contains("motb");
    }
}
