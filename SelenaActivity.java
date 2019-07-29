package com.example.android.musiccloud;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SelenaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selena);
        ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));
        songs.add(new Song("Party on my mind","Selena"));


        SongAdapter adapter=new SongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.selena_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i= position and l=id;
                //Song song = songs.get(i);

                Intent intent = new Intent(SelenaActivity.this,MediaActivity.class);
                startActivity(intent);


            }

        });
    }
}
