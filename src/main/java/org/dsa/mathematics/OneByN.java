package org.dsa.mathematics;

public class OneByN {
    public static void main(String[] args) {
        oneByN(7, 9);
    }

    public static void oneByN(int n, int len) {
        int initial = 1;
        for (int index = 0; index < len; index++) {
            initial *= 10;
            System.out.printf("%d", initial / n);
            initial = initial % n;
        }

    }
}
