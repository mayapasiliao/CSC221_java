package com.company;

import java.util.Date;

public abstract class MultiMediaItem extends Item {
    private int playingTime; // Playing time in seconds

    MultiMediaItem(String id, String title, Date addedOn, int playingTime) {
        super(id, title, addedOn);
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }
}
