package org.dsa.mathematics;

public class LargestPossibleXDividesN {
    public static void main(String[] args) {
        largestPossibleXDividesN(10, 5);
    }

    public static void largestPossibleXDividesN(int n, int p) {

        int ans = 0;
        while (n > 0) {
            n /= p;
            ans += n;
        }
        System.out.println(ans);
    }
}
