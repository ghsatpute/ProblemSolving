package problemsolving.leetcode.algorithm.dynamicProgramming.distinctSubsequneces;

public class DistinctSubsequencesDynamicProgramming {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length() + 1; i++) {
            // Because empty target string always matches
            dp[i][0] = 1;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    // If current characters are match, then we consider left-top cell
                    // as well as left cell and add that to current output
                    dp[i + 1][j + 1] = dp[i][j + 1] + dp[i][j];
                } else {
                    // If current character doesn't match, we can just consider only left cell as it is
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
