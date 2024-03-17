package org.dsa.mathematics;

public class FindSumOfModuloK {
    public static void main(String[] args) {
        sum(10, 2);
        sumMethod2(10, 2);
    }

    public static void sumMethod2(int n, int k) {
        int p = n % k;
//        System.out.println((n / k) * ((0.5 * k * k) - (0.5 * k) + 0.5 * p * (p + 1)));
        System.out.println((n / k) * ((0.5 * k * k) - (0.5 * k)) + (0.5 * p * p) + (0.5 * p));
    }

    public static void sum(int n, int k) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += (i % k);
        }
        System.out.println(count);
    }
}
