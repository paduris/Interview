package com.inteview.question;

public class MaximalSquare {
    public static void main(String[] args) {
        int[][] a = new int[4][5];

        a[0][0] = 1;        a[0][1] = 1;        a[0][2] = 1;        a[0][3] = 1;
        a[0][4] = 1;        a[1][0] = 1;        a[1][1] = 1;        a[1][2] = 1;
        a[1][3] = 1;        a[1][4] = 1;        a[2][0] = 1;        a[2][1] = 1;
        a[2][2] = 1;        a[2][3] = 1;        a[2][4] = 1;        a[3][0] = 1;
        a[3][1] = 1;        a[3][2] = 1;        a[3][3] = 1;        a[3][4] = 1;

        System.out.println(maximalSquare(a));
    }


    private static int maximalSquare(int[][] matrix) {

        if (matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];

        int maxEdge = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxEdge = Math.max(maxEdge, dp[i][j]);
                }
            }
        }


        return maxEdge * maxEdge;
    }
}
