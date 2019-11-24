package com.example.ÁfeoszSoundboard;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

MediaPlayer mySong;
MediaPlayer mySong2;
MediaPlayer mySong3;
MediaPlayer mySong4;
MediaPlayer mySong5;
MediaPlayer mySong6;
MediaPlayer mySong7;
MediaPlayer mySong8;




    ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1f1f1f")));


        mySong = MediaPlayer.create(MainActivity.this, R.raw.birka);
        mySong2 = MediaPlayer.create(MainActivity.this, R.raw.beka);
        mySong3 = MediaPlayer.create(MainActivity.this, R.raw.skraaaa);
        mySong4 = MediaPlayer.create(MainActivity.this, R.raw.tfutfutfu);
        mySong5 = MediaPlayer.create(MainActivity.this, R.raw.fitsufitsu);
        mySong6 = MediaPlayer.create(MainActivity.this, R.raw.coverme);
        mySong7 = MediaPlayer.create(MainActivity.this, R.raw.minekampf);
        mySong8 = MediaPlayer.create(MainActivity.this, R.raw.szilentdzsuajuajszexuaj);

    }
    public void playIT(View v){
    mySong.start();
    }
    public void playIT2(View v){
        mySong2.start();
    }
    public void playIT3(View v){
        mySong3.start();
    }
    public void playIT4(View v){
        mySong4.start();
    }
    public void playIT5(View v){
        mySong5.start();
    }
    public void playIT6(View v){
        mySong6.start();
    }
    public void playIT7(View v){
        mySong7.start();
    }
    public void playIT8(View v){
        mySong8.start();
    }
}

