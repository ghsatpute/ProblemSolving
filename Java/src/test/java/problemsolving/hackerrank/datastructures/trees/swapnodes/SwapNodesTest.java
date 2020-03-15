package problemsolving.hackerrank.datastructures.trees.swapnodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesTest {

    @Test
    public void testCase01() {
        /*
         5
         2 3
         -1 4
         -1 5
         -1 -1
         -1 -1
         1
         2
         */

        int[][] indexes = new int[][] {
                {2, 3},
                {-1, 4},
                {-1, 5},
                {-1, -1},
                {-1, -1}
        };

        int[] queries = new int[] {2};

        int[][] result = SwapNodes.swapNodes(indexes, queries);

        assertArrayEquals(new int[] {4, 2, 1, 5, 3}, result[0]);

    }

    @Test
    public void testCase02() {
        /*
            11
            2 3
            4 -1
            5 -1
            6 -1
            7 8
            -1 9
            -1 -1
            10 11
            -1 -1
            -1 -1
            -1 -1
            2
            2
            4
         */

        int[][] indexes = new int[][] {
                {2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1},
        };

        int[] queries = new int[] {2, 4};

        // Execute
        int[][] result = SwapNodes.swapNodes(indexes, queries);

        // Verify
        assertArrayEquals(new int[] {2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10}, result[0]);
        assertArrayEquals(new int[] {2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11}, result[1]);
    }

}