package com.nsrosell.apps.yousave;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntro2Fragment;

public class IntroActivity extends AppIntro2 {

    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPref=getSharedPreferences("YouSave",MODE_PRIVATE);
        addSlide(AppIntro2Fragment.newInstance("Welcome to YouSave",
                "YouSave contains all tools for social media like Instagram and WhatsApp",
                R.mipmap.ic_launcher_round, getResources().getColor(R.color.black)));
        addSlide(AppIntro2Fragment.newInstance("WhatsApp Status Saver",
                "Never ever ask for status from your friends any more, We will get it for you ",
                R.mipmap.whatsapp_splash, getResources().getColor(R.color.black)));
        addSlide(AppIntro2Fragment.newInstance("Instagram Posts Downloader",
                "All you need for downloading the post is it's link from the Instagram App",
                R.mipmap.insta_large, getResources().getColor(R.color.black)));
        addSlide(AppIntro2Fragment.newInstance("Youtube Video Downloader",
                "Download videos from your favourite creators in your own format",
                R.mipmap.youtube, getResources().getColor(R.color.black)));
        addSlide(AppIntro2Fragment.newInstance("Stay Tuned",
                "Extra tools will be available in every new releases",
                R.mipmap.ic_launcher_round, getResources().getColor(R.color.black)));

        showSkipButton(false);

    }

    @Override
    public void onDonePressed() {
        super.onDonePressed();
        sharedPref.edit().putBoolean("firstRun",false).apply();
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
