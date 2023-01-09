package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStockWithCoolDown;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockWithCoolDownBruteForceInitialVersionTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {1, 2, 3, 0, 2};

        int output = new BestTimeToBuyAndSellStockWithCoolDownBruteForceInitialVersion().maxProfit(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1, 2, 3, 4, 5};

        int output = new BestTimeToBuyAndSellStockWithCoolDownBruteForceInitialVersion().maxProfit(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {5, 4, 3, 2, 1};

        int output = new BestTimeToBuyAndSellStockWithCoolDownBruteForceInitialVersion().maxProfit(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {1, 10, 5, 4, 3, 2, 1};

        int output = new BestTimeToBuyAndSellStockWithCoolDownBruteForceInitialVersion().maxProfit(input);

        assertEquals(9, output);
    }
}