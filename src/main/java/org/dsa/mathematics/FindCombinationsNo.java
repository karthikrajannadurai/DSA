package org.dsa.mathematics;

public class FindCombinationsNo {
    public static void main(String[] args) {
        findCombinations(7, 3);// TC -- O(n*k) SC- O(k)
        findCombinationsNo(30, 15);
    }

    public static void findCombinations(int n, int k) {
        int[] arr = new int[k + 1];
        arr[0] = 1;
        for (int index = 1; index <= n; index++) {
            for (int j = Math.min(index, k); j > 0; j--) {
                arr[j] = (arr[j - 1] + arr[j]);
            }
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println(arr[k]);
    }

    public static void findCombinationsNo(int n, int k) {

        if (k == 0 || n == 0) {
            System.out.println(1);
        }
        if (k > n) {
            System.out.println(0);
        }
        int ans = 1;
        for (int index = 1; index <= k; index++) {
            ans *= (n - index + 1);
            ans /= index;
        }
        System.out.println(ans);
    }
}
