package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int len = prices.length;
        int[] lMax = new int[len];

        lMax[len - 1] = prices[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            lMax[i] = Math.max(prices[i], lMax[i + 1]);
        }

        int max = 0;
        for (int i = 0; i < len; i++) {
            if (lMax[i] - prices[i] > max) {
                max = lMax[i] - prices[i];
            }
        }
        return max;
    }
}
