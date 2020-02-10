package com.company;

public final class BinomialTreeFactory {
    public static Node create(int T, int P) {
        if(T == 0) {
            return null;
        }

        else {
            Node rootNode = new Node(P);

            rootNode.up = create(T - 1, P);
            rootNode.down = create(T - 1, P);

            return rootNode;
        }
    }
}
