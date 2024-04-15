package org.dsa.Queue;

public class QueueObject<T> {

    private QueueObject<T> next;
    private T data;

    public QueueObject() {
    }

    public QueueObject(T data) {
        this.data = data;
    }

    public QueueObject<T> getNext() {
        return next;
    }

    public void setNext(QueueObject<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
