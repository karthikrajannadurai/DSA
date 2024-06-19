package org.dsa.Matrix;

public class CountNoOfPathFromUniqueFromTopLeftToBottomRight {
    
    public static void main(String[] args) {
        System.out.println(bruteForce(new int[4][4], 0, 0));
        System.out.println(memoization(new int[4][4], new int[4][4], 0, 0));
    }

    public static int bruteForce(int[][] matrix, int r, int c) {

        if (r == matrix.length || c == matrix[0].length) {
            return 0;
        }
        if (r == matrix.length - 1 && c == matrix[0].length - 1) {
            return 1;
        }

        return bruteForce(matrix, r + 1, c) + bruteForce(matrix, r, c + 1);
    }

    public static int memoization(int[][] matrix, int[][] cache, int r, int c) {

        if (r == matrix.length || c == matrix[0].length) {
            return 0;
        }
        if (cache[r][c] > 0) {
            return cache[r][c];
        }
        if (r == matrix.length - 1 && c == matrix[0].length - 1) {
            return 1;
        }

        cache[r][c] = (memoization(matrix, cache, r + 1, c) + memoization(matrix, cache, r, c + 1));
        return cache[r][c];
    }
}
