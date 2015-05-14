package org.android.share.utils.example;

import org.android.share.utils.activity.QuickBaseActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


/**
 * App的入口Activity.
 * 
 * @author Jack Tony
 * @date 2015/5/10
 * 
 * @author kale
 * @date 2015/5/11
 * 
 * @author <a href="http://blog.csdn.net/lmj623565791">Hongyang</a>
 * @date 2015/5/14
 */
public class MainActivity extends QuickBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getContentViewId() {
        return 0;
    }

    @Override
    protected void findViews() {

    }

    @Override
    protected void beforeSetViews() {

    }

    @Override
    protected void setViews() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
