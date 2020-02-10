package com.company;

import java.security.SecureRandom;

public class Navigator {
    void navigate(int N, Node rootNode) {
        SecureRandom random = new SecureRandom();
        Node temp = rootNode;
        int timePeriod;

        while(N > 0) {
            timePeriod = 1;
            while (rootNode != null) {
                System.out.println("TIME PERIOD = " + timePeriod++);

                int randomInt = random.nextInt(101);
                System.out.print("\trandomInt = " + randomInt + "\t");

                if (randomInt < rootNode.prob) {
                    rootNode = rootNode.up;
                    System.out.println("up\n");
                } else {
                    rootNode = rootNode.down;
                    System.out.println("down\n");
                }
            }

            rootNode = temp;
            N--;
        }
    }
}
