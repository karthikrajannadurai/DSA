package org.dsa.Sorting;

public class L_977_SquaresOfSortedArray {

    /**
     * Here the input is sorted, we can use the two pointer to be filled from last.
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {

        int start = 0, end = nums.length - 1;
        int[] ans = new int[nums.length];
        int k = nums.length - 1;
        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                ans[k] = nums[start] * nums[start];
                start++;
            } else {
                ans[k] = nums[end] * nums[end];
                end--;
            }
            k--;
        }
        return ans;
    }
}
