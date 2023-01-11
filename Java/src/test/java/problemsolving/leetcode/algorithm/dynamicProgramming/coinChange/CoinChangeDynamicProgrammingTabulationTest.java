package problemsolving.leetcode.algorithm.dynamicProgramming.coinChange;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CoinChangeDynamicProgrammingTabulationTest {

    @Test
    public void testCase01() {
        int[] coins = new int[] {1};
        int target = 1;

        int output = new CoinChangeDynamicProgrammingTabulation().coinChange(coins, target);

        assertEquals(1, output);
    }

    @Test
    public void testCase02() {
        int[] coins = new int[] {2};
        int target = 1;

        int output = new CoinChangeDynamicProgrammingTabulation().coinChange(coins, target);

        assertEquals(-1, output);
    }

    @Test
    public void testCase03() {
        int[] coins = new int[] {1, 2, 3, 4, 5};
        int target = 7;

        int output = new CoinChangeDynamicProgrammingTabulation().coinChange(coins, target);

        assertEquals(2, output);
    }

    @Test
    public void testCase04() {
        int[] coins = new int[] {1, 3, 4, 5, 10};
        int target = 50;

        int output = new CoinChangeDynamicProgrammingTabulation().coinChange(coins, target);

        assertEquals(5, output);
    }

    @Test
    public void testCase05() {
        int[] coins = new int[] {1, 3, 4, 5, 10};
        int target = 500;

        int output = new CoinChangeDynamicProgrammingTabulation().coinChange(coins, target);

        assertEquals(50, output);
    }

    @Test
    public void testCase06() {
        int[] coins = new int[] {2};
        int target = 3;

        int output = new CoinChangeDynamicProgrammingTabulation().coinChange(coins, target);

        assertEquals(-1, output);
    }
}