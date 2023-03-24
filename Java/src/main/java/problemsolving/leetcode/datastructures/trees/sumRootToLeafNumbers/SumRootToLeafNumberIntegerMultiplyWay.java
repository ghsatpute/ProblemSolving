package problemsolving.leetcode.datastructures.trees.sumRootToLeafNumbers;

public class SumRootToLeafNumberIntegerMultiplyWay {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        return calculateSum(root, 0);
    }

    private int calculateSum(TreeNode root, int currentSum) {
        if (root == null) {
            return currentSum;
        }

        if (root.left == null && root.right == null) {
            return currentSum + root.val;
        }

        int leftSum = 0;
        int rightSum = 0;

        if (root.left != null) {
            leftSum += calculateSum(root.left, 10 * (currentSum + root.val));
        }

        if (root.right != null) {
            rightSum += calculateSum(root.right, 10 * (currentSum + root.val));
        }

        return leftSum + rightSum;
    }
}
