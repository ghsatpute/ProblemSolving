package problemsolving.leetcode.logic.productOfArrayExceptSelf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTwoArraySolutionTest {
    @Test
    public void testCase01() {
        int[] input = {1,2,3,4};

        int[] output = new ProductOfArrayExceptSelfTwoArraySolution().productExceptSelf(input);

        assertEquals(4, output.length);
        assertEquals(24, output[0]);
        assertEquals(12, output[1]);
        assertEquals(8, output[2]);
        assertEquals(6, output[3]);
    }

    @Test
    public void testCase02() {
        int[] input = {-1,1,0,-3,3};

        int[] output = new ProductOfArrayExceptSelfTwoArraySolution().productExceptSelf(input);

        assertEquals(5, output.length);
        assertEquals(0, output[0]);
        assertEquals(0, output[1]);
        assertEquals(9, output[2]);
        assertEquals(0, output[3]);
        assertEquals(0, output[4]);
    }

    @Test
    public void testCase03_leetCode() {
        int[] input = {4,3,2,1,2};

        int[] output = new ProductOfArrayExceptSelfTwoArraySolution().productExceptSelf(input);

        // Expected = [12,16,24,48,24]
        assertEquals(5, output.length);
        assertEquals(12, output[0]);
        assertEquals(16, output[1]);
        assertEquals(24, output[2]);
        assertEquals(48, output[3]);
        assertEquals(24, output[4]);
    }
}