package problemsolving.leetcode.logic.maximalSquare;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        int maxSquareSize = 0;

        for (int i = 0; i < matrix.length; i++) {
            dp[i][0] = Character.getNumericValue(matrix[i][0]);
            if (dp[i][0] == 1) {
                maxSquareSize = 1;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i] = Character.getNumericValue(matrix[0][i]);
            if (dp[0][i] == 1) {
                maxSquareSize = 1;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }

                dp[i][j] = 1 + Math.min(
                        Math.min(dp[i-1][j], dp[i][j-1]),
                        dp[i-1][j-1]);

                if (dp[i][j] > maxSquareSize) {
                    maxSquareSize = dp[i][j];
                }
            }
        }

        return maxSquareSize * maxSquareSize;
    }
}
