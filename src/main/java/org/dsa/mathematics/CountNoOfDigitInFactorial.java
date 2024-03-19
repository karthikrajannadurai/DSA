package org.dsa.mathematics;

public class CountNoOfDigitInFactorial {
    public static void main(String[] args) {
        System.out.println(noOfDigits(120));
    }

    public static double noOfDigits(int n) {
        return Math.ceil((n * Math.log(n) - n) / Math.log(10)) + 1;
    }
}
