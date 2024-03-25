package org.dsa.mathematics;

public class SieveOfSundaram {
    public static void main(String[] args) {
        sieveOfSundaram(100);
    }

    public static void sieveOfSundaram(int n) {

        int len = (n - 1) / 2;
        boolean[] arr = new boolean[len + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = i; (i + j + (2 * i * j)) <= len; j++) {
                arr[i + j + (2 * i * j)] = true;
            }
        }

        for (int j = 1; j <= len; j++) {
            if (!arr[j]) {
                System.out.print(((2 * j) + 1) + " ");
            }
        }
    }
}
