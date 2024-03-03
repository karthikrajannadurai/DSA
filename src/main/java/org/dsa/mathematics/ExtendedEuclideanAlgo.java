package org.dsa.mathematics;

public class ExtendedEuclideanAlgo {
    public static void main(String[] args) {
        for (int a : extendedEuclidean(1180, 482)) {
            System.out.println(a);
        }
    }

    public static int[] extendedEuclidean(int a, int b) {
        if (a == 0) {
            return new int[]{b, 0, 1};
        }
        int[] result = extendedEuclidean(b % a, a);
        int gcd = result[0], x1 = result[1], y1 = result[2];
        int x = y1 - (b / a) * x1;
        int y = x1;
        return new int[]{gcd, x, y};
    }
}
