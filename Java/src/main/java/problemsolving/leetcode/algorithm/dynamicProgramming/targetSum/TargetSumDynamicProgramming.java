package problemsolving.leetcode.algorithm.dynamicProgramming.targetSum;

import java.util.HashMap;
import java.util.Map;

public class TargetSumDynamicProgramming {
    private int[] nums;
    private int target;
    private Map<String, Integer> memo = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        this.target = target;

        return findTargetSumWays(0, 0);
    }

    private int findTargetSumWays(int index, int total) {
        if (index == nums.length) {
            return total == target ? 1 : 0;
        }

        String key = index + "," + total;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // We have two options, one to add current number and another to subtract it.
        // Add current number and see how many ways we can achieve the sum
        int sumWaysByAdding = findTargetSumWays(index + 1, total + nums[index]);
        // Subtract current number and see how many ways we can achieve the sum
        int sumWaysBySubtracting = findTargetSumWays(index + 1, total - nums[index]);

        memo.put(key, sumWaysByAdding + sumWaysBySubtracting);

        return sumWaysByAdding + sumWaysBySubtracting;
    }
}
