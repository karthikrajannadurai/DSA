package org.dsa.Sorting;

import java.util.Arrays;

public class L_912_SortArray_Merge_Sort {

    public static int[] sortArray(int[] nums) {

        mergeSort(nums, 1, nums.length);
        return nums;
    }

    public static void mergeSort(int[] nums, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(nums, start, mid); // important not mid-1;
            mergeSort(nums, mid + 1, end);
            mergeTwoArrays(nums, start, end, mid);
        }
    }

    public static void mergeTwoArrays(int[] nums, int start, int end, int mid) {

        int[] temp = new int[end - start + 1];
        int j = mid + 1, k = 0, i = start;
        while (i <= mid && j <= end) {
            if (nums[i - 1] < nums[j - 1]) {
                temp[k] = nums[i - 1];
                i++;
            } else {
                temp[k] = nums[j - 1];
                j++;
            }
            k++;
        }

        while (i > mid && j <= end) {
            temp[k] = nums[j - 1];
            j++;
            k++;
        }

        while (i <= mid && j > end) {
            temp[k] = nums[i - 1];
            i++;
            k++;
        }
        for (int index = 0; index < temp.length; index++) {
            nums[start - 1 + index] = temp[index];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{-5, 2, 3, 1})));
    }
}
