package org.dsa.mathematics;

public class FindTheNonNeighborFibonacciNumber {
    public static void main(String[] args) {
        neighbour(50);
    }

    public static int nearestFibonacci(int n) {
        int a = 1, b = 1, temp = 0;
        while (temp < n) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void neighbour(int n) {
        int g;
        while (n > 0) {
            g = nearestFibonacci(n);
            System.out.print(g + " ");
            n = n - g;
        }
    }
}
