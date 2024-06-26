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
        if (tail == null) {
            LinkedListObject<T> head = new LinkedListObject<>(data);
            this.head = head;
            this.tail = head;
            size++;
            return;
        }
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
                size++;
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
            size++;
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
            size--;
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
        size++;
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

    public T getFromLast(int index) {

////        1. based on data
//        int iterValue = size - index, counter = 0;
//        if (iterValue < 0) {
//            return null;
//        }
//        LinkedListObject<T> temp = head;
//        while (iterValue > 0 && counter < iterValue) {
//            temp = temp.getNext();
//            counter++;
//        }
//        return temp.getData();

        // 2. pointer based

        LinkedListObject<T> mainptr = head;
        LinkedListObject<T> temp = head;
        int counter = 0;
        while (counter < index - 1) {
            temp = temp.getNext();
            counter++;
        }
        while (temp != null && temp.hasNext()) {
            temp = temp.getNext();
            mainptr = mainptr.getNext();
        }
        if (mainptr == null) {
            return null;
        }
        return mainptr.getData();
    }

    public void findNearingDuplicates(Comparator<T> comparator) {
        // List should be sorted.
        LinkedListObject<T> current = head;
        while (current != null && current.hasNext()) {
            if (comparator.compare(current.getData(), current.getNext().getData()) == 0) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
    }

    public void InsertInSortedList(T data, Comparator<T> comparator) {

        LinkedListObject<T> current = head;
        if (current == null) {
            head = new LinkedListObject<>(data);
            tail = head;
            return;
        }
        LinkedListObject<T> temp = null;
        while (current != null && comparator.compare(current.getData(), data) < 0) {
            temp = current;
            current = current.getNext();
        }

        if (temp == null) {
            LinkedListObject<T> newNode = new LinkedListObject<>(data);
            newNode.setNext(current);
            head = newNode;
        } else {
            LinkedListObject<T> newNode = new LinkedListObject<>(data);
            newNode.setNext(current);
            temp.setNext(newNode);
        }
    }

    public void deleteValue(T data, Comparator<T> comparator) {

        if (head == null) {
            return;
        }
        LinkedListObject<T> temp = null, current = head;
        if (comparator.compare(data, current.getData()) == 0) {
            head = head.getNext();
            return;
        }
        while (current != null && comparator.compare(data, current.getData()) != 0) {
            temp = current;
            current = current.getNext();
        }
        if (temp != null && current != null) {
            temp.setNext(current.getNext());
        }
    }

    public boolean detectLoop() {

        LinkedListObject<T> fastPtr = head;
        LinkedListObject<T> slowPtr = head;
        while (fastPtr.hasNext() && fastPtr.getNext().hasNext()) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    public T findStartingPointInLoop() {

        LinkedListObject<T> fastPtr = head;
        LinkedListObject<T> slowPtr = head;
        while (fastPtr.hasNext() && fastPtr.getNext().hasNext()) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                break;
            }
        }

        LinkedListObject<T> temp = head;
        while (temp != slowPtr) {
            temp = temp.getNext();
            slowPtr = slowPtr.getNext();
        }
        return temp.getData();
    }

    public void circularLinkedListToSinglylinkedList() {

        LinkedListObject<T> fastPtr = head;
        LinkedListObject<T> slowPtr = head;
        while (fastPtr.hasNext() && fastPtr.getNext().hasNext()) {
            fastPtr = fastPtr.getNext().getNext();
            slowPtr = slowPtr.getNext();
            if (fastPtr == slowPtr) {
                break;
            }
        }

        LinkedListObject<T> temp = head;
        while (temp.getNext() != slowPtr.getData()) {
            temp = temp.getNext();
            slowPtr = slowPtr.getNext();
        }
        slowPtr.setNext(null);
    }

    // Leetcode 21
    public static <T> LinkedListObject<T> mergeSortedLinkedList(T data, LinkedListObject<T> a, LinkedListObject<T> b, Comparator<T> comparator) {

        LinkedListObject<T> dummy = new LinkedListObject<>(data);
        LinkedListObject<T> tail = dummy;
        while (a != null && b != null) {
            if (comparator.compare(a.getData(), b.getData()) < 0) {
                tail.setNext(a);
                a = a.getNext();
            } else {
                tail.setNext(b);
                b = b.getNext();
            }
            tail = tail.getNext();
        }
        if (a == null) {
            tail.setNext(b);
        } else {
            tail.setNext(a);
        }
        return dummy.getNext();
    }

    // a utility for merging two singly linked list
    public LinkedListObject<T> getHead() {
        return head;
    }

    public int size() {
        return size;
    }
}