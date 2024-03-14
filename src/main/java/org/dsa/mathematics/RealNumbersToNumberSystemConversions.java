package org.dsa.mathematics;

import java.util.HashMap;

public class RealNumbersToNumberSystemConversions {
    public static void main(String[] args) {
//        realNumbersToBinary(0.8252);
//        System.out.println();
//        binaryToRealNumbers("0.110100110100000001001110101001001");
//        System.out.println();
//        realNumbersToOctal(0.8);
//        System.out.println();
//        octalToDecimal("0.63146314");
        System.out.println();
        realNumbersToHex(0.16);
        System.out.println();
        hexToDecimal("0.28F5C28F5C28F6");
    }

    public static void realNumbersToBinary(double n) {
// for some numbers the there is infinite loop eg 0.825
        StringBuilder intPart = new StringBuilder();
        intPart.append("0.");
        int counter = 0;
        while (n > 0) {
            if (counter > 32) {
                break;
            }
            n = (n * 2);
            if (n > 1) {
                intPart.append("1");
                n = n - 1;
            } else {
                intPart.append("0");
            }
            counter++;
        }
        System.out.printf("%s", intPart);
    }

    public static void binaryToRealNumbers(String str) {
        String pointValue = str.split("\\.")[1];
        int num;
        double totalNum = 0;
        for (int index = 0; index < pointValue.length(); index++) {
            num = pointValue.charAt(index) - '0';
            totalNum += num * (1.0 / (1 << (index + 1)));
        }
        System.out.printf("%f", totalNum);
    }

    public static void realNumbersToOctal(double n) {
        StringBuilder intPart = new StringBuilder();
        intPart.append("0.");
        int counter = 0;
        while (n > 0) {
            if (counter > 32) {
                break;
            }
            n = (n * 8);
            intPart.append((int) n);
            n = (n - (int) n);
            counter++;
        }
        System.out.printf("%s", intPart);
    }

    public static void octalToDecimal(String str) {
        String pointValue = str.split("\\.")[1];
        int num;
        double totalNum = 0;
        for (int index = 0; index < pointValue.length(); index++) {
            num = pointValue.charAt(index) - '0';
            totalNum += num * (1.0 / (1 << ((index + 1) * 3)));
        }
        System.out.printf("%f", totalNum);
    }

    public static void realNumbersToHex(double n) {

        HashMap<Integer, String> hex = new HashMap<>();
        hex.put(10, "A");
        hex.put(11, "B");
        hex.put(12, "C");
        hex.put(13, "D");
        hex.put(14, "E");
        hex.put(15, "F");
        StringBuilder intPart = new StringBuilder();
        intPart.append("0.");
        int counter = 0;
        while (n > 0) {
            if (counter > 32) {
                break;
            }
            n = (n * 16);
            if (((int) n) > 9) {
                intPart.append(hex.get((int) n));
            } else {
                intPart.append((int) n);
            }
            n = (n - (int) n);
            counter++;
        }
        System.out.printf("%s", intPart);
    }

    public static void hexToDecimal(String str) {

        HashMap<Character, Integer> hex = new HashMap<>();
        hex.put('A', 10);
        hex.put('B', 11);
        hex.put('C', 12);
        hex.put('D', 13);
        hex.put('E', 14);
        hex.put('F', 15);
        String pointValue = str.split("\\.")[1];
        int num;
        double totalNum = 0;
        for (int index = 0; index < pointValue.length(); index++) {
            num = pointValue.charAt(index) - '0';
            if (num > 9) {
                num = hex.get(pointValue.charAt(index));
            }
//            if ((index + 1) * 4 > 30) { // overflows !!!!!
//                break;
//            }
//            totalNum += num * (1.0 / (1 << ((index + 1) * 4)));
            totalNum += num * (1.0 / Math.pow(16, index + 1));
        }
        System.out.printf("%f", totalNum);
    }
}
