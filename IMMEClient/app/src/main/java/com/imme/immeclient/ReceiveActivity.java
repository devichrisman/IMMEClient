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
        Typeface hnLight = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        Typeface hbqLight = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaBQ-Light.otf");
 
        TextView text_receive_enter_amount = (TextView) findViewById(R.id.receive_enter_amount);
        text_receive_enter_amount.setTypeface(hnLight);

        TextView text_receive_rp = (TextView) findViewById(R.id.receive_rp);
        text_receive_rp.setTypeface(hnLight);

        TextView text_receive_balance_value = (TextView) findViewById(R.id.receive_balance_value);
        text_receive_balance_value.setTypeface(hbqLight);

        TextView text_receiver_list_text = (TextView) findViewById(R.id.receiver_list_text);
        text_receiver_list_text.setTypeface(hnLight);

        TextView text_receiver_continue = (TextView) findViewById(R.id.receiver_continue);
        text_receiver_continue.setTypeface(hnLight);
        // Close Font


        final Button button = (Button) findViewById(R.id.receiver_continue);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent("com.imme.immeclient.ReceiveQRCodeActivity");
                startActivity(intent);
            }
        });

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
