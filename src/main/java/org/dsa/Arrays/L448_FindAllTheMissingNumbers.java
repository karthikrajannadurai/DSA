package org.dsa.Arrays;

public class L448_FindAllTheMissingNumbers {

    // in place of the missing numbers, they will give duplicate numbers
    public static void main(String[] args) {
        findMissingNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }

    public static void findMissingNumbers(int[] arr) {

        int n = 0;
        for (int i : arr) {
            n = Math.abs(i) - 1;
            if (arr[n] > 0) {
                arr[n] *= -1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
