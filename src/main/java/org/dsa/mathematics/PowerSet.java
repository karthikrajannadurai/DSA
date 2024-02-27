package org.dsa.mathematics;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        int strLength = str.length();
        int twoPower = 1 << strLength;
        for (int i = 0; i < twoPower; i++) {
            for (int j = 0; j < strLength; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.printf("%c", str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
