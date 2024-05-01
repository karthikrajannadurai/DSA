package org.dsa.Sorting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class L_451_SortCharacterByFrequency {

    // we can use the collections.sort() see to it.
    public String frequencySort(String s) {

        HashMap<Character, Integer> characterHashMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (characterHashMap.containsKey(ch)) {
                characterHashMap.put(ch, characterHashMap.get(ch) + 1);
            } else {
                characterHashMap.put(ch, 1);
            }
        }
        HashMap<Integer, List<Character>> finalMap = new HashMap<>();
        characterHashMap.forEach((Character ch, Integer val) -> {
            if (finalMap.containsKey(val)) {
                finalMap.get(val).add(ch);
            } else {
                List<Character> temp = new LinkedList<>();
                temp.add(ch);
                finalMap.put(val, temp);
            }
        });
        int count;
        StringBuilder str = new StringBuilder();
        for (int index = s.length(); index >= 0; index--) {
            if (finalMap.get(index) != null) {
                for (Character character : finalMap.get(index)) {
                    count = 0;
                    while (count < index) {
                        str.append(character);
                        count++;
                    }
                }
            }
        }
        return str.toString();
    }
}
