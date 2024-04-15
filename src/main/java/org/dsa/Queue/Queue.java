package org.dsa.Queue;

public class Queue<T> {

    private QueueObject<T> head;
    private QueueObject<T> tail;
    private int size;

    public Queue(T data) {

        head = new QueueObject<T>(data);
        tail = head;
        size++;
    }

    public void enqueue(T data) {

        if (head == null) {
            head = new QueueObject<T>(data);
            tail = head;
            size++;
            return;
        }

        QueueObject<T> newNode = new QueueObject<>(data);
        tail.setNext(newNode);
        tail = tail.getNext();
        size++;
    }

    public void dequeue() {

        if (head == null) {
            return;
        }
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void printAll() {

        QueueObject<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
