package org.dsa.mathematics;

public class FindTwoUniqueNumber {
    public static void main(String[] args) {

        // Same code for finding the two missing numbers
        int[] arr = {3, 4, 3, 4, 9, 4, 4, 32, 7, 7};
        int xorWhole = 0, rightMostSetBit, a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            xorWhole ^= arr[i];
        }
        rightMostSetBit = xorWhole & (-xorWhole);
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightMostSetBit) != 0) {
                a ^= arr[i];
            } else {
                b ^= arr[i];
            }
        }
        System.out.println("a= " + a + " b= " + b);
    }
}
