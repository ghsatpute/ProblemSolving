package problemsolving.leetcode.algorithm.dynamicProgramming.minCostClimbingStairs;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        // Let's create an array to store number, 0th position is starting position
        // last position would be end position
        int[] dp = new int[cost.length + 1];
        // Cost to reach starting position is 0
        dp[0] = 0;
        // Cost to reach first step is just cost of first step
        dp[1] = cost[0];
        for (int i = 2; i < dp.length; i++) {
            // I can come at current position by taking one step or two step
            int oneStepCost = cost[i - 1] + dp[i - 1];
            int twoStepCost = cost[i - 1] + dp[i - 2];
            dp[i] = Math.min(oneStepCost, twoStepCost);
        }

        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    /*
        Tracing: input: [10, 15, 20]
        dp[0, 0, 0, 0]
        dp[0, 10, 0, 0];
        i = 2:
            oneStepCost = cost[i - 1] + dp[i - 1] = 15 + 10 = 25
            twoStepCost = cost[i - 2] + dp[i - 2] = 15 + 0 = 15
            dp[2] = min(25, 15)
            dp[0, 10, 15, 0];
        i = 3
            oneStepCost = cost[i - 1] + dp[i - 1] = 15 + 20 = 35
            twoStepCost = cost[i - 2] + dp[i - 2] = 15 + 10 = 30
            dp[3] = min(35, 30)
            dp[0, 10, 15, 30]

        return min(15, 30)

    */
}
