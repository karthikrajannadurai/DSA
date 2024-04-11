package org.dsa.LinkedList;

public class Loop {
    public static void main(String[] args) {

        // detect loop
        LinkedList<Integer> loop = new LinkedList<>();
        loop.insert(12);
        loop.insert(23);
        loop.insert(22);
        loop.insert(21);
        loop.insert(20);
        System.out.println(loop.detectLoop());

        // merge sorted singly linked list
        LinkedList<Integer> a = new LinkedList<>();
        a.insert(1);
        a.insert(2);
        a.insert(4);
        a.insert(7);

        LinkedList<Integer> b = new LinkedList<>();
        b.insert(3);
        b.insert(5);
        b.insert(6);

        LinkedListObject<Integer> merge = LinkedList.mergeSortedLinkedList(0, a.getHead(), b.getHead(), new compare());


    }
}
