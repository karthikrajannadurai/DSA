package org.dsa.UnionFind;

import java.util.HashMap;

class UnionFind {

    HashMap<Integer, Integer> parent;
    HashMap<Integer, Integer> rank;

    UnionFind() {
        parent = new HashMap<>();
        rank = new HashMap<>();
    }

    public void initialize() {
        for (int index = 1; index <= 4; index++) {
            parent.put(index, index);
            rank.put(index, 0);
        }
        union(1, 2);
        union(2, 4);
        union(4, 1);
    }

    // Find parent of n, with path compression.
    public Integer find(int n) {
        int p = parent.get(n);
        while (p != parent.get(p)) {
            parent.put(p, parent.get(parent.get(p)));
            p = parent.get(p);
        }
        return p;
    }

    // Union by height / rank.
    // Return false if already connected, true otherwise.
    public boolean union(int n1, int n2) {

        int p1 = this.find(n1);
        int p2 = this.find(n2);
        if (p1 == p2) {
            return false;
        }
        if (rank.get(p1) > rank.get(p2)) {
            parent.put(p2, p1);
        } else if (rank.get(p1) < rank.get(p2)) {
            parent.put(p1, p2);
        } else {
            parent.put(p1, p2);
            rank.put(p2, rank.get(p2) + 1);
        }
        return true;
    }

    public String toString() {

        return "Parent " + parent.toString() + " Rank " + rank.toString();
    }
}

public class UnionFind_DisJointSets {
    public static void main(String[] args) {
        UnionFind unionFind = new UnionFind();
        unionFind.initialize();
        System.out.println(unionFind);
    }
}
