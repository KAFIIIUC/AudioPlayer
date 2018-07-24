package com.kafi.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay,btnPause,btnStop;
    MediaPlayer mediaPlayer;
    boolean playing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.taray_taray);

        btnPlay = (Button) findViewById(R.id.btn_play);
        btnPause = (Button) findViewById(R.id.btn_puse);
        btnStop = (Button) findViewById(R.id.btn_stop);


        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.taray_taray);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!playing){

                    mediaPlayer.start();
                    playing = true;
                }

            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playing){
                    mediaPlayer.pause();
                    playing = false;
                }

            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playing){
                    mediaPlayer.stop();
                    playing = false;
                    finish();
                }

            }
        });
    }


 /*   public void play(View view){
        mediaPlayer.start();
    }

    public void pause(View view){
        mediaPlayer.pause();
    }

    public  void stop(View view){
        mediaPlayer.stop();
    }*/
}
