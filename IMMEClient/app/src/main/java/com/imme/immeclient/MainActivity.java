package com.imme.immeclient;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.readystatesoftware.systembartint.SystemBarTintManager;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Intent intents = new Intent("com.imme.immeclient.AccountActivity");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
            toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
            toolbar.getLayoutParams().height = toolbar.getLayoutParams().height + getStatusBarHeight();
        }

        // Start Font

        Typeface tf1 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv1 = (TextView) findViewById(R.id.main_balance);
        tv1.setTypeface(tf1);

        Typeface tf2 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv2 = (TextView) findViewById(R.id.main_rp);
        tv2.setTypeface(tf2);

        Typeface tf3 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaBQ-Light.otf");
        TextView tv3 = (TextView) findViewById(R.id.main_balance_value);
        tv3.setTypeface(tf3);

        Typeface tf4 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv4 = (TextView) findViewById(R.id.main_last_transaction);
        tv4.setTypeface(tf4);

        Typeface tf5 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv5 = (TextView) findViewById(R.id.main_history_features1);
        tv5.setTypeface(tf5);

        Typeface tf6 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv6 = (TextView) findViewById(R.id.main_history_features2);
        tv6.setTypeface(tf6);

        Typeface tf7 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv7 = (TextView) findViewById(R.id.main_history_features3);
        tv7.setTypeface(tf7);

        Typeface tf8 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv8 = (TextView) findViewById(R.id.main_history_name1);
        tv8.setTypeface(tf8);

        Typeface tf9 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv9 = (TextView) findViewById(R.id.main_history_name2);
        tv9.setTypeface(tf9);

        Typeface tf10 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv10 = (TextView) findViewById(R.id.main_history_name3);
        tv10.setTypeface(tf10);

        Typeface tf11 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv11 = (TextView) findViewById(R.id.main_history_total1);
        tv11.setTypeface(tf11);

        Typeface tf12 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv12 = (TextView) findViewById(R.id.main_history_total2);
        tv12.setTypeface(tf12);

        Typeface tf13 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv13 = (TextView) findViewById(R.id.main_history_total3);
        tv13.setTypeface(tf13);

        Typeface tf14 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv14 = (TextView) findViewById(R.id.main_history_date1);
        tv14.setTypeface(tf14);

        Typeface tf15 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv15 = (TextView) findViewById(R.id.main_history_date2);
        tv15.setTypeface(tf15);

        Typeface tf16 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv16 = (TextView) findViewById(R.id.main_history_date3);
        tv16.setTypeface(tf16);

        Typeface tf17 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv17 = (TextView) findViewById(R.id.main_hello);
        tv17.setTypeface(tf17);

        Typeface tf18 = Typeface.createFromAsset(getAssets(),
                "fonts/HelveticaNeue-Light.otf");
        TextView tv18 = (TextView) findViewById(R.id.main_what_do_you_need);
        tv18.setTypeface(tf18);

        // Close Font

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.mipmap.imme_logo);

        startActivity(new Intent(MainActivity.this, WelcomeScreen.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        // enable status bar tint
        tintManager.setStatusBarTintEnabled(true);
        // enable navigation bar tint
        tintManager.setNavigationBarTintEnabled(true);
        // set a custom tint color for all system bars
        tintManager.setTintColor(Color.parseColor("#FF03B0FF"));
        // set a custom navigation bar resource
        //tintManager.setNavigationBarTintResource(R.drawable.bg_item_selected_drawable);
        // set a custom status bar drawable
        //tintManager.setStatusBarTintDrawable();


        ImageButton send_pay = (ImageButton) findViewById(R.id.send_pay);
        send_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.imme.immeclient.SendPayActivity");
                startActivity(intent);
            }
        });

        ImageButton receive = (ImageButton) findViewById(R.id.receive);
        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.imme.immeclient.ReceiveActivity");
                startActivity(intent);
            }
        });

        ImageButton topup = (ImageButton) findViewById(R.id.topup);
        topup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.imme.immeclient.Send_pay_details");
                startActivity(intent);
            }
        });

        LinearLayout last_transaction_1 = (LinearLayout) findViewById(R.id.last_transaction_1);
        last_transaction_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "PT. Lazada E-Commerce (-Rp300.000)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        LinearLayout last_transaction_2 = (LinearLayout) findViewById(R.id.last_transaction_2);
        last_transaction_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Dhuta Pratama (Rp240.000)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        LinearLayout last_transaction_3 = (LinearLayout) findViewById(R.id.last_transaction_3);
        last_transaction_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Indomaret (-Rp27.400)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_user_agreement) {
            Intent intent = new Intent("com.imme.immeclient.UserAgreementActivity");
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_privacy_policy) {
            Intent intent = new Intent("com.imme.immeclient.PrivacyPolicyActivity");
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_help_support) {
            Intent intent = new Intent("com.imme.immeclient.HelpAndSupportActivity");
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_feedback) {
            Intent intent = new Intent("com.imme.immeclient.FeedbackActivity");
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_gift) {
            Intent intent = new Intent("com.imme.immeclient.GiftActivity");
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_account) {
            startActivity(this.intents);
        } else if (id == R.id.nav_transaction_history) {
            Intent intent = new Intent("com.imme.immeclient.TransactionHistoryActivity");
            startActivity(intent);
        } else if (id == R.id.nav_security_setting) {
            Intent intent = new Intent("com.imme.immeclient.SecuritySettingActivity");
            startActivity(intent);
        } else if (id == R.id.nav_recipient_list) {
            Intent intent = new Intent("com.imme.immeclient.RecipientListActivity");
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Share And Get Free Money");
            alertDialog.setMessage("Your Member Code is : aab23453");
            alertDialog.setIcon(R.drawable.pay_icon);
            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // here you can add functions
                }
            });
            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // here you can add functions
                }
            });

            alertDialog.setNeutralButton("NETRAL", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // here you can add functions
                }
            });
            alertDialog.show();
        } else if (id == R.id.nav_about) {
            Intent intent = new Intent("com.imme.immeclient.AboutActivity");
            startActivity(intent);
        } else if (id == R.id.nav_exit) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}

/**
 AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
 alertDialog.setTitle("Reset...");
 alertDialog.setMessage("Are you sure?");
 alertDialog.setIcon(R.drawable.pay_icon);
 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
 public void onClick(DialogInterface dialog, int which) {
 // here you can add functions
 }
 });
 alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
 public void onClick(DialogInterface dialog, int which) {
 // here you can add functions
 }
 });

 alertDialog.setNeutralButton("NETRAL", new DialogInterface.OnClickListener() {
 public void onClick(DialogInterface dialog, int which) {
 // here you can add functions
 }
 });
 alertDialog.show();
 */