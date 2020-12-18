package problemsolving.leetcode.algorithm.dynamicProgramming.editDistance;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return 0;
        }
        if (word1 == null) {
            return word2.length();
        }

        if (word2 == null) {
            return word1.length();
        }

        int[][] memo = new int[word1.length() + 1][word2.length() + 1];

        /*
         *      ""  r   o   s
         *  ""  0   1   2   3
         *   h  1   1   2
         *   o  2
         *   r  3
         *   s  4
         *   e  5
         */

        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0) {
                    memo[i][j] = j;
                    continue;
                }
                if (j == 0) {
                    memo[i][j] = i;
                    continue;
                }

                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    memo[i][j] = memo[i - 1][j - 1];
                    continue;
                }

                int insertDistance = memo[i - 1][j];
                int deleteDistance = memo[i][j - 1];
                int replaceDistance = memo[i - 1][j - 1];
                memo[i][j] = 1 + Math.min(Math.min(insertDistance, deleteDistance), replaceDistance);
            }
        }
        return memo[word1.length()][word2.length()];
    }

    public int minDistanceBruteForce(String word1, String word2) {

        if (word1 == null && word2 == null) {
            return 0;
        }

        if (word1 == null) {
            return word2.length();
        }
        if (word2 == null) {
            return word1.length();
        }

        if (word1.length() == 0 && word2.length() == 0) {
            return 0;
        }

        if (word1.length() == 0) {
            return word2.length();
        }

        if (word2.length() == 0) {
            return word1.length();
        }

        if (word1.charAt(0) == word2.charAt(0)) {
            return minDistanceBruteForce(word1.substring(1), word2.substring(1));
        }

        int insertDistance = Integer.MAX_VALUE;
        if (word1.length() < word2.length()) {
            insertDistance = 1 + minDistanceBruteForce(word2.charAt(0) + word1, word2);
        }

        int deleteDistance = 1 + minDistanceBruteForce(word1.substring(1), word2);

        int replaceDistance = 1 + minDistanceBruteForce(word2.charAt(0) + word1.substring(1), word2);

        return Math.min(Math.min(insertDistance, deleteDistance), replaceDistance);
    }
}
