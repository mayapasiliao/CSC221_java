package com.company;

import java.util.Comparator;

public class sortByDirector implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        boolean item1IsVideo = item1 instanceof Video;
        boolean item2IsVideo = item2 instanceof Video;

        if(item1IsVideo && item2IsVideo) {
            return ((Video) item1).getDirector().compareTo(((Video) item2).getDirector());
        }

        return 0;
    }
}
