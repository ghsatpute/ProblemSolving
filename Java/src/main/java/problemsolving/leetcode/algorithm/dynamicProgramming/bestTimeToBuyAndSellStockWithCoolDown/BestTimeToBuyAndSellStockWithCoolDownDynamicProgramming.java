package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStockWithCoolDown;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// In this class, we removed the one additional variable i.e. isLastActionSell, this will help applying DP to this
// problem by reducing parameters.
public class BestTimeToBuyAndSellStockWithCoolDownDynamicProgramming {
    public int maxProfit(int[] prices) {
        int currentIndex = 0;
        boolean isAlreadyBought = false;

        Map<String, Integer> memo = new HashMap<>();

        return maxProfit(prices, memo, currentIndex, isAlreadyBought);
    }

    private int maxProfit(int[] prices, Map<String, Integer> memo, int currentIndex, boolean isAlreadyBought) {
        String key = currentIndex + "-" + isAlreadyBought;

        if (currentIndex >= prices.length) {
            memo.put(key, 0);
            return 0;
        }

        if (memo.containsKey(key)) {
            // System.out.println("Reading from memo with key " + key + " and returning " + memo.get(key));
            return memo.get(key);
        }

        int profitWithBuy;
        int profitWithSell;

        // Cool down at this level
        // System.out.println(getTabNTimes(currentIndex) + "Cooldown at level " + currentIndex);
        int profitWithCoolDown = maxProfit(prices, memo, currentIndex + 1, isAlreadyBought);

        // Buy at this level
        if (!isAlreadyBought) {
            // System.out.println(getTabNTimes(currentIndex) + "Buying at level " + currentIndex + " with price " + prices[currentIndex]);
            profitWithBuy = -prices[currentIndex] + maxProfit(prices, memo, currentIndex + 1, true);

            memo.put(key, Math.max(profitWithCoolDown, profitWithBuy));
        } else {
            // Sell at this level
            // System.out.println(getTabNTimes(currentIndex) + "Selling at level " + currentIndex);
            profitWithSell = prices[currentIndex] + maxProfit(prices, memo, currentIndex + 2, false);

            memo.put(key, Math.max(profitWithCoolDown, profitWithSell));
        }

        return memo.get(key);
    }

    private String getTabNTimes(int n) {
        String charToAppend = "\t";

        return Stream.generate(() -> charToAppend)
                .limit(n)
                .collect(Collectors.joining());
    }

}
