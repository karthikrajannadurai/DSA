package org.dsa.Sorting;

/**
 * With extra space its very easy to solve, create array and use two pointer technique to solve.
 * and return the new array.
 */
public class GFG_ArrangeElementsInMax_MinForm {


    /**
     * This uses the maths trick of module properties to solve in place without using extra space.
     *
     * @param arr
     * @param n
     */
    public static void rearrange(long[] arr, int n) {

        int maxId = n - 1, minId = 0;
        long max = arr[n - 1] + 1;
        for (int index = 0; index < n; index++) {
            if ((index & 1) == 0) {
                arr[index] = arr[index] + ((arr[maxId] % max) * max);
                maxId--;
            } else {
                arr[index] = arr[index] + ((arr[minId] % max) * max);
                minId++;
            }
        }
        for (int index = 0; index < n; index++) {
            arr[index] = arr[index] / max;
        }
    }

    /**
     * In this approach, we are using the swift technique to make the array in max and min form.
     *
     * @param arr
     * @param n
     */
    public static void rearrange2(long arr[], int n) {

        int min = 0, max = n - 1, j;
        long temp;
        while (min < max) {

            temp = arr[max];
            j = max;
            while (j > min) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[min] = temp;
            min = min + 2;
        }

    }
}
