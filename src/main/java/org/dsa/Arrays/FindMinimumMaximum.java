package org.dsa.Arrays;

public class FindMinimumMaximum {
    public static void main(String[] args) {
        minimum();
        maximum();
    }

    public static void minimum() {

        int[] arr = new int[]{111, 21, 34, 21, 444};
        int min = arr[0];
        for (int n : arr) {
            if (min > n) {
                min = n;
            }
        }
        System.out.println(min);
    }

    public static void maximum() {

        int[] arr = new int[]{10, 12, 34, 32, 54, 67};
        int max = arr[0], secondMax = arr[0];
        for (int n : arr) {
            if (max < n) {
                secondMax = max;
                max = n;
            } else if (secondMax < n && n != max) {
                secondMax = n;
            }
        }
        System.out.println("Max--" + max);
        System.out.println("SecondMax--" + secondMax);
    }
}