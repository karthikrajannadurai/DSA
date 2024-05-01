package org.dsa.Sorting;

public class L_75_SortColors {

    // use count sort
    public void sortColors(int[] nums) {

        int[] countArr = new int[3];
        for (int index = 0; index < nums.length; index++) {
            countArr[nums[index]]++;
        }
        int i, j = 0;
        for (int index = 0; index < 3; index++) {
            i = countArr[index];
            if (i > 0) {
                for (int k = 0; k < i; k++) {
                    nums[j] = index;
                    j++;
                }
            }
        }
    }
}
