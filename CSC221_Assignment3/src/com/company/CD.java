package com.company;

import java.util.Date;

public class CD extends MultiMediaItem {
    private String artist;

    CD(String id, String title, Date addedOn, int playingTime, String artist) {
        super(id, title, addedOn, playingTime);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public int compareTo(CD o) {
        return this.getArtist().compareTo(o.getArtist());
    }
}
