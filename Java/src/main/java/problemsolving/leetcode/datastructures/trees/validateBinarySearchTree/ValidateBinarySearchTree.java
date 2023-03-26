package problemsolving.leetcode.datastructures.trees.validateBinarySearchTree;

public class ValidateBinarySearchTree {
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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE - 1L, Integer.MAX_VALUE + 1L);
    }

    private boolean isValidBST(TreeNode root, long lowRange, long maxRange) {
        if (root == null) {
            return true;
        }

        if (root.val <= lowRange || root.val >= maxRange) {
            return false;
        }

        if (root.left != null) {
            boolean isValidLeftTree = isValidBST(root.left, lowRange, root.val);
            if (!isValidLeftTree) {
                return false;
            }
        }

        if (root.right != null) {
            boolean isValidRightTree = isValidBST(root.right, root.val, maxRange);
            if (!isValidRightTree) {
                return false;
            }
        }

        return true;
    }
}
