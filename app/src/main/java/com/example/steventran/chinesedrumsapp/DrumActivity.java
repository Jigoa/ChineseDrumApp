package com.example.steventran.chinesedrumsapp;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class DrumActivity extends Activity {
    ArrayList<MediaPlayer> bigList = new ArrayList<MediaPlayer>();
    ArrayList<MediaPlayer> smallList = new ArrayList<MediaPlayer>();
    ArrayList<MediaPlayer> mediumList = new ArrayList<MediaPlayer>();
    ArrayList<MediaPlayer> sideList = new ArrayList<MediaPlayer>();
    ArrayList<MediaPlayer> sticksList = new ArrayList<MediaPlayer>();

    int counterBig = 0;
    int counterSmall = 0;
    int counterMedium = 0;
    int counterSide = 0;
    int counterSticks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum);

        for (int i = 0; i<3; i++){
            MediaPlayer bigsound = MediaPlayer.create(this, R.raw.big_drum_sound);
            bigList.add(i, bigsound);
        }

        for(int i = 0;i<3;i++){
            MediaPlayer sidesound = MediaPlayer.create(this, R.raw.side_big_sound);
            sideList.add(i,sidesound);
        }

        for(int i = 0;i<3;i++){
            MediaPlayer mediumsound = MediaPlayer.create(this, R.raw.medium_drum_sound);
            mediumList.add(i,mediumsound);
        }

        for(int i = 0;i<3;i++){
            MediaPlayer smallsound = MediaPlayer.create(this, R.raw.small_drum_sound);
            smallList.add(i,smallsound);
        }

        for(int i = 0;i<2;i++){
            MediaPlayer stickssound = MediaPlayer.create(this, R.raw.sticks_sound);
            sticksList.add(i,stickssound);
        }

    }

    public void sideS(View view) {
        sideList.get(counterSide).start();
        sideList.get(counterSide).seekTo(100);
        counterSide++;
        if (counterSide == 3){
            counterSide = 0;
        }
    }


    public void bigS(View view) {
        bigList.get(counterBig).start();
        bigList.get(counterBig).seekTo(100);
        counterBig++;
        if (counterBig == 3){
            counterBig = 0;
        }
    }

    public void mediumS(View view) {
        mediumList.get(counterMedium).start();
        mediumList.get(counterMedium).seekTo(100);
        counterMedium++;
        if (counterMedium == 3){
            counterMedium = 0;
        }
    }

    public void smallS(View view) {
        smallList.get(counterSmall).start();
        smallList.get(counterSmall).seekTo(100);
        counterSmall++;
        if (counterSmall==3){
            counterSmall=0;
        }
    }



    public void sticksS(View view){
        sticksList.get(counterSticks).start();
        sticksList.get(counterSticks).seekTo(100);
        counterSticks++;
        if(counterSticks== 2){
            counterSticks = 0;
        }
    }


}