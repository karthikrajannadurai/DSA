package org.dsa.DoublyLinkedList;

import javax.naming.SizeLimitExceededException;

public class DoubleLinkedList<T> {

    private DoublyLinkedListObject<T> head;
    private DoublyLinkedListObject<T> tail;
    private int size;

    public void reverse() {

        DoublyLinkedListObject<T> backReference = tail;
        while (backReference != null) {
            System.out.print(backReference.getData() + " ");
            backReference = backReference.getPrevious();
        }
        System.out.println();
    }

    public void insert(T data) {

        if (head == null) {
            head = new DoublyLinkedListObject<>(data);
            tail = head;
            size++;
            return;
        }
        tail.setNext(new DoublyLinkedListObject<>(data));
        tail.getNext().setPrevious(tail);
        tail = tail.getNext();
        size++;
    }

    public void insert(T data, int index) throws SizeLimitExceededException {
        if (index <= 0) {
            throw new SizeLimitExceededException();
        }
        DoublyLinkedListObject<T> temp;
        if (index == 1) {
            temp = new DoublyLinkedListObject<T>(data);
            temp.setNext(head);
            head.setPrevious(temp);
            head = temp;
            size++;
            return;
        }
        int counter = 0;
        DoublyLinkedListObject<T> iterator = head;
        while (counter < index - 2 && iterator.hasNext()) {
            iterator = iterator.getNext();
            counter++;
        }
        DoublyLinkedListObject<T> newNode = new DoublyLinkedListObject<>(data);
        newNode.setNext(iterator.getNext());
        newNode.setPrevious(iterator);
        iterator.setNext(newNode);
        size++;
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
        DoublyLinkedListObject<T> iterator = head;
        int counter = 0;
        while (counter < index - 2 && iterator.hasNext()) {
            iterator = iterator.getNext();
            counter++;
        }
        DoublyLinkedListObject<T> deleteNode = iterator.getNext();
        iterator.setNext(deleteNode.getNext());
        if (deleteNode.hasNext()) {
            iterator.getNext().setPrevious(iterator);
        }
        size--;
    }

    public void printAll() {

        DoublyLinkedListObject<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
