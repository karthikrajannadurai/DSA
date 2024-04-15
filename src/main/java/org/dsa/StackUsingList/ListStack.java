package org.dsa.StackUsingList;

import java.util.NoSuchElementException;

public class ListStack<T> {

    private ListStackObject<T> top;
    private int size;

    public void printAll() {
        while (top != null) {
            System.out.print(top.getData() + " ");
            top = top.getNext();
        }
        System.out.println();
    }

    public void push(T data) {

        ListStackObject<T> newNode = new ListStackObject<>(data);
        if (top == null) {
            top = newNode;
            size++;
            return;
        }
        newNode.setNext(top);
        top = newNode;
    }

    public T pop() {

        if (top == null) {
            throw new NoSuchElementException();
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    public T peek() {
        if (top != null) {
            return top.getData();
        }
        throw new NoSuchElementException();
    }
}
