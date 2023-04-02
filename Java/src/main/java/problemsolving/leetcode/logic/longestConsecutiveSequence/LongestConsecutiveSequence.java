package problemsolving.leetcode.logic.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // https://www.youtube.com/watch?v=P6RZZMu_maU&ab_channel=NeetCode
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        // System.out.println(numbers);

        int maxCount = 1;

        for (int num : nums) {
            // Check if current number's left number exists in map
            // If it exists, it means it's start of new series
            int current = num;
            if (numbers.contains(current - 1)) {
                continue;
            }

            // If code reaches here, means we've started a new series at current numbers
            // See how many continuous numbers are present
            int count = 1;
            while (numbers.contains(current + 1)) {
                count++;
                current++;
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}
