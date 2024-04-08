package org.dsa.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 54};
        int start = 0, end = arr.length - 1, temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
