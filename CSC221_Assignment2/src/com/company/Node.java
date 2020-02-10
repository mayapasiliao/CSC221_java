package com.company;

public class Node {
    Node up;
    Node down;
    int prob;

    Node(int a) {
        this.up = null;
        this.down = null;
        this.prob = a;
    }
}
