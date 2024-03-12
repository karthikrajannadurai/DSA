package org.dsa.mathematics;

public class MultiplyTwoPolynomial {

    public static void main(String[] args) {
        polynomial(new int[]{5, 0, 10, 6}, new int[]{1, 2, 4});
    }

    public static void polynomial(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length - 1];
        for (int index = 0; index < arr1.length; index++) {
            for (int j = 0; j < arr2.length; j++) {
                temp[index+j] += arr1[index] * arr2[j];
            }
        }
        for (int n : temp) {
            System.out.printf("%d ", n);
        }
    }
}
