package com.company;

import java.util.Comparator;

public class sortByAuthor implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        boolean item1IsTextbook = item1 instanceof Textbook;
        boolean item2IsTextbook = item2 instanceof Textbook;

        if(item1IsTextbook && item2IsTextbook) {
            return ((Textbook) item1).getAuthor().compareTo(((Textbook) item2).getAuthor());
        }

        return 0;
    }
}
