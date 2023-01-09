package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class BestTimeToBuyAndSellStockSimplifiedTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {7,1,5,3,6,4};

        int output = new BestTimeToBuyAndSellStockSimplified().maxProfit(input);

        assertEquals(5, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {7,6,4,3,1};

        int output = new BestTimeToBuyAndSellStockSimplified().maxProfit(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {1, 2, 3};

        int output = new BestTimeToBuyAndSellStockSimplified().maxProfit(input);

        assertEquals(2, output);
    }

}