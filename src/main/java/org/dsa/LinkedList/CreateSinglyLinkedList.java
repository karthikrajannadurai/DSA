package org.dsa.LinkedList;

public class CreateSinglyLinkedList {
    public static void main(String[] args) {

        LinkedListUser list1 = new LinkedListUser(2);
        LinkedListUser list2 = new LinkedListUser(34);
        LinkedListUser list3 = new LinkedListUser(54);
        list1.next = list2; // 2 --> 34
        list2.next = list3; // 2 --> 34 --> 54
    }
}

class LinkedListUser {
    int data;
    LinkedListUser next;

    public LinkedListUser(int data) {
        this.data = data;
    }
}
