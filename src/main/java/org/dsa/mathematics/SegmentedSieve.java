package org.dsa.mathematics;

public class SegmentedSieve {
    public static void main(String[] args) {
        segmentedSieve(100, 127);
    }

    public static void segmentedSieve(int s, int e) {

        boolean[] arr = new boolean[e - s + 1];
        boolean[] sieve = new boolean[(int) Math.sqrt(e) + 1];

        simpleSieve(sieve, (int) Math.sqrt(e));
        int m;
        for (int prime = 2; prime < sieve.length; prime++) {
            if (!sieve[prime]) {
                m = (s / prime) * prime;
                if (m < s) {
                    m += prime;
                }
                if (m - prime == 0) {
                    m = m * prime;
                }
                for (int j = m; j <= e; j += prime) {
                    if (j % prime == 0) {
                        arr[j - s] = true;
                    }
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.print(i + s + " ");
            }
        }
    }

    public static void simpleSieve(boolean[] sieve, int n) {

        for (int i = 2; i <= n; i++) {
            if (!sieve[i]) {
                for (int j = i + i; j <= n; j = j + i) {
                    if (j % i == 0) {
                        sieve[j] = true;
                    }
                }
            }
        }
    }

}
