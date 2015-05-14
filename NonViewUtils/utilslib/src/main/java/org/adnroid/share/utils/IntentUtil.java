package org.adnroid.share.utils;

import android.content.Intent;

/**
 * @author Jack Tony
 * @date 2015/4/24
 */
public class IntentUtil {

    /**
     * 判断intent和它的bundle是否为空
     * 
     * @param intent
     * @return
     */
    public static boolean isBundleEmpty(Intent intent) {
        return (intent == null) && (intent.getExtras() == null);
    }
}
