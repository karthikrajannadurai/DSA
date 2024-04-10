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
    }
}

class compare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1.equals(o2)) {
            return 0;
        }
        return 1;
    }
}
