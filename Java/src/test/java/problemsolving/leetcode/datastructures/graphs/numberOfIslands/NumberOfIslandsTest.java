package problemsolving.leetcode.datastructures.graphs.numberOfIslands;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {
    @Test
    public void testCase01() {
        char[][] input = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        int numIslands = new NumberOfIslands().numIslands(input);

        assertEquals(1, numIslands);
    }

    @Test
    public void testCase02() {
        char[][] input = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int numIslands = new NumberOfIslands().numIslands(input);

        assertEquals(3, numIslands);
    }

}