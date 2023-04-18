package problemsolving.leetcode.algorithm.dynamicProgramming.maximumProductSubarray;

public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        // We want to keep track of current Min because there might be subarray [-2, 2, 2]
        // So far current max would be 4, and current min would be -8
        // Now, if current number is [-1], the new max would become -1 * 8 i.e. 8 which is greater
        // than current max
        int curMin = nums[0];
        int curMax = nums[0];
        int output = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = curMin;
            curMin = Math.min(
                    // current number itself could be lesser than current min
                    nums[i],
                    Math.min(
                            // Check if we get less number by multiplying current number with current max
                            // In case, current number is negative we could get bigger min
                            curMax * nums[i],
                            // Check if we get less number than curr min by multiplying current number with current min
                            curMin * nums[i]
                    ));

            curMax = Math.max(
                    // Current number itself could be max number so far
                    nums[i],
                    Math.max(
                            // Check if we get bigger number than current max by multiplyign current number with current max
                            curMax * nums[i],
                            // Check if we get bigger number than current max by multiplying current number with current min
                            // In case, current number is negative we can get bigger number
                            temp * nums[i]
                    ));

            if (curMax > output) {
                output = curMax;
            }
        }

        return output;
    }
}
