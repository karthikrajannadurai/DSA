package org.dsa.mathematics;

public class JugglerSequence {
    public static void main(String[] args) {
        sequence(11);
    }

    public static void sequence(int n) {

        double sqrt;
        System.out.printf("%d ", n);
        while (n != 1) {
            sqrt = Math.sqrt(n);
            if ((n & 1) == 1) {
                n = (int) Math.floor(sqrt * sqrt * sqrt);
            } else {
                n = (int) Math.floor(sqrt);
            }
            System.out.printf("%d ", n);
        }
    }
}
