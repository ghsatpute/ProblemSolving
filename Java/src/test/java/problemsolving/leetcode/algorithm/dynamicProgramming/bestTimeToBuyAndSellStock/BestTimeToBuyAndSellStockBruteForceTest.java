package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockBruteForceTest {
    @Test
    public void testCase01() {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};

        int profit = new BestTimeToBuyAndSellStockBruteForce().maxProfit(stockPrices);

        assertEquals(5, profit);
    }

    @Test
    public void testCase02() {
        int[] stockPrices = {7, 6, 4, 3, 1};

        int profit = new BestTimeToBuyAndSellStockBruteForce().maxProfit(stockPrices);

        assertEquals(0, profit);
    }
}