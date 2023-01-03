package problemsolving.leetcode.algorithm.dynamicProgramming.houseRobber;

import java.util.Date;

public class HouseRobberBruteForce {
    public int rob(int[] nums) {
        Date startTime = new Date();
        int output = rob(nums, 0, false);
        Date endTime = new Date();

        System.out.println("Time taken: " + (endTime.getTime() - startTime.getTime()) + " milliseconds");
        return output;
    }

    private int rob(int[] nums, int currentIndex, boolean lastPicked) {
        if (currentIndex >= nums.length) {
            return 0;
        }

        int pickCurrent = 0;

        if (!lastPicked) {
            pickCurrent = nums[currentIndex] + rob(nums, currentIndex + 1, true);
        }
        int dontPickCurrent = rob(nums, currentIndex + 1, false);

        return Math.max(pickCurrent, dontPickCurrent);
    }
}
