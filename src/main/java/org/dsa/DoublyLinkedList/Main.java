package org.dsa.DoublyLinkedList;

import javax.naming.SizeLimitExceededException;

public class Main {
    public static void main(String[] args) throws SizeLimitExceededException {

        // insert node data at last
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        System.out.println("Insert Node ---- ");
        list1.insert(2);
        list1.insert(3);
        list1.insert(45);
        list1.insert(30);
        list1.insert(300);
        list1.printAll();
        list1.reverse();
        System.out.println(list1.size());

        // insert node at middle
        System.out.println("Insert Node Middle ---- ");
        list1.insert(12, 1);
        list1.insert(321, 40);
        list1.printAll();

        // delete node at index
        System.out.println("Delete node at index --- " + list1.size());
        list1.delete(1);
        list1.delete(6);
        list1.printAll();
    }
}
