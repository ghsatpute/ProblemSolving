package problemsolving.leetcode.logic.isPalindrome;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {
    @Test
    public void testCase01() {
        String input = "aaa";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        String input = "abc";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertFalse(output);
    }

    @Test
    public void testCase03() {
        String input = "aaa aaa";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertTrue(output);
    }

    @Test
    public void testCase04() {
        String input = "a aaaaa";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertTrue(output);
    }

    @Test
    public void testCase05() {
        String input = "a aaaa a";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertTrue(output);
    }

    @Test
    public void testCase06() {
        String input = "a,!aaaa!, a";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertTrue(output);
    }

    @Test
    public void testCase07() {
        String input = "A man, a plan, a canal: Panama";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertTrue(output);
    }

    @Test
    public void testCase08() {
        String input = "race a car";

        boolean output = new IsPalindrome().isPalindrome(input);

        assertFalse(output);
    }

    @Test
    public void testCase09() {

        boolean output = new IsPalindrome().isPalindrome(null);

        assertTrue(output);
    }

    @Test
    public void testCase10() {

        boolean output = new IsPalindrome().isPalindrome("");

        assertTrue(output);
    }
}