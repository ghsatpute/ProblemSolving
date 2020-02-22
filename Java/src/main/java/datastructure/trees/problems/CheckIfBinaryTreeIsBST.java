package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

public class CheckIfBinaryTreeIsBST {

    public static boolean check(BinaryTreeNode<Integer> root) {
        return checkInternal(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkInternal(BinaryTreeNode<Integer> root, int rangeStart, int rangeEnd) {
        if (root == null) {
            return true;
        }

        if (root.data < rangeStart || root.data > rangeEnd) return false;

        if (root.left != null && root.left.data > root.data)
            return false;
        if (root.right != null && root.right.data < root.data)
            return false;

        return checkInternal(root.left, rangeStart, root.data)
                && checkInternal(root.right, root.data, rangeEnd);
    }
}
