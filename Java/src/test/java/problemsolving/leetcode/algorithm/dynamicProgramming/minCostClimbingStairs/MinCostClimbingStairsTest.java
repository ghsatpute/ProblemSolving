package problemsolving.leetcode.algorithm.dynamicProgramming.minCostClimbingStairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {
    @Test
    public void testCase01() {
        int[] input = {10, 15, 20};

        int output = new MinCostClimbingStairs().minCostClimbingStairs(input);

        assertEquals(15, output);
    }

    @Test
    public void testCase02() {
        int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        int output = new MinCostClimbingStairs().minCostClimbingStairs(input);

        assertEquals(6, output);
    }
}