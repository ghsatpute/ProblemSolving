package problemsolving.leetcode.algorithm.dynamicProgramming.minimumPathSum;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int[][] dp = new int[grid.length][grid[0].length];

        int sum = grid[0][0];
        dp[0][0] = sum;

        for (int i = 1; i < grid[0].length; i++) {
            sum += grid[0][i];
            dp[0][i] = sum;
        }

        sum = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            sum += grid[i][0];
            dp[i][0] = sum;
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }

        // System.out.println(Arrays.deepToString(dp));

        return dp[grid.length-1][grid[0].length -1];
    }
}
