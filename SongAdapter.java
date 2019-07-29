package com.example.android.musiccloud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.songNAme);

        nameTextView.setText(currentSong.getSongName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artistName);
        numberTextView.setText(currentSong.getArtistName());



        return listItemView;


    }
}
