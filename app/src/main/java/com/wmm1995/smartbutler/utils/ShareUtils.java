package com.wmm1995.smartbutler.utils;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Administrator on 2017/2/10.
 */

public class ShareUtils {

    public static final String NAME = "config";

    public static void putBoolean(Context mContext, String key, boolean value) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static boolean getBoolean(Context mContext, String key, boolean defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

}
