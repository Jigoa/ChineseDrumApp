package com.example.steventran.chinesedrumsapp;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DrumActivity extends Activity {
    MediaPlayer sidesound0;
    MediaPlayer sidesound1;
    MediaPlayer sidesound2;

    MediaPlayer bigsound0;
    MediaPlayer bigsound1;
    MediaPlayer bigsound2;

    MediaPlayer smallsound0;
    MediaPlayer smallsound1;
    MediaPlayer smallsound2;

    MediaPlayer mediumsound0;
    MediaPlayer mediumsound1;
    MediaPlayer mediumsound2;

    MediaPlayer sticksound0;
    MediaPlayer sticksound1;
    MediaPlayer sticksound2;

    int counterBig = 1;
    int counterSmall = 1;
    int counterMedium = 1;
    int counterSide = 1;
    int counterSticks = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum);


        sidesound0 = MediaPlayer.create(this, R.raw.side_big_sound);
        sidesound1 = MediaPlayer.create(this, R.raw.side_big_sound);
        sidesound2 = MediaPlayer.create(this, R.raw.side_big_sound);

        bigsound0 = MediaPlayer.create(this, R.raw.big_drum_sound);
        bigsound1 = MediaPlayer.create(this, R.raw.big_drum_sound);
        bigsound2 = MediaPlayer.create(this, R.raw.big_drum_sound);

        mediumsound0 = MediaPlayer.create(this, R.raw.medium_drum_sound);
        mediumsound1 = MediaPlayer.create(this, R.raw.medium_drum_sound);
        mediumsound2 = MediaPlayer.create(this, R.raw.medium_drum_sound);

        smallsound0 = MediaPlayer.create(this, R.raw.small_drum_sound);
        smallsound1 = MediaPlayer.create(this, R.raw.small_drum_sound);
        smallsound2 = MediaPlayer.create(this, R.raw.small_drum_sound);


    }

    public void sideS(View view) {
        if(counterSide == 1) {
            sidesound0.start();
            sidesound0.seekTo(10);
            counterSide = 2;
        }else if (counterSide == 2){
            sidesound1.start();
            sidesound1.seekTo(10);
            counterSide = 3;
        }else{
            sidesound2.start();
            sidesound2.start();
            counterSide = 1;
        }
    }


    public void bigS(View view) {
        if (counterBig == 1) {
            bigsound0.start();
            bigsound0.seekTo(10);
            counterBig = 2;
        } else if (counterBig == 2){
            bigsound1.start();
            bigsound1.seekTo(10);
            counterBig = 3;
        }else{
            bigsound2.start();
            bigsound2.seekTo(10);
            counterBig = 1;
        }

    }

    public void mediumS(View view) {
        if(counterMedium == 1) {
            mediumsound0.start();
            mediumsound0.seekTo(10);
            counterMedium = 2;
        }else if (counterMedium == 2){
            mediumsound1.start();
            mediumsound1.seekTo(10);
            counterMedium = 3;
        }else{
            mediumsound2.start();
            mediumsound2.start();
            counterMedium = 1;
        }
    }

    public void smallS(View view) {
        if(counterSmall == 1) {
            smallsound0.start();
            smallsound0.seekTo(10);
            counterSmall = 2;
        }else if (counterSmall == 2){
            smallsound1.start();
            smallsound1.seekTo(10);
            counterSmall = 3;
        }else{
            smallsound2.start();
            smallsound2.start();
            counterSmall = 1;
        }

    }

}