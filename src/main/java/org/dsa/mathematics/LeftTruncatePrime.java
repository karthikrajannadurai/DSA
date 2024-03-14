package org.dsa.mathematics;

public class LeftTruncatePrime {
    public static void main(String[] args) {
        leftTruncatePrime(317);
    }

    public static void leftTruncatePrime(int n) {

        int temp = n, len = 0;
        while (temp > 0) {
            if (temp % 10 == 0) {
                System.out.println("No Left Truncatable");
                return;
            }
            temp /= 10;
            len++;
        }
        boolean[] arr = new boolean[n + 1];
        for (int index = 2; index <= Math.sqrt(n); index++) {
            if (!arr[index]) {
                for (int j = index + index; j <= n; j = j + index) {
                    if (j % index == 0) {
                        arr[j] = true;
                    }
                }
            }
        }
        while (len > 0) {
            System.out.print(n % (int) Math.pow(10, len) + " ");
            if (arr[n % (int) Math.pow(10, len)]) {
                System.out.println("Not Left Truncatable");
                return;
            }
            len--;
        }
        System.out.println("Left Truncatable");
    }
}
