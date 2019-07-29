package com.example.android.musiccloud;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        final ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("What Do you mean","Justin Bieber"));
        songs.add(new Song("Bailando","Enrique"));
        songs.add(new Song("Where are you now","Justin Bieber"));
        songs.add(new Song("Do you know","Zara Larson"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Hello","Adale"));
        songs.add(new Song("Let me love you","Justin Bieber"));
        songs.add(new Song("Miselto","Justin Bieber"));
        songs.add(new Song("Last Christmas","Wham"));
        songs.add(new Song("Candy Room","50 cent"));
        songs.add(new Song("Hotel room","Pitbull"));
        songs.add(new Song("Heartattack","Enrique"));
        songs.add(new Song("Do you know","Enrique"));
        songs.add(new Song("Ligth it up","Mazor Lazer"));
        songs.add(new Song("Lean on","Dj snake"));
        songs.add(new Song("Love yourself","Justin Bieber"));
        songs.add(new Song("Cold Water","Justin Bieber"));
        songs.add(new Song("Party in the USA","Miley cyrus"));
        songs.add(new Song("Closer","Chainsmokers"));
        songs.add(new Song("Panda","Kanya West"));
        songs.add(new Song("Mockinbird","Eminem"));
        songs.add(new Song("When is comes to you","Justin Bieber"));

        SongAdapter adapter=new SongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.music_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i= position and l=id;
                //Song song = songs.get(i);

                    Intent intent = new Intent(MusicActivity.this,MediaActivity.class);
                    startActivity(intent);


            }

        });





    }

}
