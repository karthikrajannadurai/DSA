package org.dsa.CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        // insert node at last
        CircularSinglyLinkedList<Integer> sc = new CircularSinglyLinkedList<>();
//        sc.insertAtLast(31);
        sc.printAll();

        System.out.println();
        // insert node at first
        sc.insertAtFirst(121);
        sc.insertAtFirst(123);
        sc.printAll();

        System.out.println();
        // delete node at first
        sc.deleteAtFirst();
        sc.deleteAtFirst();
        sc.printAll();
    }
}
