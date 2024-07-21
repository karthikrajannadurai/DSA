package org.dsa.Graph;

import java.util.*;

public class PrismMinimumSpanningTree {

    // same of Djktris algorithm.
    public static void main(String[] args) {

        // Array representation of the edges.
        int[][] edges = new int[5][3];
        int n = 5; // no of nodes.
        // adjacent list
        HashMap<Integer, ArrayList<int[]>> adj = new HashMap<>();

        // adjacent list formation
        for (int index = 0; index < edges.length; index++) {
            ArrayList<int[]> listOfEdges = new ArrayList<>();
            listOfEdges.add(new int[]{edges[index][1], edges[index][2]});
            adj.put(index, listOfEdges);
        }

        // min heap formation weight,node and sort by weight
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for (int[] temp : adj.get(1)) {
            minHeap.offer(new int[]{temp[1], 1, temp[0]});
        }
        // To track the nodes visited
        HashSet<Integer> visitNodes = new HashSet<>();
        ArrayList<int[]> mst = new ArrayList<>();

        while (mst.size() < n) {

            int[] minNode = minHeap.poll();
            int weight = minNode[0], n1 = minNode[1], n2 = minNode[2];
            if (visitNodes.contains(minNode[1])) {
                continue;
            }
            visitNodes.add(n2);
            mst.add(new int[]{n1, n2});
            for (int[] arr : adj.get(n2)) {

                int wei = arr[1], neighbor = arr[0];
                if (!visitNodes.contains(neighbor)) {
                    visitNodes.add(neighbor);
                    minHeap.offer(new int[]{wei, n2, neighbor});
                }
            }
        }
    }
}
