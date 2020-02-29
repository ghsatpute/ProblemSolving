package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RootToLeafPathSumTest {

    @Test
    public void checkIfRootToLeafPathExists_pathExists() {
        BinaryTreeNode<Integer> tree = createTree();

        boolean result = RootToLeafPathSum.calculate(tree, 26);

        assertTrue(result);
    }

    @Test
    public void checkIfRootToLeafPathExists_pathDoesNotExists() {
        BinaryTreeNode<Integer> tree = createTree();

        boolean result = RootToLeafPathSum.calculate(tree, 20);

        assertFalse(result);
    }

    private static BinaryTreeNode<Integer> createTree() {
        /*
         *              10
         *
         *          16      5
         *
         *       -3       6   11
         */

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

        BinaryTreeNode<Integer> sixteen = new BinaryTreeNode<>(16);
        root.left = sixteen;

        BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5);
        root.right = five;

        sixteen.left = new BinaryTreeNode<>(-3);

        five.left = new BinaryTreeNode<>(6);
        five.right = new BinaryTreeNode<>(11);

        return root;
    }
}