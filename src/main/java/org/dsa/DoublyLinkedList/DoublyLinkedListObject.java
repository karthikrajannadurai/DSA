package org.dsa.DoublyLinkedList;

public class DoublyLinkedListObject<T> {

    private DoublyLinkedListObject<T> previous;
    T data;
    private DoublyLinkedListObject<T> next;


    public DoublyLinkedListObject(T data) {
        this.data = data;
    }

    public DoublyLinkedListObject<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedListObject<T> previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkedListObject<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListObject<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
