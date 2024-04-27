package org.dsa.Search;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 11));
        System.out.println(helper(new int[]{1, 2, 3, 4, 5, 6, 7}, 1));
    }

    public static boolean binarySearch(int[] arr, int num) {

        int mid, start = 1, end = arr.length;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid - 1] == num) {
                return true;
            } else if (num < arr[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static boolean helper(int[] arr, int num) {
        return binarySearchUsingRecursion(arr, 0, arr.length, num);
    }

    public static boolean binarySearchUsingRecursion(int[] arr, int start, int end, int num) {

        if (start > end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (arr[mid - 1] == num) {
            return true;
        }
        if (num < arr[mid-1]) {
            return binarySearchUsingRecursion(arr, start, mid - 1, num);
        } else {
            return binarySearchUsingRecursion(arr, mid + 1, end, num);
        }
    }
}