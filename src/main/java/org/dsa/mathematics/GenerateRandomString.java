package org.dsa.mathematics;

import java.util.Random;

public class GenerateRandomString {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char ch = (char) (97 + (random.nextFloat() * 26));
            System.out.print(ch + " ");
        }
    }
}
