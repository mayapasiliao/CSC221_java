package com.company;

import java.util.Date;

public class Textbook extends Item {
    private String author;

    Textbook(String id, String title, Date addedOn, String author) {
        super(id, title, addedOn);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public int compareTo(Textbook o) {
        return this.getAuthor().compareTo(o.getAuthor());
    }
}
