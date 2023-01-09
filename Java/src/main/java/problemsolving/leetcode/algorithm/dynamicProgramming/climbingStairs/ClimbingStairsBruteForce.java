package problemsolving.leetcode.algorithm.dynamicProgramming.climbingStairs;

public class ClimbingStairsBruteForce {
    public int climbStairs(int n) {
        return climbStairs(n, 0);
    }

    private int climbStairs(int n, int currentStep) {
        if (currentStep >= n) {
            return 0;
        }

        if (currentStep + 1 == n) {
            return 1;
        }

        if (currentStep + 2 == n) {
            return 2;
        }

        return climbStairs(n, currentStep + 1) + climbStairs(n, currentStep + 2);
    }
}
