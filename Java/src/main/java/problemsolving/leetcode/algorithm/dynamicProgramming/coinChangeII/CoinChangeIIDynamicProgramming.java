package problemsolving.leetcode.algorithm.dynamicProgramming.coinChangeII;

public class CoinChangeIIDynamicProgramming {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin: coins) {
            for (int i = coin; i <= amount; i++) {
                // The idea here is that, `i` is the target amount and that can be
                // achieved by adding current coin to `i - coin` value.
                // For exmaple, let's say our target amount i = 10, and current coin is 5
                // and let's say dp[5] = 1. Then we can achieve dp[10] by incrementing last 10 - 5's value
                // Similarly, if coin is 2, we can see how many ways 8 can be achieved and add that value to
                // dp[10]
                // See the dp array trace for coins [2, 5] and target [10]
                // [1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
                // [1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
                // [1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0]
                // [1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0]
                // [1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0]
                // [1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0]
                // [1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0]
                // [1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0]
                // [1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1]
                // [1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1]
                // [1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1]
                // [1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1]
                // [1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1]
                // [1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1]
                // [1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 2]
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}
