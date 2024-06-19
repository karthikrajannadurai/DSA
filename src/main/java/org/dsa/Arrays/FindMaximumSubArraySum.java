package org.dsa.Arrays;

public class FindMaximumSubArraySum {
    public static void main(String[] args) {

        findMaximumSubArray(new int[]{4, -1, 2, -7, 3, 4});
        findMaximumSubArraySum(new int[]{4, -1, 2, -7, 3, 4});
        findMaximumSubArraySumIndex(new int[]{4, -1, 2, -7, 3, 4});
    }

    /**
     * O(n^2)
     *
     * @param arr
     */
    public static void findMaximumSubArray(int[] arr) {

        int maxsum = arr[0], currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum += arr[j];
                maxsum = Math.max(maxsum, currsum);
            }
        }
        System.out.println(maxsum);
    }

    /**
     * O(N)
     *
     * @param arr
     */
    public static void findMaximumSubArraySum(int[] arr) {

        int currSum = 0, maxSum = arr[0];
        for (int n : arr) {
            currSum = Math.max(currSum, 0);
            currSum += n;
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }

    // Return the left and right index of the max subarray sum,
    // assuming there's exactly one result (no ties).
    // Sliding window variation of Kadane's: O(n)
    public static void findMaximumSubArraySumIndex(int[] arr) {

        int l = 0, currSum = 0, maxSum = arr[0], maxl = 0, maxr = 0;
        for (int r = 0; r < arr.length; r++) {
            if (currSum < 0) {
                l = r;
                currSum = 0;
            }
            currSum += arr[r];
            if (currSum > maxSum) {
                maxSum = currSum;
                maxl = l;
                maxr = r;
            }
        }
        System.out.println(maxl + " " + maxr);
    }
}
