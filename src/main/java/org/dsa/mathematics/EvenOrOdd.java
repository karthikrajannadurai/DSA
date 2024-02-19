package org.dsa.mathematics;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(21));
    }

    static String evenOrOdd(int n) {
        if ((n & 1) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }
}
