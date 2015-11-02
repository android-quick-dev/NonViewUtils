package org.android.share.utils;

/**
 * Created by
 * Author: wswenyue
 * Email: wswenyue@163.com
 * Date: 2015/10/28
 * GitHub: https://github.com/wswenyue
 */

import android.util.Log;

/**
 * Log日志的统一管理类
 */
public final class L {
    private L() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    // 是否需要打印bug，在App的debug版本里会打印日志，而在release则不会，使用Gradle自动管理
    public static final boolean isDebug = BuildConfig.DEBUG;

    private static final String TAG = "Log";

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (isDebug)
            Log.i(TAG, msg);
    }

    public static void d(String msg) {
        if (isDebug)
            Log.d(TAG, msg);
    }

    public static void e(String msg) {
        if (isDebug)
            Log.e(TAG, msg);
    }

    public static void v(String msg) {
        if (isDebug)
            Log.v(TAG, msg);
    }

    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (isDebug)
            Log.i(tag, msg);
    }
}
