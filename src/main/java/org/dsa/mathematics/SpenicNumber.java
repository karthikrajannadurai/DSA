package org.dsa.mathematics;

import java.util.ArrayList;

public class SpenicNumber {
    public static void main(String[] args) {
        spenicNumber(105);
    }

    public static void spenicNumber(int n) {

        ArrayList<Integer> firstHalf = new ArrayList<>();
        ArrayList<Integer> secondHalf = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
                firstHalf.add(i);
                secondHalf.add(n / i);
                System.out.println(i + " " + n / i);
            }
        }
        if (count == 8) {
            System.out.println(firstHalf);
        }

        if (count != 8) {
            System.out.println("False");
            return;
        }
        boolean[] sieve = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!sieve[i]) {
                for (int j = i + i; j <= n; j += i) {
                    if (j % i == 0) {
                        sieve[j] = true;
                    }
                }
            }
        }
        int product = 1;
        count = 0;
        for (int num : firstHalf) {
            if (!sieve[num] && num != 1 && count <= 3) {
                product *= num;
                count++;
            }
        }
        for (int i = secondHalf.size() - 1; i >= 0; i--) {
            if (!sieve[secondHalf.get(i)] && count <= 3) {
                product *= secondHalf.get(i);
            }
        }
        System.out.println("SpenicNumber -- " + product);

    }
}
