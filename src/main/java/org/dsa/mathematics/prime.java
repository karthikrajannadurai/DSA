package org.dsa.mathematics;

public class prime {
    public static void main(String[] args) {
//        System.out.println(ONApproach(7));
//        System.out.println(OLogNApproach(13));
        sieveOfMethod(100);
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
}
