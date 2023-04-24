package problemsolving.leetcode.algorithm.dynamicProgramming.targetSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TargetSumDynamicProgrammingTest {
    @Test
    public void testCase01() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;

        int targetSumWays = new TargetSumDynamicProgramming().findTargetSumWays(nums, target);

        assertEquals(5, targetSumWays);
    }

    @Test
    public void testCase02() {
        int[] nums = {1};
        int target = 1;

        int targetSumWays = new TargetSumDynamicProgramming().findTargetSumWays(nums, target);

        assertEquals(1, targetSumWays);
    }

    @Test
    public void testCase03() {
        int[] nums = {1};
        int target = 2;

        int targetSumWays = new TargetSumDynamicProgramming().findTargetSumWays(nums, target);

        assertEquals(0, targetSumWays);
    }

    @Test
    public void testCase04() {
        // This used to take ~33 seconds in brute force, not it takes around 30ms
        int[] nums =
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 3;

        int targetSumWays = new TargetSumDynamicProgramming().findTargetSumWays(nums, target);

        assertEquals(1037158320, targetSumWays);
    }
}