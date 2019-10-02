package com.nsrosell.apps.yousave;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class About extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/bold.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        setContentView(R.layout.activity_about);
    }

    public void openPlayStore(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://bit.ly/yousave.apk"));
        startActivity(i);

    }

    public void openWebsite(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://bit.ly/yousave.apk"));
        startActivity(i);

    }

    public void openInstagram(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.instagram.com/nanayawdedrick/"));
        startActivity(i);
    }



    public void openEmail(View view) {
        //Send email
        Intent email=new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,new String[]{"rassay31@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT,"Sent from Media Downloader v1.0.0 ("+ Build.BRAND+", "+Build.VERSION.SDK_INT+")");
        email.putExtra(Intent.EXTRA_TEXT,"");
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email,"Send mail using..."));

    }

}
