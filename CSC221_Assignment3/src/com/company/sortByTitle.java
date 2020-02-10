package com.company;

import java.util.Comparator;

public class sortByTitle implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getTitle().compareTo(item2.getTitle());
    }
}
