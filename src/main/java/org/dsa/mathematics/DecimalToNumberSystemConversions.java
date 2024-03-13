package org.dsa.mathematics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class DecimalToNumberSystemConversions {
    public static void main(String[] args) {
        decimalToBinary(123);
        binaryToDecimal(1111011);
        decimalToOctal(25);
        octalToDecimal(612);
        decimalToHexadecimal(479);
        hexadecimalTodecimal("1DF");
    }

    public static void decimalToBinary(int n) {
        System.out.printf("DecimalToBinary--- ");
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n & 1);
            n >>= 1;
        }
        for (int index = arr.size() - 1; index >= 0; index--) {
            System.out.printf("%d", arr.get(index));
        }
    }

    public static void binaryToDecimal(int bin) {
        System.out.print("\nBinaryToDecimal--- input is string ");
// If input is string
        String binStr = String.valueOf(bin); // driver code
        int len = binStr.length() - 1, num = 0;
        for (int index = len; index >= 0; index--) {
            num += (binStr.charAt(index) - '0') * (1 << (len - index));
        }
        System.out.printf("%d", num);
//        If input is num
        System.out.print("\nBinaryToDecimal--- input is num ");
        int temp = bin, powCounter = 0, dec = 0;
        while (temp > 0) {
            dec += (temp % 10) * (1 << powCounter);
            temp /= 10;
            powCounter++;
        }
        System.out.printf("%d\n", dec);
    }

    public static void decimalToOctal(int n) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (n > 0) {
            stack.push(n % 8);
            n /= 8;
        }
        System.out.printf("DecimalToOctal--- %s\n", stack);
    }

    public static void octalToDecimal(int n) {

        int counter = 0, num = 0;
        while (n > 0) {
            num += (n % 10) * (1 << (counter * 3));
            n /= 10;
            counter++;
        }
        System.out.printf("OctalToDecimal--- %d\n", num);
    }

    public static void decimalToHexadecimal(int n) {

        HashMap<Integer, String> hex = new HashMap<>();
        hex.put(10, "A");
        hex.put(11, "B");
        hex.put(12, "C");
        hex.put(13, "D");
        hex.put(14, "E");
        hex.put(15, "F");
        StringBuilder str = new StringBuilder();
        int rem = 0;
        while (n > 0) {
            rem = n % 16;
            if (rem > 9) {
                str.append(hex.get(rem));
            } else {
                str.append(rem);
            }
            n /= 16;
        }
        System.out.printf("DecimalToHex --- %s\n", str.reverse());
    }

    public static void hexadecimalTodecimal(String hexValue) {

        HashMap<Character, Integer> hex = new HashMap<>();
        hex.put('A', 10);
        hex.put('B', 11);
        hex.put('C', 12);
        hex.put('D', 13);
        hex.put('E', 14);
        hex.put('F', 15);
        int len = hexValue.length(), totalNum = 0, num = 0;
        char temp;
        for (int index = 0; index < len; index++) {

            temp = hexValue.charAt(index);
            if ((temp - '0') > 9) {
                num = hex.get(temp);
            } else {
                num = temp - '0';
            }
            totalNum += num * (1 << ((len - 1 - index) * 4));

        }
        System.out.printf("HexadecimalToDecimal ---- %d", totalNum);
    }
}
