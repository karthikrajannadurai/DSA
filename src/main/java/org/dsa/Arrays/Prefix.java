package org.dsa.Arrays;


import java.util.ArrayList;

public class Prefix {
    public static void main(String[] args) {
        System.out.println(rangeSum(new int[]{1, 2, 3, 45, 6},1,2));
    }

    public static int rangeSum(int[] arr, int left, int right) {

        // this will be stored in separate global list. DP
        ArrayList<Integer> prefixSum = new ArrayList<>();
        int total = 0;
        for (int n : arr) {
            total += n;
            prefixSum.add(total);
        }

        int rightSum = prefixSum.get(right);
        int leftSum = left > 0 ? prefixSum.get(left) : 0;
        return rightSum - leftSum;
    }
}
