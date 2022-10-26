package problemsolving.leetcode.logic.maximalSquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {

    @Test
    public void testCase01() {
        char[][] input = new char[][] {
                { '0', '0' },
                { '0', '0' }
        };

        int output = new MaximalSquare().maximalSquare(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        char[][] input = new char[][] {
                { '1', '0' },
                { '0', '0' }
        };

        int output = new MaximalSquare().maximalSquare(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        char[][] input = new char[][] {
                { '0', '1' },
                { '0', '1' }
        };

        int output = new MaximalSquare().maximalSquare(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase04() {
        char[][] input = new char[][] {
                { '1', '1' },
                { '1', '1' }
        };

        int output = new MaximalSquare().maximalSquare(input);

        assertEquals(4, output);
    }


    @Test
    public void testCase05() {
        char[][] input = new char[][] {
                { '1', '1', '1'},
                { '1', '1', '1'},
                { '1', '1', '1'}
        };

        int output = new MaximalSquare().maximalSquare(input);

        assertEquals(9, output);
    }

    @Test
    public void testCase06() {
        char[][] input = new char[][] {
                { '0', '1', '1', '1', '1', '0', '1' },
                { '0', '1', '1', '1', '1', '0', '1' },
                { '1', '1', '1', '1', '1', '0', '1' },
                { '1', '1', '1', '1', '1', '0', '1' },
                { '1', '1', '1', '1', '1', '1', '1' },
        };

        int output = new MaximalSquare().maximalSquare(input);

        assertEquals(16, output);
    }
}