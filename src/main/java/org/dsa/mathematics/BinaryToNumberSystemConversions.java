package org.dsa.mathematics;

import java.util.ArrayDeque;
import java.util.HashMap;

public class BinaryToNumberSystemConversions {
    public static void main(String[] args) {
//        binaryToOctal("11001");
//        octalToBinary("1");
//        binaryToHex("000101110011");
        hexToBinary("B1");
    }

    public static void binaryToOctal(String bin) {

        int len = bin.length(), count = 0, num = 0;
        StringBuilder str = new StringBuilder();
        for (int index = len; index > 0; index--) {
            num += (bin.charAt(index - 1) - '0') * (1 << count);
            count++;
            if (count % 3 == 0 && count != 0) {
                count = 0;
                str.append(num);
                num = 0;
            }
        }
        str.append(num);
        System.out.printf("BinaryToOctal-- %s \n", str.reverse());
    }

    public static void octalToBinary(String str) {
        int num;
        ArrayDeque<Integer> temp = new ArrayDeque<>();
        for (int index = 0; index < str.length(); index++) {
            num = str.charAt(index) - '0';
            while (num > 0) {
                temp.addFirst(num & 1);
                num >>= 1;
            }
            while (temp.size() % 3 != 0) {
                temp.addFirst(0);
            }
            System.out.printf("%s", "OctalToBinary-- ");
            temp.forEach(System.out::print);
            temp.clear();
        }

    }

    public static void binaryToHex(String bin) {

        HashMap<Integer, String> hex = new HashMap<>();
        hex.put(10, "A");
        hex.put(11, "B");
        hex.put(12, "C");
        hex.put(13, "D");
        hex.put(14, "E");
        hex.put(15, "F");
        int len = bin.length(), count = 0, num = 0;
        StringBuilder str = new StringBuilder();
        for (int index = len; index > 0; index--) {
            num += (bin.charAt(index - 1) - '0') * (1 << count);
            count++;
            if (count % 4 == 0 && count != 0) {
                count = 0;
                if (num > 9) {
                    str.append(hex.get(num));
                } else {
                    str.append(num);
                }
                num = 0;
            }
        }
        if (num != 0) {
            str.append(num);
        }
        System.out.printf("BinaryToHex-- %s \n", str.reverse());
    }

    public static void hexToBinary(String str) {

        HashMap<Character, Integer> hex = new HashMap<>();
        hex.put('A', 10);
        hex.put('B', 11);
        hex.put('C', 12);
        hex.put('D', 13);
        hex.put('E', 14);
        hex.put('F', 15);
        int num;
        char tempChar;
        ArrayDeque<Integer> temp = new ArrayDeque<>();
        for (int index = 0; index < str.length(); index++) {

            tempChar = str.charAt(index);
            if ((tempChar - '0') > 9) {
                num = hex.get(tempChar);
            } else {
                num = tempChar - '0';
            }
            while (num > 0) {
                temp.addFirst(num & 1);
                num >>= 1;
            }
            while (temp.size() % 4 != 0) {
                temp.addFirst(0);
            }
            System.out.printf("%s", "HexToBinary-- ");
            temp.forEach(System.out::print);
            temp.clear();
        }
    }
}
