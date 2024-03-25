package org.dsa.mathematics;

public class prime {
    public static void main(String[] args) {
//        System.out.println(ONApproach(7));
//        System.out.println(OLogNApproach(13));
        sieveOfMethod(100);
        sixK1(200);
    }

    public static boolean ONApproach(int n) {
        if (n == 1 | n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean OLogNApproach(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sieveOfMethod(int n) {
        boolean[] wholeArray = new boolean[n + 1];
        for (int i = 2; (i * i) <= n; i++) {
            if (!wholeArray[i]) {
                for (int j = i + i; j <= n; j = j + i) {
                    if (j % i == 0) {
                        wholeArray[j] = true;
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!wholeArray[i]) {
                System.out.println(i);
            }
        }
    }

    public static void sixK1(int n) {

        if (n == 1) {
            System.out.println("Not Prime");
            return;
        }
        if (n == 2 || n == 3 || n == 5) {
            System.out.println("Prime");
            return;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");


    }
}
