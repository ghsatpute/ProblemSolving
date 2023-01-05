package problemsolving.leetcode.algorithm.dynamicProgramming.houseRobber2;

import java.util.Arrays;

public class HouseRobber2DynamicProgramming {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(
                robInternal(Arrays.copyOfRange(nums, 1, nums.length)),
                robInternal(Arrays.copyOfRange(nums, 0, nums.length - 1)));
    }

    private int robInternal(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }


        int[][] memo = new int[nums.length + 1][2];

        memo[1][0] = nums[0]; // Pick first element
        memo[1][1] = 0;       // Don't pick first element

        /*
            Input => [1,3,1]
            Memo =>

                    i     ->    0   1   2   3
            Pick                0   1   3   2
            Don't pick          0   0   1   3
         */

        /*
            Input => [1,0,0,1]
            Memo =>

                    i     ->    0   1   2   3   4
            Pick                0   1   0   1   2
            Don't pick          0   0   1   1   1
         */

        for (int i = 2; i <= nums.length; i++) {
            // Pick current element
            memo[i][0] = nums[i - 1] + memo[i-1][1];
            // Don't pick current element
            memo[i][1] = Math.max(memo[i-1][0], memo[i-1][1]);
        }

        return Math.max(memo[nums.length][0], memo[nums.length][1]);
    }
}
