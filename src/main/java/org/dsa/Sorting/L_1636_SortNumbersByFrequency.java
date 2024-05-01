package org.dsa.Sorting;

import java.util.HashMap;
import java.util.TreeSet;

public class L_1636_SortNumbersByFrequency {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            if (hashMap.get(n) != null) {
                hashMap.put(n, hashMap.get(n) + 1);
            } else {
                hashMap.put(n, 1);
            }
        }
        HashMap<Integer, TreeSet<Integer>> finalMap = new HashMap<>();
        hashMap.forEach((Integer key, Integer val) -> {
            if (finalMap.get(val) != null) {
                finalMap.get(val).add(key);
            } else {
                TreeSet<Integer> tree = new TreeSet<>();
                tree.add(key);
                finalMap.put(val, tree);
            }
        });
        int k = 0;
        for (int index = 1; index <= nums.length; index++) {
            TreeSet<Integer> tree = finalMap.get(index);
            if (tree != null) {
                while (!tree.isEmpty()) {
                    int count = 0;
                    Integer n = tree.pollLast();
                    while (count < index) {
                        nums[k] = n;
                        k++;
                        count++;
                    }
                }
            }
        }
        // System.out.print(key +" "+Arrays.toString(tree.toArray()));
        return nums;
    }
}
