package org.dsa.mathematics;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("Normal method-- %.2f\n", squareRoot(40, 2));
        System.out.println("NewtonRamphson Method-- " + newtonRampsonMethod(40));
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

    static double newtonRampsonMethod(int N) {
        double root, x = N;
        while (true) {
            root = 0.5 * (x + (N / x));

            if (Math.abs(root - x) < 0.01) {
                break;
            }
            x = root;
        }
        return root;
    }
}
