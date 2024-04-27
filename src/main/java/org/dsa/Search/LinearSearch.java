package org.dsa.Search;

public class LinearSearch {
    public static void main(String[] args) {

        System.out.println(linearSearch(new int[]{1, 2, 3, 4}, 1));
    }

    public static boolean linearSearch(int[] arr, int n) {

        for (int num : arr) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}
