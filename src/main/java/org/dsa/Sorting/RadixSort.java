package org.dsa.Sorting;

import java.util.Arrays;

/**
 * For negative numbers, add the smalled number to elements of the array and
 * sort as usually and in the result, add back the smallest number.
 */
public class RadixSort {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 34, 199, 89, 90};
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
        }
        for (int pos = 1; (max / pos) > 0; pos *= 10) {
            countSort(arr, pos);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr, int pos) {
        int[] countArr = new int[10];
        // update the count array
        for (int index : arr) {
            countArr[(index / pos) % 10]++;
        }

        // summation of the values in countArray for find the index
        for (int index = 1; index < countArr.length; index++) {
            countArr[index] = countArr[index - 1] + countArr[index];
        }

        // checks for the index
        int[] temp = new int[arr.length];
        int position;
        for (int index = arr.length - 1; index >= 0; index--) {
            position = countArr[(arr[index] / pos) % 10];
            temp[position-1] = arr[index];
            countArr[(arr[index] / pos) % 10] = position - 1;
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }
}
