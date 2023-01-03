package problemsolving.leetcode.algorithm.dynamicProgramming.houseRobber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseRobberBruteForceTest {
    @Test
    public void testCase01() {
        int[] input = new int[0];

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {1, 2};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {1, 2, 1};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[] {1, 2, 2};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase06() {
        int[] input = new int[] {1, 2, 1, 2};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase07() {
        int[] input = new int[] {1, 1, 1, 1, 2, 2, 2, 2, 2};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(8, output);
    }

    @Test
    public void testCase08_1milliseconds() {
        int[] input = new int[] {1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(15, output);
    }

    @Test
    public void testCase09_3milliseconds() {
        int[] input = new int[] {1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(18, output);
    }

    @Test
    public void testCase10_123milliseconds() {
        int[] input = new int[] {
                1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1,
                1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 1};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(27, output);
    }

    @Test
    public void testCase11_142milliseconds() {
        int[] input = new int[] {
                1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1,
                1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 1,
                1, 1, 1, 1, 1};

        int output = new HouseRobberBruteForce().rob(input);

        assertEquals(30, output);
    }
}