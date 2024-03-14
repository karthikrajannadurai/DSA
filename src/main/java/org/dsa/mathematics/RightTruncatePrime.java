package org.dsa.mathematics;

public class RightTruncatePrime {
    public static void main(String[] args) {
        rightTruncatablePrime(239);
    }

    public static void rightTruncatablePrime(int n) {

        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]) {
                for (int j = i + i; j <= n; j = j + i) {
                    if (j % i == 0) {
                        arr[j] = true;
                    }
                }
            }
        }
        int counter = 0;
        while (n > 0) {
            n = n / (int) Math.pow(10, counter);
            if (n == 0) {
                break;
            }
            System.out.print(n + " ");
            if (arr[n]) {
                System.out.println("Not Right Truncatable");
                return;
            }
            counter++;
        }
        System.out.println("Right Truncatable");
    }
}
