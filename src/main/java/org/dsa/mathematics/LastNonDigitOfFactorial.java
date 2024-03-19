package org.dsa.mathematics;

public class LastNonDigitOfFactorial {
    public static void main(String[] args) {
        lastNonZeroDigit(99);
    }

    public static void lastNonZeroDigit(int n) {

        int a, b, power2, temp = 1;
        int[] lastDigitOfPowerOfTwo = new int[]{6, 2, 4, 8};
        int[] lastDigitFactorial = new int[]{1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
        while (n > 0) {
            if (n < 10) {
                System.out.println(lastDigitFactorial[n] + " " + temp);
                temp = (temp * lastDigitFactorial[n]) % 10;
                break;
            }
            a = n / 5;
            b = lastDigitFactorial[n % 5];
            System.out.println("a=" + a + " " + "b=" + b);
            power2 = lastDigitOfPowerOfTwo[a % 4];
            System.out.println("power=" + power2);
            temp = (temp * b * power2) % 10;
            System.out.println("temp= " + temp);
            n /= 5;
        }
        System.out.println(temp);
    }
}
