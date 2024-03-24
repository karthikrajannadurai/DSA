package org.dsa.mathematics;

public class PascalTriangle {
    public static void main(String[] args) {

        pascalsTriangleDp(7); // TC - O(N2) SC - O(N2)
        System.out.println();
        pascalsTriangleUSingCombinations(7);
    }

    public static void pascalsTriangleDp(int n) {

        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        for (int row = 1; row < n; row++) {
            for (int backwardRow = row; backwardRow >= 0; backwardRow--) {
                if (backwardRow == 0) {
                    arr[row][backwardRow] = 1;
                } else {
                    arr[row][backwardRow] = arr[row - 1][backwardRow] + arr[row - 1][backwardRow - 1];
                }
            }
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void pascalsTriangleUSingCombinations(int n) {

        int res;
        for (int row = 1; row <=n; row++) {
            for (int column = 0; column < row; column++) {
                res = 1;
                for (int k = 1; k <= column; k++) {
                    res *= (row - k);
                    res /= k;
                }
                System.out.print(res + " ");
            }
            System.out.println();
        }

    }
}
