package com.krinotech.musicalstructureapp;

public class Music {

    private long id;

    private String artistName;
    private String musicName;

    public Music(long id, String artistName, String musicName) {
        this.id = id;
        this.artistName = artistName;
        this.musicName = musicName;
    }

    public long getId() {
        return id;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getMusicName() {
        return musicName;
    }
}
