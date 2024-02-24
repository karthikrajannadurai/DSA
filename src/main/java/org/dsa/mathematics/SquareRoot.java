package org.dsa.mathematics;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.2f", squareRoot(40, 2));
    }

    public static double squareRoot(int n, int p) {

        int s = 0, l = n, m = 0;
        double root = 0.0, incr = 0.1f;
        while (s < l) {
            m = s + (l - s) / 2;
            if (m * m == n) {
                return m;
            }
            if (m * m > n) {
                l = m - 1;
            } else {
                s = m + 1;
            }
        }
        root = m - 1 + root;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
