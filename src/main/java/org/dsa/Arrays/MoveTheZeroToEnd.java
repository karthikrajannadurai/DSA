package org.dsa.Arrays;

public class MoveTheZeroToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 21, 0, 0, 0, 2};
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {

            if (arr[j] == 0 && arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
