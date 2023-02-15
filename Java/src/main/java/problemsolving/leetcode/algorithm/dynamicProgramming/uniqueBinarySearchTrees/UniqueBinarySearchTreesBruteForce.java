package problemsolving.leetcode.algorithm.dynamicProgramming.uniqueBinarySearchTrees;

public class UniqueBinarySearchTreesBruteForce {
    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }

        // For each number k in [1, 2, 3, .... k, ...., n]
        // Try to put 1 to k - 1 nodes on left side of tree. And k - 1 to n nodes on right side of tree.
        // Keeping k at the root.
        // For k as a root, we can get all possible combinations by summing for all possible values of k
        //  number of possible trees on left side * number of possible trees on right side
        int totalNumOfTrees = 0;
        for (int k = 0; k < n; k++) {
            int totalNumOfTreesOnLeftSide = numTrees(k);
            int totalNumOfTressOnRightSide = numTrees(n - k - 1);
            totalNumOfTrees +=  totalNumOfTreesOnLeftSide * totalNumOfTressOnRightSide;
        }

        return totalNumOfTrees;
    }
}
