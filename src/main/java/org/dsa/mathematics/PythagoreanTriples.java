package org.dsa.mathematics;

public class PythagoreanTriples {
    public static void main(String[] args) {
        generatePythagoreanTriple(20);
    }

    public static void generatePythagoreanTriple(int limit) {

        int m = 2, a = 0, b = 0, c = 0;
        while (c < limit) {
            for (int n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (c > limit) {
                    break;
                }
                System.out.printf("%d %d %d\n", a, b, c);
            }

            m++;
        }
    }
}
