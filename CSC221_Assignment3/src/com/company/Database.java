package com.company;

import java.util.Date;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> item;

    Database() {
        item = new ArrayList<>();
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    void addItem(Item item) {
        this.item.add(item);
    }

    void list() {
        System.out.println("ID\t\tTitle\tDate\t\t\t\t\t\t\tPlaying Time\tAuthor/Director/Artist");

        for(Item current:item) {
            if(current instanceof Textbook) {
                System.out.println(current.getId() + "\t" + current.getTitle() + "\t" + current.getAddedOn() + "\t\t\t\t\t\t" + ((Textbook) current).getAuthor());
            }

            if(current instanceof CD) {
                System.out.println(current.getId() + "\t" + current.getTitle() + "\t\t" + current.getAddedOn() + "\t" + ((MultiMediaItem) current).getPlayingTime() + "\t\t\t\t" + ((CD) current).getArtist());
            }

            if(current instanceof Video) {
                System.out.println(current.getId() + "\t\t" + current.getTitle() + "\t" + current.getAddedOn() + "\t" + ((MultiMediaItem) current).getPlayingTime() + "\t\t\t\t" + ((Video) current).getDirector());
            }
        }
    }
}
