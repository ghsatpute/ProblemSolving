package problemsolving.leetcode.datastructures.trees.minimumDepthOfBinaryTree;


public class MinimumDepthOfBinaryTree {
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    int leftDepth = minDepth(root.left);
    int rightDepth = minDepth(root.right);
    if (leftDepth == 0) {
      return 1 + rightDepth;
    }

    if (rightDepth == 0) {
      return 1 + leftDepth;
    }

    return 1 + Math.min(leftDepth, rightDepth);
  }
}
