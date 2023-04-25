package problemsolving.leetcode.algorithm.dynamicProgramming.longestIncreasingPathInAMatrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestIncreasingPathInAMatrixDynamicProgrammingTest {
    @Test
    public void testCase01() {
        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };

        int output = new LongestIncreasingPathInAMatrixDynamicProgramming().longestIncreasingPath(matrix);

        assertEquals(4, output);
    }

    @Test
    public void testCase02() {
        int[][] matrix = {
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        };

        int output = new LongestIncreasingPathInAMatrixDynamicProgramming().longestIncreasingPath(matrix);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[][] matrix = {{1}};

        int output = new LongestIncreasingPathInAMatrixDynamicProgramming().longestIncreasingPath(matrix);

        assertEquals(1, output);
    }
}