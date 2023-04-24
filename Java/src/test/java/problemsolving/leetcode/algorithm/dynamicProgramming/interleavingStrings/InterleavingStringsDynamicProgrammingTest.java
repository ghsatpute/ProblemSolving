package problemsolving.leetcode.algorithm.dynamicProgramming.interleavingStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterleavingStringsDynamicProgrammingTest {
    @Test
    public void testCase01() {
        String string1 = "aabcc";
        String string2 = "dbbca";
        String string3 = "aadbbcbcac";

        boolean output = new InterleavingStringsDynamicProgramming().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        String string1 = "aabcc";
        String string2 = "dbbca";
        String string3 = "aadbbbaccc";

        boolean output = new InterleavingStringsDynamicProgramming().isInterleave(string1, string2, string3);

        assertFalse(output);
    }

    @Test
    public void testCase03() {
        String string1 = "";
        String string2 = "";
        String string3 = "";

        boolean output = new InterleavingStringsDynamicProgramming().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase04() {
        String string1 = "abc";
        String string2 = "";
        String string3 = "";

        boolean output = new InterleavingStringsDynamicProgramming().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase05() {
        String string1 = "aa";
        String string2 = "ab";
        String string3 = "abaa";

        boolean output = new InterleavingStringsDynamicProgramming().isInterleave(string1, string2, string3);

        assertTrue(output);
    }

    @Test
    public void testCase06() {
        // This test used to take ~52 seconds in brute force, now takes 1ms
        String string1 = "aaaaaaaaaaaaaaaaa";
        String string2 = "aaaaaaaaaaaaaaaaa";
        String string3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        boolean output = new InterleavingStringsDynamicProgramming().isInterleave(string1, string2, string3);

        assertTrue(output);
    }
}