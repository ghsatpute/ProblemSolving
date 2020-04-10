package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

public class LargestBstInBinaryTree {

    private static class Result {
        BinaryTreeNode<Integer> tree;
        int height;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public static BinaryTreeNode<Integer> largestBstInBinaryTree(BinaryTreeNode<Integer> tree) {
        Result result = largestBstInBtree(tree);
        return result.tree;
    }

    private static Result largestBstInBtree(BinaryTreeNode<Integer> tree) {
        Result result = new Result();
        if (tree == null) {
            return result;
        }
        if (tree.left == null && tree.right == null) {
            result.tree = tree;
            result.height = 1;
            result.min = tree.data;
            result.max = tree.data;

            return result;
        }

        Result leftResult = largestBstInBtree(tree.left);
        Result rightResult = largestBstInBtree(tree.right);

        if (leftResult.tree != null && leftResult.max < tree.data
                && rightResult.tree != null && rightResult.min > tree.data) {
            result.max = rightResult.max;
            result.min = leftResult.min;
            result.height = Integer.max(leftResult.height, rightResult.height) + 1;
            result.tree = tree;
            return result;
        }

        if (leftResult.height >= rightResult.height) {
            return leftResult;
        } else {
            return rightResult;
        }
    }
}