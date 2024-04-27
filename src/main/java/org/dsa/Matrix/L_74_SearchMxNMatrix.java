package org.dsa.Matrix;

public class L_74_SearchMxNMatrix {

    /**
     * Efficient solution is converting the mxn matrix to linear matrix.
     * calculate the row and column using formula.
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int column = matrix[0].length, row = matrix.length;
        int top = 1, bottom = row, mid = 0;
        while (top <= bottom) {

            mid = (top + bottom) / 2;
            if (target < matrix[mid - 1][column - 1]) {
                bottom = mid - 1;
            } else if (target > matrix[mid - 1][column - 1]) {
                top = mid + 1;
            } else {
                return true;
            }
        }

        System.out.println(mid);
        if (mid == row && target > matrix[mid - 1][column - 1]) {
            return false;
        }
        if (target > matrix[mid - 1][column - 1]) {
            mid++;
        }
        top = 1;
        bottom = column;
        row = mid;
        while (top <= bottom) {
            mid = (top + bottom) / 2;
            if (target == matrix[row - 1][mid - 1]) {
                return true;
            }
            if (target < matrix[row - 1][mid - 1]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }
        return false;
    }

    public boolean searchMatrixEfficient(int[][] matrix, int target) {
        int m = matrix.length , n = matrix[0].length;
        int l = 0 , r = m * n - 1;
        while(l<=r){
            int mid = (l+r)/2;
            int x = mid/n , y = mid%n;
            if(matrix[x][y]==target) return true;
            if(matrix[x][y]>target) r = mid -1;
            else l = mid + 1;
        }
        return false;
    }
}
