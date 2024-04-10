package org.dsa.LinkedList;

import javax.naming.SizeLimitExceededException;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws SizeLimitExceededException {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.size());

        // insert
        LinkedList<Integer> list1 = new LinkedList<>(34);
        list1.insert(12);
        list1.insert(23);
        list1.insert(230);
        list1.insert(212, 1);
        list1.printAll();

//        delete
        System.out.println();
        list1.delete(1);
        list1.printAll();

//        search
        System.out.println();
        System.out.println(list1.contains(23, new compare()));

//        reverse
        System.out.println("reversed::---- ");
        list1.printAll();
        System.out.println();
        list1.reverse();
        list1.printAll();

        // getValue At index
        System.out.println();
        System.out.println(list1.getFromLast(3));

        // find Duplicates
        System.out.println("Duplicates");
        list1.insert(212);
        list1.insert(212);
        list1.printAll();
        System.out.println();
        list1.findNearingDuplicates(new compare());
        list1.printAll();

        // insert into sorted linkedList
        System.out.println();
        System.out.println("Insert into Sorted linkedList");
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.printAll();
        System.out.println();
        list2.InsertInSortedList(1, new compare());
        list2.insert(3);
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);
        list2.InsertInSortedList(2, new compare());
        list2.InsertInSortedList(7, new compare());
        list2.InsertInSortedList(0, new compare());
        list2.printAll();
    }
}

class compare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
