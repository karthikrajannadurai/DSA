package org.dsa.Sorting;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Its a sinking sorting algorithm, as the largest or smallest element move to the end of the array.
     */
    public static void main(String[] args) {

        int[] arr = new int[]{70, 1, 2, 3, 10};
        int temp;
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // > for descending order
                    isSwapped = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
