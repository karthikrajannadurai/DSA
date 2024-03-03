package org.dsa.mathematics;

public class padovanSequence {
    static int[] arr = new int[21];

    public static void main(String[] args) {
        padovanSequenceLoop(20);
        System.out.println();
        System.out.printf("%d ", padovanSequenceRecursion(20));
    }

    public static void padovanSequenceLoop(int n) {

        int[] arr = {1, 1, 1};
        System.out.printf("%d %d %d ", arr[0], arr[1], arr[2]);
        int ans = 0;
        for (int index = 3; index < n; index++) {
            ans = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = ans;
            System.out.printf("%d ", ans);
        }
    }

    public static int padovanSequenceRecursion(int n) {
        if (n <= 3) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = padovanSequenceRecursion(n - 3) + padovanSequenceRecursion(n - 2);
        return arr[n];
    }
}
