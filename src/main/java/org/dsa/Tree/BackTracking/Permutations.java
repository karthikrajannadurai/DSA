package org.dsa.Tree.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        System.out.println(permutationsIterative(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permutationsIterative(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        perms.add(new ArrayList<>());

        for (int n : nums) {
            List<List<Integer>> nextPerms = new ArrayList<>();
            for (List<Integer> p : perms) {
                for (int i = 0; i <= p.size(); i++) {
                    List<Integer> pCopy = new ArrayList<>(p);
                    pCopy.add(i, n);
                    nextPerms.add(pCopy);
                }
            }
            perms = nextPerms;
        }
        return perms;
    }
}
