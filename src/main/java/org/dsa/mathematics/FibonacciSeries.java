package org.dsa.mathematics;

public class FibonacciSeries {

    public static long[] arrCache = new long[100];

    public static void main(String[] args) {
        fibonacciLoop(6);
        System.out.println();
        System.out.println(fibonacciRecursion(92));
    }

    static void fibonacciLoop(int n) {

        long a = 0, b = 1, temp = 0;
        System.out.printf("%d %d ", a, b);
        for (int i = 1; i < n - 1; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.printf(temp + " ");
        }
    }

    static long fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        if (arrCache[n] != 0) {
            return arrCache[n];
        }
        long nth = fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        arrCache[n] = nth;
        return nth;
    }
}
