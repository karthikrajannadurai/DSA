package org.dsa.Sorting;

public class L_88_MergeTwoSortedArrays {

    // idea is to fill from the last, the answer should be in nums1, nums1 has size of m+n;
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (i < 0 && j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        while (i >= 0 && j < 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
    }
}
