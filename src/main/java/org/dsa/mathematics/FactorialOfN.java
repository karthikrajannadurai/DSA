package org.dsa.mathematics;

public class FactorialOfN {
    public static void main(String[] args) {
        factorialOfN(4);
    }

    public static void factorialOfN(int n) {
        int pro = 1;
        for (int index = 1; index <= n; index++) {
            pro *= index;
        }
        System.out.println(pro);
    }
}
