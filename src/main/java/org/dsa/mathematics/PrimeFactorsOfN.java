package org.dsa.mathematics;

public class PrimeFactorsOfN {
    public static void main(String[] args) {
        primeFactors(4);
    }

    public static void primeFactors(int n) {

        int largestPrimeFactor = 0;

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
            largestPrimeFactor = 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n /= 3;
            largestPrimeFactor = 3;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                if (i > largestPrimeFactor) {
                    largestPrimeFactor = i;
                }
                System.out.print(i + " ");
                n /= i;
            }
            while (n % (i + 2) == 0) {
                if ((i + 2) > largestPrimeFactor) {
                    largestPrimeFactor = i + 2;
                }
                System.out.print(i + 2 + " ");
                n /= (i + 2);
            }
        }
        if (n > 2) {
            System.out.print(n + " ");
            if (n > largestPrimeFactor) {
                largestPrimeFactor = n;
            }
        }
        if (largestPrimeFactor == 0) {
            largestPrimeFactor = n;
        }
        System.out.println("LargestPrimeFactor -- " + largestPrimeFactor);
    }
}
