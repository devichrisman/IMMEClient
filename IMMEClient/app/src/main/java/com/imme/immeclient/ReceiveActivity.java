package com.imme.immeclient;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.readystatesoftware.systembartint.SystemBarTintManager;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        // enable status bar tint
        tintManager.setStatusBarTintEnabled(true);
        // enable navigation bar tint
        tintManager.setNavigationBarTintEnabled(true);
        // set a custom tint color for all system bars
        tintManager.setTintColor(Color.parseColor("#FF03B0FF"));

        // Start Font

        Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv1 = (TextView) findViewById(R.id.receive_enter_amount);
        tv1.setTypeface(tf1);

        Typeface tf2 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv2 = (TextView) findViewById(R.id.receive_rp);
        tv2.setTypeface(tf2);

        Typeface tf3 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaBQ-Light.otf");
        TextView tv3 = (TextView) findViewById(R.id.receive_balance_value);
        tv3.setTypeface(tf3);

        Typeface tf4 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv4 = (TextView) findViewById(R.id.receiver_list_text);
        tv4.setTypeface(tf4);

        Typeface tf5 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv5 = (TextView) findViewById(R.id.receiver_continue);
        tv5.setTypeface(tf5);

        Typeface tf6 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv6 = (TextView) findViewById(R.id.receive_enter_amount);
        tv6.setTypeface(tf6);

        // Close Font
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
