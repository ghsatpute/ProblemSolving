package algorithms.dynamicprogramming.longestCommonSubsequence;

public class LongestCommonSubsequenceRecursive {
    public static int solve(String s1, String s2) {
        return solve(s1, s2, 0, 0);
    }

    private static int solve(String s1, String s2, int i1, int i2) {
        if (i1 >= s1.length() || i2 >= s2.length()) {
            return 0;
        }

        if (s1.charAt(i1) == s2.charAt(i2)) {
            return 1 + solve(s1, s2, i1 + 1, i2 + 1);
        }

        return Math.max(solve(s1, s2, i1 + 1, i2), solve(s1, s2, i1, i2 + 1));
    }
}
