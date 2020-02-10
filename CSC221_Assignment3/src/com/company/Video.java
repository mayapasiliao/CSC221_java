package com.company;

import java.util.Date;

public class Video extends MultiMediaItem{
    private String director;

    Video(String id, String title, Date addedOn, int playingTime, String director) {
        super(id, title, addedOn, playingTime);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    /*public int compareTo(CD o) {
        return this.getDirector().compareTo(o.getDirector());
    }*/
}
