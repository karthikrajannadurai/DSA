package org.dsa.mathematics;

public class HCFOrGCD {
    public static void main(String[] args) {

        System.out.println("HCF " + hcfOrGcd(270, 192));
        System.out.println("LCM " + LCM(270, 192));
        System.out.println("GCD of array " + GCDForArray(new int[]{10, 2, 4, 6}));
        System.out.println("LCM of array " + LCMOfArray(new int[]{10, 2, 4, 6}));
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

    static int GCDForArray(int[] arr) {

        int result = arr[0];
        for (int j : arr) {

            result = hcfOrGcd(result, j);
        }
        return result;
    }

    static int LCMOfArray(int[] arr) {

        int result = arr[0];
        for (int j : arr) {

            result = LCM(result, j);
        }
        return result;
    }
}
