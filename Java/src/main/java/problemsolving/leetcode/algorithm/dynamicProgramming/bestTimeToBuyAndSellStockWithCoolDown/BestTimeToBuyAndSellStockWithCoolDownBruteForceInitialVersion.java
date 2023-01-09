package problemsolving.leetcode.algorithm.dynamicProgramming.bestTimeToBuyAndSellStockWithCoolDown;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestTimeToBuyAndSellStockWithCoolDownBruteForceInitialVersion {
    public int maxProfit(int[] prices) {
        int currentIndex = 0;
        int currentProfit = 0;
        int lastBuyPrice = 0;
        boolean isAlreadyBought = false;
        boolean isLastActionSell = false;

        return maxProfit(prices, currentIndex, currentProfit, isAlreadyBought, isLastActionSell, lastBuyPrice);
    }

    private int maxProfit(int[] prices, int currentIndex, int currentProfit, boolean isAlreadyBought,
                          boolean isLastActionSell, int lastBuyPrice) {
        if (currentIndex >= prices.length) {
            return currentProfit;
        }

        int profitWithBuy = 0;
        int profitWithSell = 0;
        int profitWithCoolDown;

        // Buy at this level
        if (!isAlreadyBought && !isLastActionSell) {
            System.out.println(getTabNTimes(currentIndex) + "Buying at level " + currentIndex + " current profit is " + currentProfit + " with price " + prices[currentIndex]);
            profitWithBuy = maxProfit(prices, currentIndex + 1, currentProfit, true, false, prices[currentIndex]);
        }

        // Sell at this level
        if (isAlreadyBought) {
            int newProfit = currentProfit + prices[currentIndex] - lastBuyPrice;
            System.out.println(getTabNTimes(currentIndex) + "Selling at level " + currentIndex + " new profit is " + newProfit);
            profitWithSell = maxProfit(prices, currentIndex + 1, newProfit, false, true, 0);
        }

        // Cool down at this level
        System.out.println(getTabNTimes(currentIndex) + "Cooldown at level " + currentIndex + " current profit is " + currentProfit);
        profitWithCoolDown = Math.max(
                currentProfit,
                maxProfit(prices, currentIndex + 1, currentProfit, isAlreadyBought, false, lastBuyPrice));

        return Math.max(Math.max(profitWithSell, profitWithBuy), profitWithCoolDown);
    }

    private String getTabNTimes(int n) {
        String charToAppend = "\t";

        return Stream.generate(() -> charToAppend)
                .limit(n)
                .collect(Collectors.joining());
    }

}
