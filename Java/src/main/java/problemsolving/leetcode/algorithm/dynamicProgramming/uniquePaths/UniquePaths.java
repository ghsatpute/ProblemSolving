package problemsolving.leetcode.algorithm.dynamicProgramming.uniquePaths;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int row = m;
        int column = n;

        int[][] answers = new int[row][column];
        Arrays.fill(answers[row - 1], 1);
        for (int i = 0; i < row; i++) answers[i][column-1] = 1;
        int i = 0;

        for (i = row - 2; i >= 0; i--) {
            for (int j = column - 2; j >= 0; j--) {
                answers[i][j] = answers[i][j + 1] + answers[i + 1][j];
                int k = 0;
            }
        }

        return answers[0][0];
    }
}
