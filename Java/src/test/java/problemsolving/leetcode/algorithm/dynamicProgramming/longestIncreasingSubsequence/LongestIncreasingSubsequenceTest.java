package problemsolving.leetcode.algorithm.dynamicProgramming.longestIncreasingSubsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceTest {
    @Test
    public void testCase01() {
        int[] input = {10, 9, 2, 5, 3, 7, 101, 18};

        int output = new LongestIncreasingSubsequence().lengthOfLIS(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase02() {
        int[] input = {0, 1, 0, 3, 2, 3};

        int output = new LongestIncreasingSubsequence().lengthOfLIS(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[] input = {7, 7, 7, 7, 7, 7, 7};

        int output = new LongestIncreasingSubsequence().lengthOfLIS(input);

        assertEquals(1, output);
    }
}