package org.dsa.CircularSinglyLinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList<T> {

    private CircularSinglyLinkedListObject<T> last;

    private int size;

    public CircularSinglyLinkedList() {
    }

    public CircularSinglyLinkedList(T data) {

        last = new CircularSinglyLinkedListObject<T>(data);
        last.setNext(last);
        size++;
    }

    public void insertAtLast(T data) {

        if (last == null) {
            last = new CircularSinglyLinkedListObject<T>(data);
            last.setNext(last);
            size++;
            return;
        }
        CircularSinglyLinkedListObject<T> newNode = new CircularSinglyLinkedListObject<>(data);
        newNode.setNext(last);
        last.setNext(newNode);
        last = last.getNext();
        size++;
    }

    public void insertAtFirst(T data) {

        if (last == null) {
            last = new CircularSinglyLinkedListObject<T>(data);
            last.setNext(last);
            size++;
            return;
        }
        CircularSinglyLinkedListObject<T> newNode = new CircularSinglyLinkedListObject<>(data);
        newNode.setNext(last.getNext());
        last.setNext(newNode);
        size++;
    }

    public void deleteAtFirst() {

        if (last == null) {
            throw new NoSuchElementException();
        }
        if (last == last.getNext()) {
            last = null;
            size--;
            return;
        }
        last.setNext(last.getNext().getNext());
        size--;
    }

    public void printAll() {

        if (last == null) {
            return;
        }
        CircularSinglyLinkedListObject<T> head = last.getNext();
        while (head != last) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
        System.out.print(head.getData());
    }

    public boolean hasNext() {
        return last != null;
    }

}
