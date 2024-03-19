package org.dsa.mathematics;

import java.util.ArrayList;

public class FactorialOfLargeNumbers {
    public static void main(String[] args) {
        factorialOfLargeNumbers(100);
    }

    public static void factorialOfLargeNumbers(int n) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
//        StringBuilder str = new StringBuilder();
//        str.append(1);
        for (int index = 2; index <= n; index++) {
            basicMultiplication(index, arr);
//            basicMultiplicationString(index, str);
        }
//        System.out.println(str.reverse());
        for (int index = arr.size() - 1; index >= 0; index--) {
            System.out.print(arr.get(index));
        }
    }

    public static void basicMultiplication(int multi, ArrayList<Integer> arr) {
        int carry = 0, res;
        for (int index = 0; index < arr.size(); index++) {
            res = (arr.get(index) * multi) + carry;
            carry = 0;
            if (res > 9) {
                arr.set(index, res % 10);
                carry = res / 10;
            } else {
                arr.set(index, res);
            }
        }
        if (carry != 0) {
            while (carry > 0) {
                arr.add(carry % 10);
                carry /= 10;
            }
        }
    }

    public static void basicMultiplicationString(int multi, StringBuilder str) {

        int carry = 0, res;
        for (int index = 0; index < str.length(); index++) {
            res = ((str.charAt(index) - '0') * multi) + carry;
            carry = 0;
            if (res > 9) {
                str.setCharAt(index, (char) ((res % 10) + 48));
                carry = res / 10;
            } else {
                str.setCharAt(index, (char) (res + 48));
            }
        }
        if (carry != 0) {
            while (carry > 0) {
                str.append(carry % 10);
                carry /= 10;
            }
        }
    }
}
