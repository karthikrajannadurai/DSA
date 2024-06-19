package org.dsa.Tree.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {

        List<List<Integer>> ans = new LinkedList<>();
        subSets(new int[]{1, 2, 3}, 0, new LinkedList<>(), ans);
        System.out.println(ans);
        removeDuplicateSubsets(new int[]{1, 2, 2, 3}, 0, new LinkedList<>(), ans);
        System.out.println(ans);
    }

    // return all the distinct subsets
    public static void subSets(int[] arr, int i, LinkedList<Integer> curSet, List<List<Integer>> ans) {

        if (i >= arr.length) {
            ans.add(new ArrayList<>(curSet));
            return;
        }
        curSet.add(arr[i]);
        subSets(arr, i + 1, curSet, ans);
        curSet.remove(curSet.size() - 1);
        subSets(arr, i + 1, curSet, ans);
    }

    // for duplicates, we are passing the i
    public static void removeDuplicateSubsets(int[] arr, int i, LinkedList<Integer> curSet, List<List<Integer>> ans) {

        if (i >= arr.length) {
            ans.add(new ArrayList<>(curSet));
            return;
        }
        curSet.add(arr[i]);
        removeDuplicateSubsets(arr, i + 1, curSet, ans);
        curSet.remove(curSet.size() - 1);
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        removeDuplicateSubsets(arr, i + 1, curSet, ans);
    }
}
