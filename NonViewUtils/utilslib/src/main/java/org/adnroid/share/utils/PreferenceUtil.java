package org.adnroid.share.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author:Jack Tony
 * 优先推荐用spUtil
 * @see "http://www.cnblogs.com/tianzhijiexian/p/4466047.html"
 * @date :2014-10-8
 */
@Deprecated
public class PreferenceUtil {

    private static PreferenceUtil instance;

    private SharedPreferences mSharedPreferences;

    private SharedPreferences.Editor editor;

    private PreferenceUtil(Context mContext, String preferenceName) {
        mSharedPreferences = mContext.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        editor = mSharedPreferences.edit();
    }

    public static PreferenceUtil getInstance(Context context, String preferenceName) {
        if (instance == null) {
            synchronized (PreferenceUtil.class) {
                if (instance == null) {
                    // 使用双重同步锁
                    instance = new PreferenceUtil(context, preferenceName);
                }
            }
        }
        return instance;
    }

    public static PreferenceUtil getInstance(Context context) {
        return getInstance(context, context.getPackageName() + "_preferences");
    }

    /**
     * 得到SharedPreferences.Editor，如果之后的操作强烈依赖于存入的数据
     * 那么请用editor的commit方法进行提交。
     */
    public SharedPreferences.Editor getEditor() {
        return editor;
    }

    /////// String ////////

    public void putStringByApply(String key, String value) {
        editor.putString(key, value).apply();
    }

    public void putStringByCommit(String key, String value) {
        editor.putString(key, value).commit();
    }

    public String getString(String key, String defValue) {
        return mSharedPreferences.getString(key, defValue);
    }

    /////// int ////////

    public void putIntByApply(String key, int value) {
        editor.putInt(key, value).apply();
    }

    public void putIntByCommit(String key, int value) {
        editor.putInt(key, value).commit();
    }

    public int getInt(String key, int defValue) {
        return mSharedPreferences.getInt(key, defValue);
    }

    /////// boolean ////////

    public void putBooleanByApply(String key, boolean value) {
        editor.putBoolean(key, value).apply();
    }

    public void putBooleanByCommit(String key, boolean value) {
        editor.putBoolean(key, value).commit();
    }

    public boolean getBoolean(String key, boolean defValue) {
        return mSharedPreferences.getBoolean(key, defValue);
    }

    /////// long ////////

    public void putLongByApply(String key, long value) {
        editor.putLong(key, value).apply();
    }

    public void putLongByCommit(String key, long value) {
        editor.putLong(key, value).commit();
    }

    public long getLong(String key, long defValue) {
        return mSharedPreferences.getLong(key, defValue);
    }

    /////// remove ////////

    public void removeByApply(String key) {
        editor.remove(key).apply();
    }

    public void removeByCommit(String key) {
        editor.remove(key).commit();
    }

    /////// clear ////////

    public void clearByApply() {
        editor.clear().apply();
    }

    public void clearByCommit() {
        editor.clear().commit();
    }

}
