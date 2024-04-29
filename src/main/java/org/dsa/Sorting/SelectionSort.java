package org.dsa.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        // 1. find the min or max
        // 2. move it to the front

        int[] arr = new int[]{8, 2, 3, 4, 5, 6};
        int min, temp;
        for (int index = 0; index < arr.length - 1; index++) {
            min = index;
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { // > for descending order
                    min = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
