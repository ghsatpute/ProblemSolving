package problemsolving.leetcode.algorithm.greedy.jumpGame2;

public class JumpGame2 {
    public int jump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }

        if (nums[0] >= nums.length) {
            return 1;
        }

        int numJumps = 1;
        int left = 1;
        int right = nums[0];

        /*
        Input: [2,3,1,1,4]
        numJumps = 1
        Iteration 1:
            left = 1, right = 2
                i = 1
                    farthest = max(0, 1 + 3) = 4
                i = 2
                    farthest = max (4, 1 + 1) = 2
                left = 3, right = 4, numJumps = 2
        Iteration 2:
            left = 3, right = 4
                i = 3
                    farthest = max(0, 3 + 1) = 4
                i = 4
                    farthest = max(0, 4 + 1) = 5;
                numJumps = 3
                left = 4, right = 5
        Iteration 3:
            right i.e. 5 is not less than nums.length i.e. 5 so exit

        */

        /*
        Input: [1, 2, 3]
        numJumps = 1
        left = 1
        right = 1

        Iteration 1:
            farthest = 0
                i = 1
                    farthest = max(0, 1 + 2) = 3;
            left = 1 + 1 = 2
            right = 3
            numJumps = 2

        */

        while (right < nums.length - 1) {
            int farthest = 0;
            for (int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            left = right + 1;
            right = farthest;

            numJumps++;
        }

        return numJumps;
    }
}
