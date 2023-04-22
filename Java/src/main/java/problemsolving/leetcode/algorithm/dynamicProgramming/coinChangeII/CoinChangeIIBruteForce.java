package problemsolving.leetcode.algorithm.dynamicProgramming.coinChangeII;

public class CoinChangeIIBruteForce {
    public int change(int amount, int[] coins) {
        if (coins.length == 0) {
            return 1;
        }
        return change(amount, coins, 0);
    }

    private int change(int amount, int[] coins, int minCoinValue) {
        // Why are we passing min coin value
        // Let's say we have coins [1, 2, 5], target = 5
        // In each function call we will choose 1, then in that call we may choose [1, 2, 2]
        // If we choose 2, then we may subsequently choose [2, 1, 2]
        // [1, 2, 2] & [2, 1, 2] are same solutions so we want to avoid taking one of these
        // The way we achieve this is, once we choose 2 we don't want to choose 1 to avoid duplicate entries
        if (amount < 0) {
            return 0;
        }

        if (amount == 0) {
            return 1;
        }

        int numWays = 0;

        for (int coin: coins) {
            if (coin < minCoinValue) {
                continue;
            }

            numWays += change(amount - coin, coins, coin);
        }

        return numWays;
    }
}
