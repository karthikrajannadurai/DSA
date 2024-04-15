package org.dsa.Stack;

public class ListStackObject<T> {

    private T data;
    private ListStackObject<T> next;

    public ListStackObject() {
    }

    public ListStackObject(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListStackObject<T> getNext() {
        return next;
    }

    public void setNext(ListStackObject<T> next) {
        this.next = next;
    }
}
