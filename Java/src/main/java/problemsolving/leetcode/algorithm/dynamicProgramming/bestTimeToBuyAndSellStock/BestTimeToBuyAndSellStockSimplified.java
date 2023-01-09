package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockSimplified {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int buyIndex = 0;
        int sellIndex = 0;

        while(sellIndex < prices.length) {
            if (prices[sellIndex] < prices[buyIndex]) {
                // This condition means that we've found a new low prices
                buyIndex = sellIndex;
            } else {
                // we will check what happens if we sell at this point and calculate the profit
                int newProfit = prices[sellIndex] - prices[buyIndex];
                maxProfit = Math.max(maxProfit, newProfit);
            }

            sellIndex++;
        }

        return maxProfit;
    }
}
