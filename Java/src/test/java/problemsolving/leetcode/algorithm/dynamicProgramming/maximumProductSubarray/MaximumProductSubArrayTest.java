package problemsolving.leetcode.algorithm.dynamicProgramming.maximumProductSubarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumProductSubArrayTest {
    @Test
    public void testCase01() {
        int[] input = {2, 3, -2, 4};

        int output = new MaximumProductSubArray().maxProduct(input);

        assertEquals(6, output);
    }

    @Test
    public void testCase02() {
        int[] input = {-2,0,-1};

        int output = new MaximumProductSubArray().maxProduct(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase03() {
        int[] input = {-3,-1,-1};

        int output = new MaximumProductSubArray().maxProduct(input);

        assertEquals(3  , output);
    }
}