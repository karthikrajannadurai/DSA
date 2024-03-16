package org.dsa.mathematics;

public class ModulePower {
    public static void main(String[] args) {
        modulePower(3, 4, 2);
    }

    public static void modulePower(int n, int p, int mod) {

        int ans = 1;
        while (p > 0) {

            if ((p & 1) == 1) {
                ans = (ans * n) % mod;
            }
            p >>= 1;
            n = (n * n) % mod;
        }
        System.out.println(ans % mod);
    }
}
