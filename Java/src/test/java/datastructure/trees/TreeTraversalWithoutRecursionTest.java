package datastructure.trees;

import datastructure.trees.problems.TreeTraversalWithoutRecursion;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTraversalWithoutRecursionTest {

    @Test
    public void testInorderTraversalWithoutRecursion() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = TreeTraversalWithoutRecursion.inorderTraversalWithoutRecursion(tree);

        assertEquals("HDIBJEAFCKG", output);
    }

    @Test
    public void testInorderTraversalWithoutRecursionVariant2() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = TreeTraversalWithoutRecursion.inorderTraversalWithoutRecursionVariant2(tree);

        assertEquals("HDIBJEAFCKG", output);
    }

    @Test
    public void testPreOrderTraversalWithoutRecursionVariant1() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = TreeTraversalWithoutRecursion.preOrderTraversalWithoutRecursionVariant1(tree);

        assertEquals("ABDHIEJCFGK", output);
    }

    @Test
    public void testPreOrderTraversalWithoutRecursionVariant2() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = TreeTraversalWithoutRecursion.preOrderTraversalWithoutRecursionVariant2(tree);

        assertEquals("ABDHIEJCFGK", output);
    }

    @Test
    public void testPostOrderTraversalWithoutRecursion() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = TreeTraversalWithoutRecursion.postOrderTraversalWithoutRecursionSingleStack(tree);

        assertEquals("HIDJEBFKGCA", output);
    }

    @Test
    public void testPostOrderTraversalWithoutRecursionWithTwoStacks() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = TreeTraversalWithoutRecursion.postOrderTraversalWithoutRecursionWithTwoStacks(tree);

        assertEquals("HIDJEBFKGCA", output);
    }
}