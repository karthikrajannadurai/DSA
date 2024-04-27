package org.dsa.Matrix;

import java.util.LinkedList;
import java.util.List;

public class L_54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new LinkedList<>();
        int rowStart = 0, rowEnd = matrix.length, columnStart = 0, columnEnd = matrix[0].length;
        while (columnStart < columnEnd && rowStart < rowEnd) {
            for (int j = columnStart; j < columnEnd; j++) {
                ans.add(matrix[rowStart][j]);
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++) {
                ans.add(matrix[i][columnEnd - 1]);
            }
            columnEnd--;

            if (rowStart < rowEnd) {
                for (int i = columnEnd - 1; i >= columnStart; i--) {
                    ans.add(matrix[rowEnd - 1][i]);
                }
            }
            rowEnd--;

            if (columnStart < columnEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    ans.add(matrix[i][columnStart]);
                }
            }
            columnStart++;

        }
        return ans;
    }
}
