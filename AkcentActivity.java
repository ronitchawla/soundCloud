package com.example.android.musiccloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AkcentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akcent);
        ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("i am here","Akcent"));
        songs.add(new Song("what is this","Akcent"));
        songs.add(new Song("hey","Akcent"));
        songs.add(new Song("apple","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));
        songs.add(new Song("Passion","Akcent"));



        SongAdapter adapter=new SongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.akcent_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i= position and l=id;
                //Song song = songs.get(i);

                Intent intent = new Intent(AkcentActivity.this,MediaActivity.class);
                startActivity(intent);


            }

        });
    }
}
