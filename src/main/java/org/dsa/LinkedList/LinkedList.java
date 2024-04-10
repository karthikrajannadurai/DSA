package org.dsa.LinkedList;

import javax.naming.SizeLimitExceededException;
import java.util.Comparator;

public class LinkedList<T> {
    private LinkedListObject<T> head;
    private LinkedListObject<T> tail;

    private int size;

    public LinkedList() {

    }

    public LinkedList(T data) {
        LinkedListObject<T> head = new LinkedListObject<>(data);
        this.head = head;
        this.tail = head;
        size++;
    }

    public void insert(T data) {
        tail.setNext(new LinkedListObject<>(data));
        tail = tail.getNext();
        size++;
    }

    public void insert(T data, int index) throws SizeLimitExceededException {
        if (index >= 1) {
            if (index == 1) {
                LinkedListObject<T> newNode = new LinkedListObject<T>(data);
                newNode.setNext(head);
                head = newNode;
                return;
            }
            int count = 0;
            LinkedListObject<T> iterator = head;
            while (count < index - 2 && iterator.hasNext()) {
                iterator = iterator.getNext();
                count++;
            }
            LinkedListObject<T> newNode = new LinkedListObject<T>(data);
            newNode.setNext(iterator.getNext());
            iterator.setNext(newNode);
        } else {
            throw new SizeLimitExceededException();
        }
    }

    public void delete(int index) throws SizeLimitExceededException {

        if (index > size) {
            throw new SizeLimitExceededException();
        }
        if (index == 1) {
            if (head.hasNext()) {
                head = head.getNext();
            } else {
                head = null;
            }
            return;
        }
        LinkedListObject<T> iterator = head;
        int count = 0;
        while (count < index - 2 && iterator.hasNext()) {
            iterator = iterator.getNext();
            count++;
        }
        LinkedListObject<T> deleteNode = iterator.getNext();
        iterator.setNext(deleteNode.getNext());
    }

    public T contains(T data, Comparator<T> comparator) {
        LinkedListObject<T> temp = head;
        int comparison;
        while (temp != null) {
            comparison = comparator.compare(temp.getData(), data);
            if (comparison == 0) {
                return temp.getData();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void printAll() {
        LinkedListObject<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public void reverse() {

        LinkedListObject<T> current = head, previous = null, next;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        tail = head;
        head = previous;
    }

    public int size() {
        return size;
    }
}
