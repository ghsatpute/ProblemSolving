package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStockWithCoolDown;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockWithCoolDownDynamicProgrammingTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {1, 2, 3, 0, 2};

        int output = new BestTimeToBuyAndSellStockWithCoolDownDynamicProgramming().maxProfit(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1, 2, 3, 4, 5};

        int output = new BestTimeToBuyAndSellStockWithCoolDownDynamicProgramming().maxProfit(input);

        assertEquals(4, output);
    }

}