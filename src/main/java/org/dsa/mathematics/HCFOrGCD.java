package org.dsa.mathematics;

public class HCFOrGCD {
    public static void main(String[] args) {

        System.out.println("HCF " + hcfOrGcd(270, 192));
        System.out.println("LCM " + LCM(270, 192));
    }

    static int hcfOrGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return hcfOrGcd(b, a % b);
    }

    static int LCM(int a, int b) {

        return (a * b) / hcfOrGcd(a, b);
    }
}
