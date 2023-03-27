package problemsolving.leetcode.logic.containsDuplicateIII;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 1; i < nums.length; i++) {
            int j = Math.max(i - indexDiff, 0);
            for (; j < i; j++) {
                if (Math.abs(nums[i] - nums[j]) <= valueDiff) {
                    return true;
                }
            }
        }

        return false;
    }
}
