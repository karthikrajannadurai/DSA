package org.dsa.mathematics;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6, base = 5, ans = 0;
        while (n > 0) {
            ans += (n & 1) * base;
            base = base * 5;
            n >>= 1;
        }
        System.out.println(ans);
    }
}
