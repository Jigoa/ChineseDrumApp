package com.example.steventran.chinesedrumsapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DrumActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum);

        //Side Sound
        Button side = (Button) this.findViewById(R.id.sidedrumbutton);
        final MediaPlayer sidesound = MediaPlayer.create(this, R.raw.side_big_sound);
        side.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                sidesound.start();
            }
        });

        //big drum sound
        Button big = (Button) this.findViewById(R.id.bigdrumbutton);
        final MediaPlayer bigsound = MediaPlayer.create(this, R.raw.big_drum_sound);
        side.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                bigsound.start();
            }
        });

        //medium drum sound
        Button medium = (Button) this.findViewById(R.id.mediumdrumbuttonbutton);
        final MediaPlayer mediumsound = MediaPlayer.create(this, R.raw.medium_drum_sound);
        side.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mediumsound.start();
            }
        });

        //small drum sound
        Button small = (Button) this.findViewById(R.id.smalldrumbutton);
        final MediaPlayer smallsound = MediaPlayer.create(this, R.raw.small_drum_sound);
        side.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                smallsound.start();
            }
        });

    }


}
