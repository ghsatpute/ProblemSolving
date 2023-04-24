package problemsolving.leetcode.algorithm.dynamicProgramming.interleavingStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class InterleavingStringsBruteForceTest {
    @Test
    public void testCase01() {
        String string1 = "aabcc";
        String string2 = "dbbca";
        String string3 = "aadbbcbcac";

        boolean output = new InterleavingStringsBruteForce().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        String string1 = "aabcc";
        String string2 = "dbbca";
        String string3 = "aadbbbaccc";

        boolean output = new InterleavingStringsBruteForce().isInterleave(string1, string2, string3);

        assertFalse(output);
    }

    @Test
    public void testCase03() {
        String string1 = "";
        String string2 = "";
        String string3 = "";

        boolean output = new InterleavingStringsBruteForce().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase04() {
        String string1 = "abc";
        String string2 = "";
        String string3 = "";

        boolean output = new InterleavingStringsBruteForce().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase05() {
        String string1 = "aa";
        String string2 = "ab";
        String string3 = "abaa";

        boolean output = new InterleavingStringsBruteForce().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    @Disabled("This test takes 52 seconds to run. See DP solution to solve it")
    public void testCase06() {
        String string1 = "aaaaaaaaaaaaaaaaa";
        String string2 = "aaaaaaaaaaaaaaaaa";
        String string3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        boolean output = new InterleavingStringsBruteForce().isInterleave(string1, string2, string3);

        assertTrue(output);
    }
}