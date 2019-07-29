package com.example.android.musiccloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        final ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("What Do you mean","Justin Bieber",R.drawable.justin));
        songs.add(new Song("What Do you mean","Enrique Iglsis",R.drawable.enrique));
        songs.add(new Song("What Do you mean","Selena Gomez",R.drawable.selena));
        songs.add(new Song("What Do you mean","Zara Larson",R.drawable.zara));
        songs.add(new Song("What Do you mean","Akcent",R.drawable.akcent));
        songs.add(new Song("What Do you mean","Pitbull",R.drawable.pitbull));

        ArtistAdapter adapter=new ArtistAdapter(this,songs);
        GridView listView = (GridView) findViewById(R.id.artist_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // i= position and l=id;
                Song song = songs.get(i);
                int img = song.getImageResourceId();
                if( img == R.drawable.justin)
                {
                    Intent intent = new Intent(ArtistActivity.this,JustinActivity.class);
                    startActivity(intent);
                }
                if( img == R.drawable.enrique)
                {
                    Intent intent = new Intent(ArtistActivity.this,EnriqueActivity.class);
                    startActivity(intent);
                }if( img == R.drawable.selena)
                {
                    Intent intent = new Intent(ArtistActivity.this,SelenaActivity.class);
                    startActivity(intent);
                }if( img == R.drawable.zara)
                {
                    Intent intent = new Intent(ArtistActivity.this,ZaraActivity.class);
                    startActivity(intent);
                }if( img == R.drawable.akcent)
                {
                    Intent intent = new Intent(ArtistActivity.this,AkcentActivity.class);
                    startActivity(intent);
                }if( img == R.drawable.pitbull)
                {
                    Intent intent = new Intent(ArtistActivity.this,PitbullActivity.class);
                    startActivity(intent);
                }
            }

        });



    }

}
