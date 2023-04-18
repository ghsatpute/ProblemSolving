package problemsolving.leetcode.algorithm.dynamicProgramming.decodeWays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeWaysDynamicProgrammingTest {
    @Test
    public void testCase01() {
        String input = "06";

        int output = new DecodeWaysDynamicProgramming().numDecodings(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        String input = "66";

        int output = new DecodeWaysDynamicProgramming().numDecodings(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        String input = "12";

        int output = new DecodeWaysDynamicProgramming().numDecodings(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase04_leetCode() {
        // In brute force, this took 23 seconds, now here it'll take around 2ms
        String input = "111111111111111111111111111111111111111111111";

        int output = new DecodeWaysDynamicProgramming().numDecodings(input);

        assertEquals(1836311903, output);
    }
}