package com.example.android.musiccloud;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // intent with on click listner for music

        /*LinearLayout openMusic=(LinearLayout) findViewById(R.id.musicOpen);
        openMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MusicActivity.class);
                startActivity(i);

            }
        });*/
    }


    public void openMusic(View v)
    {
        Intent i = new Intent(this,MusicActivity.class);
        startActivity(i);
    }
    public void openArtist(View v)
    {
        Intent i = new Intent(this,ArtistActivity.class);
        startActivity(i);
    }
    public void openMusicPlayer(View v)
    {
        Intent i = new Intent(this,MediaActivity.class);
        startActivity(i);
    }
    public void openAlbum(View v)
    {
        Intent i = new Intent(this,AlbumActivity.class);
        startActivity(i);
    }

}
