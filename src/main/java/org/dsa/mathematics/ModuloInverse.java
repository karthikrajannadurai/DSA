package org.dsa.mathematics;

public class ModuloInverse {
    public static void main(String[] args) {
        moduloInverse(888, 54);
    }

    public static void moduloInverse(int n, int mod) {
        for (int i = 1; i <= mod; i++) {
            if ((n * i) % mod == 1) {
                System.out.println(i);
            }
        }
    }

}
