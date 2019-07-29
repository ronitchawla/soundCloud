package com.example.android.musiccloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("What Do you mean","Justin Bieber"));
        songs.add(new Song("Bailando","Enrique"));
        songs.add(new Song("Where are you now","Justin Bieber"));
        songs.add(new Song("Do you know","Zara Larson"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Hello","Adale"));
        songs.add(new Song("Let me love you","Justin Bieber"));
        songs.add(new Song("Miselto","Justin Bieber"));
        SongAdapter adapter=new SongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.album_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i= position and l=id;
                //Song song = songs.get(i);

                Intent intent = new Intent(AlbumActivity.this,MediaActivity.class);
                startActivity(intent);


            }

        });
    }
}
