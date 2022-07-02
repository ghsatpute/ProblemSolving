package problemsolving.leetcode.datastructures.trees.pathSum;

public class PathSum {

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

  public static boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    if (targetSum == root.val && root.left == null && root.right == null) {
      return true;
    }

    if (root.left != null) {
      boolean output = hasPathSum(root.left, targetSum - root.val);
      if (output) {
        return true;
      }
    }

    if (root.right != null) {
      boolean output = hasPathSum(root.right, targetSum - root.val);
      if (output) {
        return true;
      }
    }

    return false;
  }
}
