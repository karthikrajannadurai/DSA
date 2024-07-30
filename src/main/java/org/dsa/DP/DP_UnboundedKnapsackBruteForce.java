package org.dsa.DP;

public class DP_UnboundedKnapsackBruteForce {

    public static void main(String[] args) {
        int[] profit = new int[]{4, 4, 7, 1};
        int[] weight = new int[]{5, 2, 3, 1};
        decisionTree(profit, weight, 8, 0, 0);
        System.out.println(decisionTreeMaxPath(profit, weight, 8, 0, 0));
    }

    public static void decisionTree(int[] profit, int[] weight, int capacity, int decision, int pathWeight) {

        if (capacity <= 0 || decision >= weight.length) {
            pathWeight = capacity < 0 ? Math.abs(pathWeight - profit[decision]) : pathWeight;
            System.out.println(pathWeight + " " + capacity);
            return;
        }
        // left subtree
        decisionTree(profit, weight, capacity - weight[decision], decision, pathWeight + profit[decision]);
        decision++;
        // right subtree
        decisionTree(profit, weight, capacity, decision, pathWeight);
    }

    public static int decisionTreeMaxPath(int[] profit, int[] weight, int capacity, int decision, int pathWeight) {

        if (capacity <= 0 || decision >= weight.length) {
            pathWeight = capacity < 0 ? Math.abs(pathWeight - profit[decision]) : pathWeight;
//            System.out.println(pathWeight + " " + capacity);
            return pathWeight;
        }
        // left subtree
        int left = decisionTreeMaxPath(profit, weight, capacity - weight[decision], decision, pathWeight + profit[decision]);
        decision++;
        // right subtree
        int right = decisionTreeMaxPath(profit, weight, capacity, decision, pathWeight);
        return Math.max(left, right);
    }
}
