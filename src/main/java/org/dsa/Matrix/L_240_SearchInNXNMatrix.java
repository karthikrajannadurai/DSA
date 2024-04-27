package org.dsa.Matrix;

public class L_240_SearchInNXNMatrix {

    /**
     * In this sorted matrix, each row have sorted in ascending order. its NxN
     * [[10,20,30,40],
     * [15,25,35,45],
     * [27,29,37,48],
     * [32,33,39,51]]
     *
     * @param matrix
     * @param target
     * @return
     */
    public static boolean search(int[][] matrix, int target) {

        int i = 0, j = matrix[0].length - 1, n = matrix.length;
        while (j >= 0 && i < n) {

            if (matrix[i][j] == target) {
                return true;
            }
            if (target < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(search(new int[][]{{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 51}}, 40));
    }
}
