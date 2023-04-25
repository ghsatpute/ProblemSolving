package problemsolving.leetcode.algorithm.dynamicProgramming.longestIncreasingPathInAMatrix;

public class LongestIncreasingPathInAMatrixDynamicProgramming {
    private int[][] matrix;
    private int[][] dp;
    private int numRows;
    private int numCols;
    private int maxAnswer;

    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        this.numRows = matrix.length;
        this.numCols = matrix[0].length;
        this.dp = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                dfs(i, j);
            }
        }

        return maxAnswer;
    }

    private int dfs(int row, int col) {
        if (row > numRows - 1 || col > numCols - 1) {
            return 0;
        }
        // For single element, at least path of 1 length will be there,
        // so if value is not zero means we've visited this cell
        if (dp[row][col] != 0) {
            return dp[row][col];
        }

        // Single element is always part longest increasing path of length 1
        int answer = 1;
        // Try to visit left cell
        if (col > 0 && matrix[row][col - 1] > matrix[row][col]) {
            int leftAnswer = 1 + dfs(row, col - 1);
            answer = Math.max(answer, leftAnswer);
        }

        // Try to visit right cell
        if (col < numCols - 1 && matrix[row][col + 1] > matrix[row][col]) {
            int rightAnswer = 1 + dfs(row, col + 1);
            answer = Math.max(answer, rightAnswer);
        }

        // Try to visit top cell
        if (row > 0 && matrix[row - 1][col] > matrix[row][col]) {
            int topAnswer = 1 + dfs(row - 1, col);
            answer = Math.max(answer, topAnswer);
        }

        // Try to visit bottom cell
        if (row < numRows - 1 && matrix[row + 1][col] > matrix[row][col]) {
            int bottomAnswer = 1 + dfs(row + 1, col);
            answer = Math.max(answer, bottomAnswer);
        }
        dp[row][col] = answer;
        maxAnswer = Math.max(maxAnswer, answer);

        return answer;
    }
}
