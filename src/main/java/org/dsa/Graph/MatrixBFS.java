package org.dsa.Graph;

import java.util.ArrayDeque;

public class MatrixBFS {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}
        };
        System.out.println(matrixBFS(matrix));
    }

    public static int matrixBFS(int[][] matrix) {

//        int ROWLENGTH = matrix.length, COLLENGTH = matrix[0].length;
        int ROWLENGTH = 3, COLLENGTH = 2;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[2]);
        int length = 0;
        int[][] visit = new int[4][4];
        visit[0][0] = 1;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int index = 0; index < queueSize; index++) {

                int[] pair = queue.poll();
                int r = pair[0], c = pair[1];

                if (r == ROWLENGTH - 1 && c == COLLENGTH - 1) {
                    return ++length;
                }

                int[][] neighbors = new int[][]{{r, c + 1}, {r, c - 1}, {r + 1, c}, {r - 1, c}}; // important directions
                for (int directions = 0; directions < 4; directions++) {

                    int newRow = neighbors[directions][0], newCol = neighbors[directions][1];
                    if (Math.min(newRow, newCol) < 0 || newRow == ROWLENGTH || newCol == COLLENGTH || matrix[newRow][newCol] == 1 || visit[newRow][newCol] == 1) {
                        continue;
                    }
                    queue.add(neighbors[directions]);
                    visit[newRow][newCol] = 1;
                }
            }
            length++;
        }
        return length;
    }
}
