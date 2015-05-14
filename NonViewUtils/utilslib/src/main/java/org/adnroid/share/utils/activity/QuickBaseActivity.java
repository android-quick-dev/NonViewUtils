package org.adnroid.share.utils.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * 快速开发的activity框架.
 * @author Jack Tony<br>
 * @date 2015/4/25
 */
public abstract class QuickBaseActivity extends Activity {

    protected String TAG = getClass().getSimpleName();

    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        beforeSetContentView();
        if (getContentViewId() != 0) {
            setContentView(getContentViewId());
        }
        findViews();
        beforeSetViews();
        setViews();
    }

    /**
     * 在setContentView之前触发的方法
     */
    protected void beforeSetContentView() {

    }

    /**
     * 如果没有布局，那么就返回0
     *
     * @return activity的布局文件
     */
    protected abstract int getContentViewId();

    /**
     * 找到所有的views
     */
    protected abstract void findViews();

    /**
     * 在这里初始化设置view的各种资源，比如适配器或各种变量
     */
    protected abstract void beforeSetViews();

    /**
     * 设置所有的view
     */
    protected abstract void setViews();


    /**
     * 通过泛型来简化findViewById
     */
    protected final <E extends View> E getView(int id) {
        try {
            return (E) findViewById(id);
        } catch (ClassCastException ex) {
            Log.e(TAG, "Could not cast View to concrete class.", ex);
            throw ex;
        }
    }

}
