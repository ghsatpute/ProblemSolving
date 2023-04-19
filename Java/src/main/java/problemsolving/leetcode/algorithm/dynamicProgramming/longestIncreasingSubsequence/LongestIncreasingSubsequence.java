package problemsolving.leetcode.algorithm.dynamicProgramming.longestIncreasingSubsequence;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int globalMax = 1;
        // This array will store longest increasing subsequences starting from current word
        int[] lis = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            // With one number we can always have longest increasing subsequence of length 1
            int max = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    max = Math.max(max, lis[j] + 1);
                }
            }
            lis[i] = max;
            globalMax = Math.max(max, globalMax);
        }

        return globalMax;

        /* Tracing
            nums = [10, 9, 2, 5, 3, 7, 101, 18]
            i = 7
                nums[7] = 18
                max = 1
                j = 8
                lis = [0, 0, 0, 0, 0, 0, 0, 1]
            i = 6;
                nums[6] = 101
                max. 1
                j = 7
                    if -> false
                lis = [0, 0, 0, 0, 0, 0, 1, 1]
            i = 5
                nums[5] = 7
                max = 1
                    j = 6
                        if true
                        max(1, 1 + lis(6)) ->  max (1, 2) -> 2
                lis = [0, 0, 0, 0, 0, 2, 1, 1]
            i = 4
                nums[4]] = 3
                max = 1
                    j = 5

        */
    }
}
