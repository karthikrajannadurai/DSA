package org.JavaFeatures;

import java.util.*;

public class CollectionConversion {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 45};
        // Arrays , Collections as util
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>(linkedList);
        ArrayList<Integer> arrayLista = new ArrayList<>(arrayDeque);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("12", 2);
        hashMap.put("13", 2);
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);

    }
}
