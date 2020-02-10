package com.company;

import java.util.Comparator;

public class sortByAddedOn implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getAddedOn().compareTo(item2.getAddedOn());
    }
}
