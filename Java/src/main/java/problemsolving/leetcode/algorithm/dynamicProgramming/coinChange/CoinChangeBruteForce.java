package problemsolving.leetcode.algorithm.dynamicProgramming.coinChange;

public class CoinChangeBruteForce {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int answer = coinChange(coins, amount - coin);
            if (answer != -1) {
                min = Math.min(answer + 1, min);
            }
        }

        return min;
    }
}
