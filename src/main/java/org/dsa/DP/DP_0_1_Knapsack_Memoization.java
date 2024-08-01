package org.dsa.DP;

import java.util.Arrays;

public class DP_0_1_Knapsack_Memoization {

    // T.C = 0(n*m) S.C = 0(n*m)
    public static void twoDMemoization() {

        int capacity = 8;
        int[] profit = new int[]{4, 4, 7, 1};
        int[] weight = new int[]{5, 2, 3, 1};
        int[][] ans = new int[profit.length][capacity + 1];

        for (int index = 0; index < capacity + 1; index++) {

            if (index >= weight[0]) {
                ans[0][index] = profit[0];
            }
        }
        int skippedAns, includedAns;
        for (int index = 1; index < weight.length; index++) {
            for (int capacityIndex = 1; capacityIndex < capacity + 1; capacityIndex++) {
                skippedAns = ans[index - 1][capacityIndex];
                includedAns = 0;
                if (capacityIndex - weight[index] >= 0) {
                    //for inbounded knapsack we need to look same row, because we can include one item,
//                    some many times, so in the same row in previous column, (weight after subtracting the current weight),
//                    will have the answer.
//                    includedAns = profit[index] + ans[index][capacityIndex - weight[index]];
                    includedAns = profit[index] + ans[index - 1][capacityIndex - weight[index]];
                }
                ans[index][capacityIndex] = Math.max(skippedAns, includedAns);
            }
        }

        System.out.println(Arrays.deepToString(ans));
        System.out.println(ans[profit.length - 1][capacity - 1]);
    }

    // T.C = 0(n*m) S.C = 0(n)
    public static void oneDMemoization() {

        int capacity = 8;
        int[] weight = new int[]{5, 2, 3, 1};
        int[] profit = new int[]{4, 4, 7, 1};
        int[] ans = new int[capacity + 1];
        for (int index = 0; index < capacity + 1; index++) {
            if (index >= weight[0]) {
                ans[index] = profit[0];
            }
        }
        int skippedIndex, includedIndex;
        for (int index = 1; index < profit.length; index++) {
            for (int capacityIndex = 8; capacityIndex >= 1; capacityIndex--) {
                skippedIndex = ans[capacityIndex];
                includedIndex = 0;
                if (capacityIndex - weight[index] >= 0) {
                    includedIndex = profit[index] + ans[capacityIndex - weight[index]];
                }
                ans[capacityIndex] = Math.max(skippedIndex, includedIndex);
            }
            System.out.println(Arrays.toString(ans));
        }
        System.out.println(Arrays.toString(ans));
        System.out.println((ans[capacity]));
    }

    public static void oneDMemoizationUnboundedKnapsack() {

        int capacity = 8;
        int[] weight = new int[]{5, 2, 3, 1};
        int[] profit = new int[]{4, 4, 7, 1};
        int[] ans = new int[capacity + 1];
        for (int index = 0; index < capacity + 1; index++) {
            if (index >= weight[0]) {
                ans[index] = profit[0];
            }
        }
        int skippedIndex, includedIndex;
        int[] temp;
        for (int index = 0; index < profit.length; index++) {
            temp = new int[capacity + 1];
            for (int capacityIndex = 1; capacityIndex < capacity + 1; capacityIndex++) {
                skippedIndex = ans[capacityIndex];
                includedIndex = 0;
                if (capacityIndex - weight[index] >= 0) {
                    includedIndex = profit[index] + temp[capacityIndex - weight[index]];
                }
                temp[capacityIndex] = Math.max(skippedIndex, includedIndex);
            }
            ans = temp;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        twoDMemoization();
        oneDMemoization();
        oneDMemoizationUnboundedKnapsack();
    }
}
