package org.dsa.Sorting;

public class L1122_Relative_Sort_Array {
    public static void main(String[] args) {
        relativeSortArray(new int[]{1},new int[]{3});
    }

    /**
     * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
     * <p>
     * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
     * Output: [2,2,2,1,4,3,3,9,6,7,19]
     * Example 2:
     * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
     * Output: [22,28,8,6,17,44]
     * <p>
     * Constraints:
     * <p>
     * 1 <= arr1.length, arr2.length <= 1000
     * 0 <= arr1[i], arr2[i] <= 1000
     * All the elements of arr2 are distinct.
     * Each arr2[i] is in arr1.
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int max = arr1[0];
        for (int n : arr1) {
            if (max < n) {
                max = n;
            }
        }
        int[] count = new int[max + 1];
        for (int n : arr1) {
            count[n]++;
        }
        int k = 0;
        for (int n : arr2) {
            int counter = count[n];
            count[n] = 0;
            while (counter > 0) {
                arr1[k++] = n;
                counter--;
            }
        }
        for (int index = 0; index <= max; index++) {
            int counter = count[index];
            while (counter > 0) {
                arr1[k++] = index;
                counter--;
            }
        }
        return arr1;
    }
}
