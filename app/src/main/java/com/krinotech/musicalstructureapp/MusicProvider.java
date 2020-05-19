package com.krinotech.musicalstructureapp;

import java.util.ArrayList;
import java.util.List;

public class MusicProvider {
    public static final String MUSIC_NAME = "Music ";
    public static final String ARTIST_NAME_ONE = "Artist One";
    public static final String ARTIST_NAME_TWO = "Artist Two";
    public static final String ARTIST_NAME_THREE = "Artist Three";

    public static List<Music> provideMusic() {
        List<Music> music = new ArrayList<>();
        for(int index = 0; index < 100; index++) {
            Music song;
            if(index % 10 == 0) {
                song = new Music(index, ARTIST_NAME_ONE, MUSIC_NAME + index);
            }
            else if(index % 2 == 0) {
                song = new Music(index, ARTIST_NAME_TWO, MUSIC_NAME + index);
            }
            else {
                song = new Music(index, ARTIST_NAME_THREE, MUSIC_NAME + index);
            }
            music.add(song);
        }
        return music;
    }
}
