package org.dsa.Hashing;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class L1207_Unique_No_Of_Occurrences {
    public static void main(String[] args) {
        uniqueOccurrences(new int[]{1});
    }

    /**
     * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
     *<p>
     *
     *
     * Example 1:
     *<p>
     * Input: arr = [1,2,2,1,1,3]
     * Output: true
     * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
     * Example 2:
     *<p>
     * Input: arr = [1,2]
     * Output: false
     * Example 3:
     *<p>
     * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
     * Output: true
     *<p>
     *
     * Constraints:
     *<p>
     * 1 <= arr.length <= 1000
     * -1000 <= arr[i] <= 1000
     * @param arr
     * @return
     */
    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : arr) {
            if (hashMap.get(n) != null) {
                hashMap.put(n, hashMap.get(n) + 1);
            } else {
                hashMap.put(n, 1);
            }
        }

        Set<Integer> num = hashMap.keySet();
        Set<Integer> occurrence = new HashSet<>();
        for (int n : num) {
            if (!occurrence.add(hashMap.get(n))) {
                return false;
            }
        }
        return true;
    }
}
