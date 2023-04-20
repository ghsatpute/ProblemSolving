package problemsolving.leetcode.algorithm.dynamicProgramming.maximumSubArray;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Check which one is better
            // 1. Start a new sub array at current position
            // 2. Add current element into a previous sub array
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);

            // If we've found a sub-array with better sum, store the result
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }
}
