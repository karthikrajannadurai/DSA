package org.dsa.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 8, 7, 6, 5, 2};
        int n = 8;
        double sum = n * (n + 1) * 0.5;
        for (int i : arr) {
            sum = sum - i;
        }
        System.out.println(sum);
    }
}
