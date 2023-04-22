package problemsolving.leetcode.algorithm.dynamicProgramming.partitionEqualSubsetSum;

public class PartitionEqualSubsetSumBruteForce {
    public boolean canPartition(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        return canFindSubsetWithSum(nums, totalSum / 2, 0);
    }

    private boolean canFindSubsetWithSum(int[] nums, int target, int current) {
        if (target == 0) {
            return true;
        }

        if (current >= nums.length || target < 0) {
            return false;
        }

        // Check if we can get to target by choosing current element
        boolean chooseCurrentElement = canFindSubsetWithSum(nums, target - nums[current], current + 1);
        // If we found solution then return from here itself
        if (chooseCurrentElement) {
            return true;
        }

        // Check if we can get to target by not choosing current element
        return canFindSubsetWithSum(nums, target, current + 1);
    }
}
