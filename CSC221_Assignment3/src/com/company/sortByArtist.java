package com.company;

import java.util.Comparator;

public class sortByArtist implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        boolean item1IsCD = item1 instanceof CD;
        boolean item2IsCD = item2 instanceof CD;

        if(item1IsCD && item2IsCD) {
            return ((CD) item1).getArtist().compareTo(((CD) item2).getArtist());
        }

        return 0;
    }
}