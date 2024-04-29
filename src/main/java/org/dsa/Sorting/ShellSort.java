package org.dsa.Sorting;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int[] arr = new int[]{23, 29, 15, 19, 31, 7, 9, 52};
        int temp;
        for (int gap = arr.length / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < arr.length; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i] > arr[i + gap]) {
                        temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
