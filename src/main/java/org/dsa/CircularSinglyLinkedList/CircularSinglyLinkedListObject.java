package org.dsa.CircularSinglyLinkedList;

public class CircularSinglyLinkedListObject<T> {


    private T data;
    private CircularSinglyLinkedListObject<T> next;

    public CircularSinglyLinkedListObject(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CircularSinglyLinkedListObject<T> getNext() {
        return next;
    }

    public void setNext(CircularSinglyLinkedListObject<T> next) {
        this.next = next;
    }
}
