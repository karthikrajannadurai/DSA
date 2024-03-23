package org.dsa.mathematics;

public class FibonacciSeries {

    public static long[] arrCache = new long[100];

    public static void main(String[] args) {
//        fibonacciLoop(50);
//        System.out.println();
//        System.out.println(fibonacciRecursion(50));
//        fibonacciSequenceWithGolderRatio(50);
        fibonacciSequenceLogn(14);
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

    static void fibonacciSequenceWithGolderRatio(int n) {

        int[] arr = new int[]{0, 1, 1, 2, 3, 5};
        for (int a : arr) {
            System.out.print(a + " ");
        }
        double temp = 5;
        for (int index = 5; index < n; index++) {
            temp = Math.round(temp * 1.6180339);
            System.out.print((int) temp + " ");
        }
    }

    static void fibonacciSequenceLogn(int n) {

        double a = (Math.sqrt(5) + 1) / 2;
        System.out.println(144 * Math.pow(a, n - 12));
    }
}
