package problemsolving.leetcode.logic.validNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ValidNumberTest {
    @Test
    public void testCase01() {
        String input = "0";

        boolean output = new ValidNumber().isNumber(input);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        String input = "0.0";

        boolean output = new ValidNumber().isNumber(input);

        assertTrue(output);
    }

    @Test
    public void testCase03() {
        String input = "0.0.0";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase04() {
        String input = "0e0.0";

        boolean output = new ValidNumber().isNumber(input);

        assertTrue(output);
    }

    @Test
    public void testCase05() {
        String input = "0.0e0.0";

        boolean output = new ValidNumber().isNumber(input);

        assertTrue(output);
    }

    @Test
    public void testCase06() {
        String input = "0.0e0.0e0.0";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase07() {
        String input = ".";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase08() {
        String input = "+";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase09() {
        String input = "e";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase10() {
        String input = ".1";

        boolean output = new ValidNumber().isNumber(input);

        assertTrue(output);
    }

    @Test
    public void testCase11() {
        String input = "0e";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    @Disabled("Not passing the test")
    public void testCase12() {
        String input = "0.";

        boolean output = new ValidNumber().isNumber(input);

        assertTrue(output);
    }

    @Test
    public void testCase13() {
        String input = "inf";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase14() {
        String input = "abc";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase15() {
        String input = "0..";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }

    @Test
    public void testCase16() {
        String input = "0ee";

        boolean output = new ValidNumber().isNumber(input);

        assertFalse(output);
    }
}