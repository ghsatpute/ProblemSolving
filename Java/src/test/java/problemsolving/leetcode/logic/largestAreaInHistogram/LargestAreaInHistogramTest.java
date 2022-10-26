package problemsolving.leetcode.logic.largestAreaInHistogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAreaInHistogramTest {

    @Test
    public void testCase01() {
        int[] input = new int[] { 2, 1, 5, 7, 2, 3};

        int output = new LargestAreaInHistogram().largestRectangleArea(input);

        assertEquals(10, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] { 2, 4 };

        int output = new LargestAreaInHistogram().largestRectangleArea(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] { 2, 2, 2};

        int output = new LargestAreaInHistogram().largestRectangleArea(input);

        assertEquals(6, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {};

        int output = new LargestAreaInHistogram().largestRectangleArea(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6};

        int output = new LargestAreaInHistogram().largestRectangleArea(input);

        assertEquals(12, output);
    }

}