package org.dsa.mathematics;

public class ValueOfPolinomial {
    public static void main(String[] args) {
        valueOfPolinomial(new int[]{2, -6, 2, -1},3);
    }

    public static void valueOfPolinomial(int[] n, int x) {
        int power = 1, ans = 0;
        for (int index = n.length - 2; index >= 0; index--) {
            power = power * x;
            ans += power * n[index];

        }
        ans += n[n.length - 1];
        System.out.println(ans);
    }
}
