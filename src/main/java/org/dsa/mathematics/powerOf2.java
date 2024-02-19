package org.dsa.mathematics;

public class powerOf2 {
    public static void main(String[] args) {
        int n = 32;
        System.out.println((n & (n - 1)) == 0);
    }
}
