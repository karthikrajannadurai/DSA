package org.dsa.mathematics;

public class ExtendedEuclideanAlgo {
    public static void main(String[] args) {
        for (int a : extendedEuclidean(3, 11)) {
            System.out.println(a);
        }
        extendedEuclideanMethod2(11, 26);
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

    public static void extendedEuclideanMethod2(int i, int j) {

        int[] arr = new int[7];
        if (j < i) {
            arr[1] = i;
            arr[2] = j;
        } else {
            arr[1] = j;
            arr[2] = i;
        }
        arr[4] = 0;
        arr[5] = 1;
        while (arr[2] > 0) {
            arr[3] = arr[1] % arr[2]; // R
            arr[0] = arr[1] / arr[2]; // Q
            arr[6] = arr[4] - (arr[0] * arr[5]); // T
            arr[1] = arr[2];
            arr[2] = arr[3];
            arr[4] = arr[5];
            arr[5] = arr[6];
        }
        if (arr[4] < 0) {
            System.out.println(j + arr[4]);
        } else {
            System.out.println(arr[4]);
        }
    }
}
