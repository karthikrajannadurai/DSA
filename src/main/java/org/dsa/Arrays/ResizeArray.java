package org.dsa.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr.length);
        arr = resize(arr, arr.length);
        System.out.println(arr.length);
    }

    public static int[] resize(int[] arr, int n) {
        int[] temp = new int[n * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
