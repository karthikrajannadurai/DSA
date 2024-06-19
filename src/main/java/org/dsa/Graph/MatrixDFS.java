package org.dsa.Graph;

public class MatrixDFS {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {0, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}
        };
        int[][] visit = new int[matrix.length][matrix[0].length];
        System.out.println(matrixDFS(matrix, 0, 0, visit, 3, 3));
    }

    public static int matrixDFS(int[][] matrix, int sr, int sc, int[][] visit, int er, int ec) {

        if (Math.min(sr, sc) < 0 || sr == matrix.length || sc == matrix[0].length || matrix[sr][sc] == 1 || visit[sr][sc] == 1) {
            return 0;
        }
        if (sr == er && sc == ec) {
            return 1;
        }
        visit[sr][sc] = 1;
        int count = 0;
        count += matrixDFS(matrix, sr - 1, sc, visit, er, ec);
        count += matrixDFS(matrix, sr + 1, sc, visit, er, ec);
        count += matrixDFS(matrix, sr, sc + 1, visit, er, ec);
        count += matrixDFS(matrix, sr, sc - 1, visit, er, ec);
        visit[sr][sc] = 0; // once found the path, while backtracking mark node as not visited
//        so it can be useful to find the next path.
        return count;
    }
}
