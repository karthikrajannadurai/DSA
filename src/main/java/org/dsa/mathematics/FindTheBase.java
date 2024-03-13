package org.dsa.mathematics;

public class FindTheBase {
    public static void main(String[] args) {
        pow(4, 81);
    }

    //    log10 b = (log10 a)/2 = p
//    b=10^p
    public static void pow(int x, int a) {
        double r = Math.log10(a) / x;
        r = Math.pow(10, r);
        if (r % 1 == 0) {
            System.out.println("possible " + r);
        } else {
            System.out.println("Not Possible");
        }
    }
}
