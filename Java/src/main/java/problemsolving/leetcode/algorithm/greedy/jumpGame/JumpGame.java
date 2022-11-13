package problemsolving.leetcode.algorithm.greedy.jumpGame;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            }
            int newReachable = i + nums[i];
            if (newReachable > reachable) {
                reachable = newReachable;
            }
        }

        return true;
    }
}
