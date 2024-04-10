package org.dsa.LinkedList;

public class LinkedListObject<T> {

    private T data;
    private LinkedListObject<T> next;

    public LinkedListObject(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListObject<T> getNext() {
        return next;
    }

    public void setNext(LinkedListObject<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }
}
