package org.dsa.Sorting;

import java.util.Arrays;

public class InsertionSort {

    // consider one element as sorted, if only one element is there, then it is sorted.
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 10, 5};
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
