package problemsolving.leetcode.algorithm.dynamicProgramming.uniquePaths2;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePaths2Test {
    @Test
    public void testCase01() {
        int[][] input = new int[][] {
                {0, 0},
                {1, 0}
        };

        int output = new UniquePaths2().uniquePathsWithObstacles(input);

        assertEquals(1, output);
    }
}