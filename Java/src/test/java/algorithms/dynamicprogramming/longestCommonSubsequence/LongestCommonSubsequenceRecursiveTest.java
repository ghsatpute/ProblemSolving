package algorithms.dynamicprogramming.longestCommonSubsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceRecursiveTest {

    @Test
    public void testCase01() {
        String input1 = "abcdef";
        String input2 = "def";

        int output = LongestCommonSubsequenceRecursive.solve(input1, input2);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        String input1 = "abcdef";
        String input2 = "xyz";

        int output = LongestCommonSubsequenceRecursive.solve(input1, input2);

        assertEquals(0, output);
    }

    @Test
    public void testCase03() {
        String input1 = "abcd";
        String input2 = "bd";

        int output = LongestCommonSubsequenceRecursive.solve(input1, input2);

        assertEquals(2, output);
    }
}