package org.dsa.mathematics;

public class countNoOfTrailingZeros {
    public static void main(String[] args) {
        zer0s(20);
    }

    public static void zer0s(int n) {
        int ans = 0;
        for (int index = 5; n / index > 1; index *= 5) {
            ans += (n / index);
        }
        System.out.println(ans);
    }
}
