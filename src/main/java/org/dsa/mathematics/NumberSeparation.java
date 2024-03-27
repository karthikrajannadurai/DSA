package org.dsa.mathematics;

public class NumberSeparation {
    public static void main(String[] args) {
        digitSeparation();
        findNoOfDigits();
        multipleMethod();
        divideAndConquerer();
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

    public static void divideAndConquerer() {
        System.out.println("Divide And Conquerer");
        int n = 9, length = 0;
        if (n < 100000) {
            if (n < 10000) {
                if (n < 1000) {
                    if (n < 100) {
                        if (n < 10) {
                            length = 1;
                        } else {
                            length = 2;
                        }
                    } else {
                        length = 3;
                    }
                } else {
                    length = 4;
                }
            } else {
                length = 5;
            }
        }
        System.out.println(length);
        System.out.println("------------------------------------------------");
//        10, 100, 1,000 , 10,000 , 1,00,000 , 10,00,000
        if (n < 1000000 && n >= 100000) { // 1000000 , 999999
            length = 6;
        } else if (n < 100000 && n >= 10000) {
            length = 5;
        } else if (n < 10000 && n >= 1000) {
            length = 4;
        } else if (n < 1000 && n >= 100) {
            length = 3;
        } else if (n < 100 && n >= 10) {
            length = 2;
        } else {
            length = 1;
        }
        System.out.println(length);
    }
}