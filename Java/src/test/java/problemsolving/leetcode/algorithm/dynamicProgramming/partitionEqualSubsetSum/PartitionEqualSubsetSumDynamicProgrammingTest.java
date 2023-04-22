package problemsolving.leetcode.algorithm.dynamicProgramming.partitionEqualSubsetSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartitionEqualSubsetSumDynamicProgrammingTest {
    @Test
    public void testCase01() {
        int[] input = {1, 5, 11, 5};

        boolean output = new PartitionEqualSubsetSumDynamicProgramming().canPartition(input);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        int[] input = {1, 2, 3, 5};

        boolean output = new PartitionEqualSubsetSumDynamicProgramming().canPartition(input);

        assertFalse(output);
    }

    @Test
    public void testCase03() {
        int[] input = {14, 9, 8, 4, 3, 2};

        boolean output = new PartitionEqualSubsetSumDynamicProgramming().canPartition(input);

        assertTrue(output);
    }

    @Test
    public void testCase04() {
        int[] input =
                {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 99, 97};

        boolean output = new PartitionEqualSubsetSumDynamicProgramming().canPartition(input);

        assertFalse(output);
    }

    @Test
    public void testCase05_leetCode() {
        int[] input =
                {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
                        100, 100, 100, 100, 100, 100, 100, 99, 97};

        boolean output = new PartitionEqualSubsetSumDynamicProgramming().canPartition(input);

        assertFalse(output);
    }

    @Test
    public void testCase06_leetCode() {
        int[] input = {20, 1, 16, 2, 17, 16, 8, 15, 7};

        boolean output = new PartitionEqualSubsetSumDynamicProgramming().canPartition(input);

        assertTrue(output);
    }
}