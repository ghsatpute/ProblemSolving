package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

public class RootToLeafPathSum {

    public static boolean calculate(BinaryTreeNode<Integer> tree, int sum) {

        if (tree == null) {
            return false;
        }

        if (tree.left == null && tree.right == null) {
            return sum == tree.data;
        }

        return calculate(tree.left, sum - tree.data)
                || calculate(tree.right, sum - tree.data);
    }
}
