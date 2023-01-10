package problemsolving.leetcode.algorithm.dynamicProgramming.uniqueBinarySearchTress;

import java.util.Arrays;

public class UniqueBinarySearchTreesDynamicProgramming {
    public int numTrees(int n) {
        int[] memo = new int[n + 1];

        Arrays.fill(memo, 1);

        return numTrees(n, memo);
    }

    public int numTrees(int n, int[] memo) {
        if (n <= 1) {
            memo[n]  = 1;
            return 1;
        }

        if (memo[n] != 1) {
            System.out.println("Reading from a memo for n " + n + " and returning " + memo[n]);
            return memo[n];
        }

        // For each number k in [1, 2, 3, .... k, ...., n]
        // Try to put 1 to k - 1 nodes on left side of tree. And k - 1 to n nodes on right side of tree.
        // Keeping k at the root.
        // For k as a root, we can get all possible combinations by summing for all possible values of k
        //  number of possible trees on left side * number of possible trees on right side
        int totalNumOfTrees = 0;
        for (int k = 0; k < n; k++) {
            int totalNumOfTreesOnLeftSide = numTrees(k, memo);
            int totalNumOfTressOnRightSide = numTrees(n - k - 1, memo);
            totalNumOfTrees +=  totalNumOfTreesOnLeftSide * totalNumOfTressOnRightSide;
        }

        memo[n] = totalNumOfTrees;

        return totalNumOfTrees;
    }
}
