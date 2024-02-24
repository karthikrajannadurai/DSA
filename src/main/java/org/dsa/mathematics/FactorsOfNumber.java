package org.dsa.mathematics;

public class FactorsOfNumber {
    public static void main(String[] args) {
        factors(347);
        System.out.println();
        factorsUsingSquareRoot(347);
    }

    static void factors(int a) {

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.printf(i + " ");
            }
        }
    }

    static void factorsUsingSquareRoot(int a) {
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.printf(i + " " + a / i);

            }
        }
    }
}
