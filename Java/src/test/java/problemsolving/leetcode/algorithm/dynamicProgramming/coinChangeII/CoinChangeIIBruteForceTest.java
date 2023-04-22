package problemsolving.leetcode.algorithm.dynamicProgramming.coinChangeII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CoinChangeIIBruteForceTest {
    @Test
    public void testCase01() {
        int[] coins = {1,2,5};
        int amount = 5;

        int output = new CoinChangeIIBruteForce().change(amount, coins);

        assertEquals(4, output);
    }

    @Test
    public void testCase02() {
        int[] coins = {7};
        int amount = 0;

        int output = new CoinChangeIIBruteForce().change(amount, coins);

        assertEquals(1, output);
    }

    @Test
    @Disabled("Takes 17 seconds to run. See DP solution.")
    public void testCase03_leetCode() {
        int[] coins = {3,5,7,8,9,10,11};
        int amount = 500;

        int output = new CoinChangeIIBruteForce().change(amount, coins);

        assertEquals(35502874, output);
    }

    @Test
    public void testCase04() {
        int[] coins = {1,2};
        int amount = 3;

        int output = new CoinChangeIIBruteForce().change(amount, coins);

        assertEquals(2, output);
    }
}