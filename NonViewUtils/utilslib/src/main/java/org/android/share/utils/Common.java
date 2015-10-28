package org.android.share.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.util.Base64;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by
 * Author: wswenyue
 * Email: wswenyue@163.com
 * Date: 2015/10/28
 * GitHub: https://github.com/wswenyue
 */

/**
 * 通用的工具类、放一些常用的工具
 */
public final class Common {
    /**
     * 对给定的字符串返回唯一的标记字符串<br>
     * 主要应用于网络url的标记，将url转换映射成唯一的标识字符串<br>
     * 写法参考Volley中的写法<br>
     *
     * @param str 需要转换的字符串
     * @return 返回唯一的标识
     */
    public static String toHash(String str) {
        String ret = null;
        if (str != null && str.length() > 0) {
            int len = str.length();
            String part1 = str.substring(0, len / 2).hashCode() + "";
            String part2 = str.substring(len / 2).hashCode() + "";
            ret = part1 + part2;
        }
        return ret;
    }

    /**
     * 对数据（字节）进行Base64编码
     *
     * @param data 要编码的数据（字节数组）
     * @return 返回编码后的字符串
     */
    public static String Base64Encode(byte[] data) {
        String ret = null;
        if (data != null && data.length > 0) {
            ret = Base64.encodeToString(data, Base64.NO_WRAP);
        }
        return ret;
    }

    /**
     * 对Base64编码后的数据进行还原
     *
     * @param data 使用Base64编码过的数据
     * @return 返回还原后的数据（字节数组）
     */
    public static byte[] Base64Decode(String data) {
        byte[] ret = null;
        if (data != null && data.length() > 0) {
            ret = Base64.decode(data, Base64.NO_WRAP);
        }
        return ret;
    }

    /**
     * 使用MD5获取数据的摘要信息
     *
     * @param data 数据
     * @return 摘要信息
     */
    public static String toMD5(byte[] data) {
        String ret = null;
        try {
            byte[] digest = MessageDigest.getInstance("md5").digest(data);
            ret = Base64Encode(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * 打开或关闭WIFI
     *
     * @param mContext Context
     * @param action   打开使用on 关闭使用off
     */
    public static void onWifi(Context mContext, String action) {
        WifiManager wm = ((WifiManager) mContext
                .getSystemService(Context.WIFI_SERVICE));
        if (action.toLowerCase().equalsIgnoreCase("on")) {
            if (!wm.isWifiEnabled()) {
                wm.setWifiEnabled(true);
            }
        }

        if (action.toLowerCase().equalsIgnoreCase("off")) {
            if (wm.isWifiEnabled()) {
                wm.setWifiEnabled(false);
            }
        }
    }

    /**
     * 隐藏键盘
     *
     * @param mContext
     * @param v
     */
    public static void hideKeyboard(Context mContext, View v) {
        InputMethodManager imm = (InputMethodManager) mContext
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }


}
