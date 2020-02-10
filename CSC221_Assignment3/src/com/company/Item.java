package com.company;

import java.util.Date;
import java.lang.Comparable;

public abstract class Item implements Comparable<Item> {
    private String id;
    private String title;
    private Date addedOn;

    Item(String id, String title, Date addedOn) {
        this.id = id;
        this.title = title;
        this.addedOn = addedOn;
    }

    String getId() {
        return this.id;
    }

    String getTitle() {
        return this.title;
    }

    Date getAddedOn() {
        return this.addedOn;
    }

    @Override
    public int compareTo(Item o) {
        return this.getId().compareTo(o.getId());
    }
}
