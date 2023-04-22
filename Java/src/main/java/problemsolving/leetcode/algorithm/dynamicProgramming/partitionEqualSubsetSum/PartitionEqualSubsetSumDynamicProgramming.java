package problemsolving.leetcode.algorithm.dynamicProgramming.partitionEqualSubsetSum;

import java.util.HashMap;
import java.util.Map;

public class PartitionEqualSubsetSumDynamicProgramming {
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

        Map<String, Boolean> memo = new HashMap<>();

        return canFindSubsetWithSum(nums, totalSum / 2, 0, memo);
    }

    private boolean canFindSubsetWithSum(int[] nums, int target, int current, Map<String, Boolean> memo) {
        if (target < 0 || current >= nums.length) {
            return false;
        }

        String key = target + "," + current;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (target == 0) {
            return true;
        }

        boolean chooseCurrentElement = canFindSubsetWithSum(nums, target - nums[current], current + 1, memo);
        if (chooseCurrentElement) {
            memo.put(key, true);
            return true;
        }
        boolean doNotChooseCurrentElement = canFindSubsetWithSum(nums, target, current + 1, memo);

        memo.put(key, doNotChooseCurrentElement);

        return doNotChooseCurrentElement;
    }
}
