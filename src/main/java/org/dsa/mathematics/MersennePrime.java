package org.dsa.mathematics;

public class MersennePrime {
    public static void main(String[] args) {

        mersennePrime(100);
    }

    public static void mersennePrime(int n) {

        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]) {
                for (int j = i + i; j <= n; j = j + i) {
                    if (j % i == 0) {
                        arr[j] = true;
                    }
                }
            }
        }
        for (int i = 3; ((1 << (i - 1)) - 1) <= n; i++) {
//            if (!arr[i] && (1 << (int) (Math.log10(i + 1) / Math.log10(2))) == i+1) {
//                System.out.print(i + " ");
//            }
            if (!arr[(1 << (i - 1)) - 1]) {
                System.out.print((1 << (i - 1)) - 1 + " ");
            }
        }
    }
}
