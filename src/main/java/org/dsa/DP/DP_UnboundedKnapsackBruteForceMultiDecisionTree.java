package org.dsa.DP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class MultiDecisionTree {

    private int capacity;
    private int pathWeight;
    private ArrayList<MultiDecisionTree> children = new ArrayList<>();

    MultiDecisionTree() {
    }

    MultiDecisionTree(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPathWeight() {
        return pathWeight;
    }

    public void setPathWeight(int pathWeight) {
        this.pathWeight = pathWeight;
    }

    public ArrayList<MultiDecisionTree> getChildren() {
        return children;
    }

    public void addChildren(MultiDecisionTree children) {
        this.children.add(children);
    }
}

public class DP_UnboundedKnapsackBruteForceMultiDecisionTree {
    public static void main(String[] args) {
        multiDecisionTree(8, new int[]{5, 2, 3, 1}, new int[]{4, 4, 7, 1});
    }

    public static void multiDecisionTree(int capacity, int[] weight, int[] profit) {

        MultiDecisionTree multiTree = new MultiDecisionTree();
        multiTree.setCapacity(capacity);
        multiTree.setPathWeight(0);
        Queue<MultiDecisionTree> queue = new LinkedList<>();
        queue.offer(multiTree);

        while (!queue.isEmpty()) {
            MultiDecisionTree temp = queue.poll();
            for (int index = 0; index < profit.length; index++) {
                if (temp.getCapacity() - weight[index] >= 0) {
                    MultiDecisionTree childrenTree = new MultiDecisionTree(temp.getCapacity() - weight[index]);
                    childrenTree.setPathWeight(temp.getPathWeight() + profit[index]);
                    temp.addChildren(childrenTree);
                    queue.offer(childrenTree);
                } else {
                    System.out.println(temp.getPathWeight());
                }
            }
        }
    }
}
