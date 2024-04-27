package org.dsa.Search;

public class L_35_InsertInSearchPosition {

    public int searchInsert(int[] nums, int target) {

        int start = 1, end = nums.length, mid = 0;
        while (start <= end) {

            mid = (start + end) / 2;
            if (nums[mid - 1] == target) {
                return mid - 1;
            }
            if (target < nums[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (target >= nums[mid - 1]) {
            return mid;
        } else {
            return mid - 1;
        }
    }
}
