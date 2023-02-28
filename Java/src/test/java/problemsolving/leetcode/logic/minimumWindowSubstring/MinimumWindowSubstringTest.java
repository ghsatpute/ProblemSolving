package problemsolving.leetcode.logic.minimumWindowSubstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {
    @Test
    public void testCase01() {
        String string = "a";
        String target = "abc";

        String output = new MinimumWindowSubstring().minWindow(string, target);

        assertEquals("", output);
    }

    @Test
    public void testCase02() {
        String string = "abc";
        String target = "abc";

        String output = new MinimumWindowSubstring().minWindow(string, target);

        assertEquals("abc", output);
    }

    @Test
    public void testCase03() {
        String string = "abcd";
        String target = "abc";

        String output = new MinimumWindowSubstring().minWindow(string, target);

        assertEquals("abc", output);
    }

    @Test
    public void testCase04_leetcode() {
        String string = "ADOBECODEBANC";
        String target = "ABC";

        String output = new MinimumWindowSubstring().minWindow(string, target);

        assertEquals("BANC", output);
    }

    @Test
    public void testCase05_leetcode() {
        String string = "a";
        String target = "a";

        String output = new MinimumWindowSubstring().minWindow(string, target);

        assertEquals("a", output);
    }

    @Test
    public void testCase06_leetcode() {
        String string = "a";
        String target = "aa";

        String output = new MinimumWindowSubstring().minWindow(string, target);

        assertEquals("", output);
    }
}