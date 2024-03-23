package org.dsa.mathematics;

public class fibonacciSeriesUsingMatrixMultiplication {
    public static void main(String[] args) {
        printMatrix(fibonacciGenerate(20));
//        test(3);
    }

//    public static void test(int n) {
//        printMatrix(matrixMultiplication(new int[][]{{2, 1}, {1, 1}}, new int[][]{{2, 1}, {1, 1}}, new int[][]{{0, 0}, {0, 0}}));
//    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fibonacciGenerate(int n) {

        int[][] base = new int[][]{{1, 1}, {1, 0}};
        int[][] fOfcontant = new int[][]{{1, 0}, {0, 0}};
        int[][] ans = new int[][]{{1, 0}, {0, 1}};
        int power = n - 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans = matrixMultiplication(ans, base);//ans*base;
                printMatrix(ans);
            }
            base = matrixMultiplication(base, base);//base*base;
            power >>= 1;
        }
        return matrixMultiplication(ans, fOfcontant);
    }

    public static int[][] matrixMultiplication(int[][] mat1, int[][] mat2) {

        int[] temp = new int[2];
        int[][] ans = new int[2][2];
        multiply(mat1[0][0], mat1[0][1], mat2, temp);
        ans[0][0] = temp[0];
        ans[0][1] = temp[1];
        multiply(mat1[1][0], mat1[1][1], mat2, temp);
        ans[1][0] = temp[0];
        ans[1][1] = temp[1];
        return ans;
    }

    public static void multiply(int a, int b, int[][] mat2, int[] temp) {
        temp[0] = (a * mat2[0][0]) + (b * mat2[1][0]);
        temp[1] = (a * mat2[0][1]) + (b * mat2[1][1]);
    }
}
