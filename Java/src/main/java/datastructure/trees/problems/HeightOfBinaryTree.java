package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

public class HeightOfBinaryTree {

    public static <T> int calculate(BinaryTreeNode<T> root) {
        if (root == null) {
            return 0;
        }
        return 1 + Integer.max(calculate(root.left), calculate(root.right));
    }
}
