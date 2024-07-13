package org.dsa.Graph;

import java.util.*;

public class DjktrisShortestPath {
    public static void main(String[] args) {

        int[][] edges = new int[5][3];
        int src = 0;
        // weighted adjacent list
        HashMap<Integer, ArrayList<Integer[]>> adjacentList = new HashMap<>();
        for (int index = 1; index <= 5; index++) {
            adjacentList.put(index, new ArrayList<>());
        }

        for (int[] ed : edges) {
            adjacentList.get(ed[0]).add(new Integer[]{ed[1], ed[2]});
        }

        // shortestPath storage
        HashMap<Integer, Integer> shortestPath = new HashMap<>();
        Queue<Integer[]> minHeap = new PriorityQueue<>(Comparator.comparingInt((Integer[] a) -> a[0]));
        minHeap.offer(new Integer[]{0, src});

        while (!minHeap.isEmpty()) {

            Integer[] temp = minHeap.remove();
            int w1 = temp[0], n1 = temp[1];
            if (shortestPath.containsKey(n1)) {
                continue;
            }
            shortestPath.put(n1, w1);

            for (Integer[] neighbors : adjacentList.get(n1)) {
                int w2 = neighbors[1], n2 = neighbors[0];
                if (!shortestPath.containsKey(n2)) {
                    minHeap.add(new Integer[]{w1 + w2, n2});
                }
            }
        }
        System.out.println(shortestPath);
    }
}
