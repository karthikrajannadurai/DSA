package org.dsa.Arrays;

import java.util.HashSet;

public class SlidingWindowFixed {
    public static void main(String[] args) {
        System.out.println(findDuplicateElementInWindow(new int[]{1, 5, 30, 3, 4, 5, 6}, 5));
    }

    public static boolean findDuplicateElementInWindow(int[] arr, int k) {

        HashSet<Integer> window = new HashSet<>();
        int l = 0;
        for (int r = 0; r < arr.length; r++) {
            if (r - l + 1 > k) {
                window.remove(arr[l]);
                l++;
            }
            if (window.contains(arr[r])) {
                return true;
            }
            window.add(arr[r]);
        }
        return false;
    }
}
