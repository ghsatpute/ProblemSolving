package problemsolving.leetcode.logic.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithMap {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (elements.containsKey(target - nums[i])) {
                output[0] = elements.get(target - nums[i]);
                output[1] = i;
                return output;
            }
            elements.put(nums[i], i);
        }

        return output;
    }
}
