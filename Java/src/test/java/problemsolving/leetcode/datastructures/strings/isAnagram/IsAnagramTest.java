package problemsolving.leetcode.datastructures.strings.isAnagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsAnagramTest {
    @Test
    public void testCase01() {
        String s = "anagram", t = "nagaram";

        boolean output = new IsAnagram().isAnagram(s, t);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        String s = "rat", t = "car";

        boolean output = new IsAnagram().isAnagram(s, t);

        assertFalse(output);
    }

}