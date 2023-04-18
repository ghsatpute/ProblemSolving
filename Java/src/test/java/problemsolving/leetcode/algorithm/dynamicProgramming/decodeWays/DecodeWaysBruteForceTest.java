package problemsolving.leetcode.algorithm.dynamicProgramming.decodeWays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DecodeWaysBruteForceTest {
    @Test
    public void testCase01() {
        String input = "06";

        int output = new DecodeWaysBruteForce().numDecodings(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        String input = "66";

        int output = new DecodeWaysBruteForce().numDecodings(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        String input = "12";

        int output = new DecodeWaysBruteForce().numDecodings(input);

        assertEquals(2, output);
    }

    @Disabled("Disabling due to time it takes i.e. around 23 seconds. Will run it in DP version")
    @Test
    public void testCase04_leetCode() {
        String input = "111111111111111111111111111111111111111111111";

        int output = new DecodeWaysBruteForce().numDecodings(input);

        assertEquals(1836311903, output);
    }
}