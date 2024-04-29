package org.dsa.Sorting;

import java.util.Arrays;

public class QuickSort {

    /**
     * In Quick sort, choose the pivot and arrange the element greater than to right and lesser than to left.
     * Apply this recursively.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(quickSort(new int[]{12, 3, 4, 1, 2, 3}, 0, 5)));
    }

    public static int[] quickSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = pivot(arr, start, end);
            quickSort(arr, start, mid - 1);
            quickSort(arr, mid + 1, end);
        }
        return arr;
    }

    public static int pivot(int[] arr, int start, int end) {

        int pivot = arr[end], temp, i = start, j = start;
        while (i <= end) {
            if (arr[i] <= pivot) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }
}