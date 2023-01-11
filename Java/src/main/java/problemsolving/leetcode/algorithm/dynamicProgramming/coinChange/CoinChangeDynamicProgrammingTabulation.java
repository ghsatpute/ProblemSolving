package problemsolving.leetcode.algorithm.dynamicProgramming.coinChange;

import java.util.Arrays;

/**
 * Here this solution works, but is not efficient. Because let's say we have an
 * coins: [1, 50]
 * amount = 50
 * Now, this solution will calculate all the coins 
 */
public class CoinChangeDynamicProgrammingTabulation {

    public int coinChange(int[] coins, int amount) {
        int[] tabulation = new int[amount + 1];
        Arrays.fill(tabulation, -1);
        tabulation[0] = 0;

        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin: coins) {
                // If we're going to read negative index, continue;
                if (i - coin < 0) {
                    continue;
                }

                if (tabulation[i - coin] != -1) {
                    min = Math.min(min, tabulation[i - coin] + 1);
                }
            }

            if (min == Integer.MAX_VALUE) {
                tabulation[i] = -1;
            } else {
                tabulation[i] = min;
            }
        }

        return tabulation[amount];
    }
}
