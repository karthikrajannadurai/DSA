package org.dsa.Tree.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1, new ArrayList<>(), ans, 2, 5);
        System.out.println(ans);
    }

    public static void combinations(int i, List<Integer> curComb, List<List<Integer>> ans, int k, int n) {

        if (curComb.size() == k) {
            ans.add(new ArrayList<>(curComb));
            return;
        }

        if (i > n) {
            return;
        }
        for (int j = i; j <= n; j++) {
            curComb.add(j);
            combinations(j + 1, curComb, ans, k, n);
            curComb.remove(curComb.size() - 1);
        }
    }
}
