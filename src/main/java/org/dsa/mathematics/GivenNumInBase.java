package org.dsa.mathematics;

import java.util.ArrayList;

public class GivenNumInBase {
    public static void main(String[] args) {
        givenNumInBase(8, 2);
    }

    public static void givenNumInBase(int num, int len) {
        int rem, quotient;
        StringBuilder str;
        for (int index = 2; index <= 32; index++) {
            if (num < index) {
                System.out.println("index " + index + " " + 1);
                return;
            }
            str = new StringBuilder();
            quotient = num;
            while (quotient >= index) {
                rem = num % index;
                quotient = quotient / index;
                str.append(rem);
            }
            str.append(quotient);
            str = str.reverse();
            if (str.length() == len) {
                System.out.println("index " + index + " " + str.reverse());
                break;
            }
        }
    }
}
