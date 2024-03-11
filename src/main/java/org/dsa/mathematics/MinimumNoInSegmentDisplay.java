package org.dsa.mathematics;

public class MinimumNoInSegmentDisplay {
    public static void main(String[] args) {
        sevenSegment(new int[]{489, 206, 745, 123, 756});
    }

    public static void sevenSegment(int[] arr) {
        int counter, minimumCount = Integer.MAX_VALUE, finalIndex = 0, num;
        int[] sevenSegment = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 5};
        for (int index = 0; index < arr.length; index++) {
            counter = 0;
            num = arr[index];
            while (num > 0) {
                counter += sevenSegment[(num % 10)];
                num /= 10;
            }
            if (minimumCount > counter) {
                minimumCount = counter;
                finalIndex = index;
            }
        }
        System.out.println(arr[finalIndex]);
    }
}
