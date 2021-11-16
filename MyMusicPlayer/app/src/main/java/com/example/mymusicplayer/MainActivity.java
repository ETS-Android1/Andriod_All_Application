package com.example.mymusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button PlayMusic;
   private MediaPlayer mediaPlayer;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.khairiyat);

        PlayMusic=findViewById(R.id.btn);
        PlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseMusic();
                playMusic();
            }
        });


    }
    public  void pauseMusic(){
        if(mediaPlayer!=null){
            mediaPlayer.pause();
           PlayMusic.setText("play");
        }
    }

    public void playMusic(){
        if(mediaPlayer!=null){
            mediaPlayer.start();
            PlayMusic.setText("Pause");
        }
    }
}
