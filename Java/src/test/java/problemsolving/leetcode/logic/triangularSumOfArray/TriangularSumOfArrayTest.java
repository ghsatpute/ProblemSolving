package problemsolving.leetcode.logic.triangularSumOfArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangularSumOfArrayTest {
    @Test
    public void testCase01() {
        int[] input = new int[] { 1, 2, 3, 4, 5};

        int output = new TriangularSumOfArray().triangularSum(input);

        assertEquals(8, output);
    }
}