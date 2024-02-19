package org.dsa.mathematics;

public class PowerOfA_Power_B {
    public static void main(String[] args) {
        int power = 2, base = 2,ans=1;
        while (power > 0) {
            if ((power&1) == 1) {
                ans*=base;
            }
            power=power >> 1;
            base*=base;
        }
        System.out.println(ans);
    }
}
