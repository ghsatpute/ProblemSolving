package problemsolving.problems.dynamicProgramming;

public class MaximumSubarrayProblem {
    public static int solve(int[] input) {
        int[] sums = new int[input.length];
        sums[0] = input[0];
        int maxSum = input[0];

        for (int i = 1; i < input.length; i++) {
            sums[i] = Math.max(sums[i - 1] + input[i], input[i]);
            if (sums[i] > maxSum) maxSum = sums[i];
        }
        return maxSum;
    }
}
