package org.dsa.mathematics;

public class SuperPrime {
    public static void main(String[] args) {
        superPrime(241);
    }

    public static void superPrime(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]) {
                for (int j = i + i; j <= n; j++) {
                    if (j % i == 0) {
                        arr[j] = true;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 2; i < arr.length; i++) {

            if (!arr[i]) {
                count++;
                if (!arr[count]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
