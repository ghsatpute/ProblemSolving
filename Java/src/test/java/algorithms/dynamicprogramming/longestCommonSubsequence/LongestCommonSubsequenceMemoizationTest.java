package algorithms.dynamicprogramming.longestCommonSubsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceMemoizationTest {
    @Test
    public void testCase01() {
        String input1 = "abcdef";
        String input2 = "def";

        LongestCommonSubsequenceMemoization longestCommonSubsequenceMemoization
                = new LongestCommonSubsequenceMemoization(input1, input2);

        assertEquals(3, longestCommonSubsequenceMemoization.getSolutionLength());
        assertEquals("def", longestCommonSubsequenceMemoization.getSolution());
    }

    @Test
    public void testCase02() {
        String input1 = "abcdef";
        String input2 = "xyz";

        LongestCommonSubsequenceMemoization longestCommonSubsequenceMemoization
                = new LongestCommonSubsequenceMemoization(input1, input2);

        assertEquals(0, longestCommonSubsequenceMemoization.getSolutionLength());
        assertEquals("", longestCommonSubsequenceMemoization.getSolution());
    }

    @Test
    public void testCase03() {
        String input1 = "abcd";
        String input2 = "bd";

        LongestCommonSubsequenceMemoization longestCommonSubsequenceMemoization
                = new LongestCommonSubsequenceMemoization(input1, input2);

        assertEquals(2, longestCommonSubsequenceMemoization.getSolutionLength());
        assertEquals("bd", longestCommonSubsequenceMemoization.getSolution());
    }
}