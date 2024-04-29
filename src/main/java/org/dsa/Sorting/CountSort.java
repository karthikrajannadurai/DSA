package org.dsa.Sorting;

public class CountSort {
    public static void main(String[] args) {

        int[] arr = new int[]{13, -5, 2, 3, 4, 1};
        int min = arr[0], max = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
            if (arr[index] > max) {
                max = arr[index];
            }
        }
        int[] ans = new int[max - min + 1];
        for (int index = 0; index < arr.length; index++) {

            ans[arr[index] - min]++;
        }

        int i = 0;
        while (i < ans.length) {
            if (ans[i] > 0) {
                System.out.print((i + min) + " ");
                ans[i]--;
            } else {
                i++;
            }
        }
    }
}
