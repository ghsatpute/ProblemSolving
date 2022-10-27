package problemsolving.leetcode.algorithm.dynamicProgramming.minimumPathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

    @Test
    public void testCase01() {
        int[][] input = new int[0][0];

        int output = new MinimumPathSum().minPathSum(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        int[][] input = new int[][] { { 1 } };

        int output = new MinimumPathSum().minPathSum(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03_example1() {
        int[][] input = new int[][] {{1,3,1},{1,5,1},{4,2,1}};

        int output = new MinimumPathSum().minPathSum(input);

        assertEquals(7, output);
    }

    @Test
    public void testCase04_example2() {
        int[][] input = new int[][] {{1,2,3},{4,5,6}};

        int output = new MinimumPathSum().minPathSum(input);

        assertEquals(12, output);
    }



}