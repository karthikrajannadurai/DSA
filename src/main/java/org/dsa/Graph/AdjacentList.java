package org.dsa.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AdjacentList {
    public static void main(String[] args) {
        buildAdjacentList();
        System.out.println(adjacentListDFS(buildAdjacentList(), new HashSet<>(), "A", "E"));
        System.out.println(adjacentListBFS(buildAdjacentList(), new HashSet<>(), "A", "D"));
    }

    /**
     * We need to create key for every node, so we can refer.
     * key is the node, value is the linkage
     *
     * @return
     */
    public static HashMap<String, ArrayList<String>> buildAdjacentList() {

        HashMap<String, ArrayList<String>> adjacentList = new HashMap<String, ArrayList<String>>();
        String[][] edges = {{"A", "B"}, {"B", "C"}, {"B", "E"}, {"C", "E"}, {"E", "D"}};
        for (String[] str : edges) {
            if (!adjacentList.containsKey(str[0])) {
                adjacentList.put(str[0], new ArrayList<>());
            }
            if (!adjacentList.containsKey(str[1])) {
                adjacentList.put(str[1], new ArrayList<>());
            }
            adjacentList.get(str[0]).add(str[1]);
        }
        return adjacentList;
    }

    public static int adjacentListDFS(HashMap<String, ArrayList<String>> adjacentList, HashSet<String> visits, String node, String target) {

        if (visits.contains(node)) {
            return 0;
        }

        if (node.equals(target)) {
            return 1;
        }
        int count = 0;
        visits.add(node);
        for (String str : adjacentList.get(node)) {
            count += adjacentListDFS(adjacentList, visits, str, target);
        }
        visits.remove(node);
        return count;
    }

    public static int adjacentListBFS(HashMap<String, ArrayList<String>> adjacentList, HashSet<String> visits, String node, String target) {

        ArrayDeque<String> queue = new ArrayDeque<>();
        int length = 0;
        queue.add(node);
        visits.add(node);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int index = 0; index < queueSize; index++) {
                String currElement = queue.poll();
                if (currElement.equals(target)) {
                    return length;
                }
                for (String neighbor : adjacentList.get(currElement)) {
                    if (!visits.contains(neighbor)) {
                        visits.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
            length++;
        }
        return length;
    }
}