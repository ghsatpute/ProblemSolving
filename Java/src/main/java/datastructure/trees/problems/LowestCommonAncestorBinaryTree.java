package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

public class LowestCommonAncestorBinaryTree {

    public static <T> BinaryTreeNode<T> calculate(BinaryTreeNode<T> root, T data1, T data2) {
        if (root == null) return null;

        if (root.data == data1 || root.data == data2) return root;

        BinaryTreeNode<T> leftResult = calculate(root.left, data1, data2);
        BinaryTreeNode<T> rightResult = calculate(root.right, data1, data2);

        if (leftResult != null && rightResult != null) return root;

        if (leftResult == null && rightResult == null) return null;

        if (leftResult != null) return leftResult;
        return rightResult;
    }
}
