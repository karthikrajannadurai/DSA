package org.dsa.Arrays;

public class SlidingWindowVariable {
    public static void main(String[] args) {
        System.out.println(findLongestSubArray(new int[]{1, 2, 2, 4, 5, 5, 5}));
    }

    public static int findLongestSubArray(int[] arr) {
        int l = 0, length = 0;
        for (int r = 0; r < arr.length; r++) {
            if (arr[l] != arr[r]) {
                l = r;
            }
            length = Math.max(length, r - l + 1);
        }
        return length;
    }

    public static int findMinimumSubArray(int[] arr, int target) {

        int l = 0, length = Integer.MAX_VALUE, total = 0;
        for (int r = 0; r < arr.length; r++) {
            total += arr[r];
            if (total >= target) {
                length = Math.min(length, r - l + 1);
                total -= arr[l];
                l++;
            }
        }

        if (length == Integer.MAX_VALUE) {
            return 0;
        }
        return length;
    }
}
