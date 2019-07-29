package com.example.android.musiccloud;

public class Song {
    private String songName;
    private String artistName;
    private int imageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int audioResourceId;
    public Song(String sn,String an)
    {
        songName=sn;
        artistName=an;
    }
    public Song(String sn,String an,int resouceId)
    {
        imageResourceId=resouceId;
        songName=sn;
        artistName=an;
    }
    public Song(String sn,String an,int resouceId,int audioId)
    {
        imageResourceId=resouceId;
        songName=sn;
        artistName=an;
        audioResourceId=audioId;
    }

    public int getAudioResourceId() { return audioResourceId; }
    public String getSongName()
    {
        return songName;
    }
    public String getArtistName()
    {
        return artistName;
    }
    public int getImageResourceId()
    {
        return imageResourceId;
    }
    public boolean hasImage()
    {
        if(imageResourceId!=-1)
            return true;
        else
            return false;
    }


}
