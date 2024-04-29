package org.dsa.Heap;

import java.util.Arrays;

/**
 * Heap is the priority queue, that can be represented by array or Binary Tree.
 * It is the complete binary tree.
 * BottomUp Heapify is arranging the elements after the element is inserted, both for max heap and min heap.
 */

public class Heapify {

    private static int[] heap = new int[10];
    private static int n;

    /**
     * Heapify and insert are same
     */
    public static void heapify(int x) {
        if (heap.length - 1 == n) {
            // resize;
        }
        heap[n] = x;
        bottomUpHeapify(n);
        n++;
    }

    public static void bottomUpHeapify(int k) {

        while (k > 0 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    /**
     * delete maximum element, in heap only max and min element can be deleted, from amx and min heap respectively.
     */
    public static void topDownHeapify() {

        if (heap.length == 0) {
            return;
        }
        int temp;
        heap[0] = heap[n - 1];
        heap[n - 1] = 0;
        int k = 0, left = 1, right = 2;
        while (left < n && right < n) {

            if (heap[left] < heap[right]) {
                temp = heap[k];
                heap[k] = heap[right];
                heap[right] = temp;
                k = right;
            } else {
                temp = heap[k];
                heap[k] = heap[left];
                heap[left] = temp;
                k = left;
            }
            left = (2 * k) + 1;
            right = (2 * k) + 2;
        }
        if (left < n) {
            temp = heap[k];
            heap[k] = heap[left];
            heap[left] = temp;
        }
    }

    public static void main(String[] args) {

        // insert in max heap
        heapify(9);
        heapify(3);
        heapify(6);
        heapify(2);
        heapify(1);
        heapify(5);
        heapify(4);
        System.out.println(Arrays.toString(heap));

        // delete in max heap
        topDownHeapify();
        System.out.println(Arrays.toString(heap));
    }
}
