package org.dsa.mathematics;

public class NumberSeparation {
    public static void main(String[] args) {
        digitSeparation();
        findNoOfDigits();
        multipleMethod();
    }

    //    1. Digit Separation
    public static void digitSeparation() {
        System.out.println("Digit Separation");
        int n = 12343;
        while (n != 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
        System.out.println("------------------------------------------------");
    }

    //    2. Find no of digit in number
    public static void findNoOfDigits() {
        System.out.println("Find No Of Digits");
        int n = 1212;
        System.out.println(Math.floor(Math.log10(n) + 1));
        System.out.println("------------------------------------------------");
    }

    //    3. find no of digit using multiples of 10
    public static void multipleMethod() {
        System.out.println("Multiple Method");
        int n = 1212;
        int length = 0;
        int temp = 1;
        while (temp <= n) {
            length++;
            temp = temp * 10;
        }
        System.out.println(length);
        System.out.println("------------------------------------------------");
    }
}