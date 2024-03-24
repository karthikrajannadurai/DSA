package org.dsa.mathematics;

public class NthCatalanNumbers {
    public static void main(String[] args) {
        printNthCatalanNumbers(1); // TC - O(n2), SC - O(n)
        System.out.println();
        printNthCatalanNumberUsingCombination(1); // TC - O(n), SC - O(1)
    }

    public static void printNthCatalanNumbers(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        int res;
        for (int i = 2; i <= n; i++) {
            res = 0;
            for (int j = 0; j < i; j++) {
                res += arr[j] * arr[i - j - 1];
            }
            arr[i] = res;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void printNthCatalanNumberUsingCombination(int n) {

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= ((2 * n) - i + 1);
            res /= i;
        }
        System.out.print(res * (1.0 / (n + 1)));
    }
}
