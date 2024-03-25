package org.dsa.mathematics;
// not interested half done
public class SieveOfAtkin {
    public static void main(String[] args) {
        sieveAtkin(200);
    }

    public static void sieveAtkin(int n) {

        if (n == 2 || n == 3 || n == 5) {
            System.out.println("prime");
        }
        int a;
        boolean[] arr = new boolean[n + 1];
        for (int b = 0; b <= n; b++) {
            arr[b] = false;
            for (int x = 1; x * x <= n; x++) {
                for (int y = 1; y * y <= n; y++) {

//                condition #1
                    a = 4 * x * x + y * y;
                    if (a <= n && (a % 12 == 1 || a % 12 == 5)) {
                        arr[a] = true;
                    }

//                condition #2
                    a = 3 * x * x + y * y;
                    if (a <= n && a % 12 == 7) {
                        arr[a] = true;
                    }

//                condition #3
                    a = 3 * x * x - y * y;
                    if (x > y && a <= n && a % 12 == 11) {
                        arr[a] = true;
                    }
                }
            }

            for (int i = 5; i * i <= n; i++) {
                if (arr[i]) {
                    for (int j = i * i; j <= n; j += i * i) {
                        arr[i] = false;
                    }
                }
            }

            for (int i = 5; i < arr.length; i++) {
                if (arr[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
