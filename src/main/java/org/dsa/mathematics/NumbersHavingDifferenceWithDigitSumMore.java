package org.dsa.mathematics;

public class NumbersHavingDifferenceWithDigitSumMore {
    public static void main(String[] args) {
        diff(20, 20);
    }

    public static void diff(int n, int s) {

        int num = 0, counter, totalCount = 0;
        for (int index = 1; index <= n; index++) {
            num = index;
            counter = 0;
            while (num > 0) {
                counter += num % 10;
                num = num / 10;
            }
            if (Math.abs(index - counter) > s) {
                totalCount++;
            }
        }
        System.out.println("Total " + totalCount);
    }
}
