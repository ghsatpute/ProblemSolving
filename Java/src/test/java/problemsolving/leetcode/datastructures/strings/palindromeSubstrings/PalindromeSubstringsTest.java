package problemsolving.leetcode.datastructures.strings.palindromeSubstrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeSubstringsTest {

    @Test
    public void testCase01() {
        String input = "abc";

        int output = new PalindromeSubstrings().countSubstrings(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        String input = "aaa";

        int output = new PalindromeSubstrings().countSubstrings(input);

        assertEquals(6, output);
    }

}