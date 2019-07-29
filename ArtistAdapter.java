package com.example.android.musiccloud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Song> {
    public ArtistAdapter(Context context, ArrayList<Song> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_artist, parent, false);
        }
        Song currentSong = getItem(position);
        ImageView icon=(ImageView) listItemView.findViewById(R.id.imageID);

                icon.setImageResource(currentSong.getImageResourceId());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artistNameID);
        numberTextView.setText(currentSong.getArtistName());



        return listItemView;


    }
}
