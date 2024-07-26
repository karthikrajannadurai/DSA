package org.dsa.DP;

public class DP_0_1_Knapsack_BruteForce {
    public static void main(String[] args) {

        int capacity = 8;
        int[] profit = new int[]{4, 4, 7, 1};
        int[] weight = new int[]{5, 2, 3, 1};
//        decisionTree(profit, weight, capacity, 0, 0);
        System.out.println(decisionTreeMaxPath(profit, weight, capacity, 0, 0));
    }

    // prints all the available path overall.
    public static void decisionTree(int[] profit, int[] weight, int capacity, int pathWeight, int decision) {
        if (capacity <= 0 || decision >= profit.length) {
            pathWeight = capacity < 0 ? Math.abs(pathWeight - profit[decision - 1]) : pathWeight;
            System.out.println(pathWeight + " " + capacity);
            return;
        }
        decisionTree(profit, weight, capacity - weight[decision], pathWeight + profit[decision], ++decision);
        decisionTree(profit, weight, capacity, pathWeight, decision);
    }

    // prints the max pathWeight
    public static int decisionTreeMaxPath(int[] profit, int[] weight, int capacity, int pathWeight, int decision) {

        if (capacity <= 0 || decision >= profit.length) {
            pathWeight = capacity < 0 ? Math.abs(pathWeight - profit[decision - 1]) : pathWeight;
//            System.out.println(pathWeight + " " + capacity);
            return pathWeight;
        }
        return Math.max(decisionTreeMaxPath(profit, weight, capacity - weight[decision], pathWeight + profit[decision], ++decision)
                , decisionTreeMaxPath(profit, weight, capacity, pathWeight, decision));

    }
}
