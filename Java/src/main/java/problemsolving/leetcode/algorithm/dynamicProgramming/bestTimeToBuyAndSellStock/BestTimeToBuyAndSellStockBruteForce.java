package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockBruteForce {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int buyDay = 0; buyDay < prices.length; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                maxProfit = Math.max(prices[sellDay] - prices[buyDay], maxProfit);
            }
        }

        return maxProfit;
    }
}
