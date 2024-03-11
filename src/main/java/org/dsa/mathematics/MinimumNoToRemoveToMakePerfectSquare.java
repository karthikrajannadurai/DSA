package org.dsa.mathematics;

public class MinimumNoToRemoveToMakePerfectSquare {
    public static void main(String[] args) {
        perfectSquare("8312");
    }

    public static void perfectSquare(String str) {

        int strLen = str.length();
        int ncr = 1 << strLen;
        int num = 0, combination = 0, counter = 0, lastDigit = 0;
        double sqrt;
        for (int index = 0; index < ncr; index++) {
            num = index;
            counter = 0;
            combination = 0;
            while (num > 0) {
                lastDigit = num & 1;
                if (lastDigit == 1) {
                combination = (combination * 10) + (str.charAt(counter) - '0');
                }
                num >>= 1;
                counter++;
            }
            sqrt = (int) Math.sqrt(combination);
            if ((sqrt * sqrt) == combination && combination != 0) {
                System.out.println("Perfect square is " + combination);
            }
        }
    }
}
