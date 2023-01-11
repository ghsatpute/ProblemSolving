package problemsolving.leetcode.algorithm.dynamicProgramming.coinChange;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoinChangeBruteForceTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {1, 2, 5};

        int output = new CoinChangeBruteForce().coinChange(input, 11);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1, 3, 4, 5};

        int output = new CoinChangeBruteForce().coinChange(input, 7);

        assertEquals(2, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {1};

        int output = new CoinChangeBruteForce().coinChange(input, 7);

        assertEquals(7, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {7};

        int output = new CoinChangeBruteForce().coinChange(input, 7);

        assertEquals(1, output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[] {1, 2, 5, 10};

        int output = new CoinChangeBruteForce().coinChange(input, 35);

        assertEquals(4, output);
    }
}
