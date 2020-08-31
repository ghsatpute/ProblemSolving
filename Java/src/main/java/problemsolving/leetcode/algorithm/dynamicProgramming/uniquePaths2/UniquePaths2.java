package problemsolving.leetcode.algorithm.dynamicProgramming.uniquePaths2;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][column - 1] == 1) return 0;

        if (row == 1) {
            for (int k = 0; k < obstacleGrid[0].length; k++) {
                if (obstacleGrid[0][k] == 1) return 0;
            }
        }

        if (column == 1) {
            for (int[] ints : obstacleGrid) {
                if (ints[0] == 1) return 0;
            }
        }

        int[][] answers = new int[row][column];
        answers[row - 1][column - 1] = 1;

        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                if (obstacleGrid[i][j] != 1) {
                    if ((j == column - 1) && (i == row - 1)) {
                        answers[i][j] = 1;
                    } else {
                        answers[i][j] =
                                ((j == column - 1) ? 0 : answers[i][j + 1])
                                        + ((i == row - 1) ? 0 : answers[i + 1][j]);
                    }
                } else {
                    answers[i][j] = 0;
                }
            }
        }

        return answers[0][0];
    }
}
