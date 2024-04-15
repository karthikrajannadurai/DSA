package org.dsa.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(12);
//        queue.enqueue(21);
//        queue.enqueue(345);
        queue.dequeue();
        queue.enqueue(12);
        queue.enqueue(123);
        queue.printAll();
    }
}
