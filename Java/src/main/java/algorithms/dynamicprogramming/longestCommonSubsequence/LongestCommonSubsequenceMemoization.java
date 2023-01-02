package algorithms.dynamicprogramming.longestCommonSubsequence;

public class LongestCommonSubsequenceMemoization {
    String s1, s2;
    int memo[][];
    public LongestCommonSubsequenceMemoization(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        memo = new int[s1.length() + 1][s2.length() + 1];
        solve();
    }

    public int getSolutionLength() {
        return memo[s1.length()][s2.length()];
    }

    private void solve() {
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0) {
            return;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for(int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }
    }

    // Can cache this as well but kept it to practice writing logic. While computing it's easy to store the result.
    public String getSolution() {
        StringBuilder stringBuilder = new StringBuilder();
        int row = s1.length() - 1;
        int col = s2.length() - 1;

        for (; row >= 0 && col >= 0;) {
            if (s1.charAt(row) == s2.charAt(col)) {
                stringBuilder.insert(0, s1.charAt(row));
                row--;
                col--;
            } else {
                if (memo[row][col + 1] > memo[row + 1][col]) {
                    row--;
                } else {
                    col--;
                }
            }
        }

        return stringBuilder.toString();
    }
}
