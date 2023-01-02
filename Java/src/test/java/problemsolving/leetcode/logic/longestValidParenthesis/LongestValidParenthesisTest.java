package problemsolving.leetcode.logic.longestValidParenthesis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestValidParenthesisTest {
    @Test
    public void testCase01() {
        String input = "";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        String input = "(";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase03() {
        String input = ")";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase04() {
        String input = "()";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase05() {
        String input = ")))))()";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase06() {
        String input = "((()))";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(6, output);
    }

    @Test
    public void testCase07() {
        String input = "()()()";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(6, output);
    }

    @Test
    public void testCase08() {
        String input = "(())()";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(6, output);
    }

    @Test
    public void testCase09() {
        String input = "(()";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase10() {
        String input = ")()())";

        int output = new LongestValidParenthesis().longestValidParentheses(input);

        assertEquals(4, output);
    }
}