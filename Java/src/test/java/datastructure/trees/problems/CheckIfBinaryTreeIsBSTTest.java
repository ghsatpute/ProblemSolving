package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfBinaryTreeIsBSTTest {

    @Test
    public void checkIfBinaryTreeIsBST_isNotBinarySearchTree() {
        BinaryTreeNode<Integer> nonBSTTree = createNonBSTTree();

        boolean result = CheckIfBinaryTreeIsBST.check(nonBSTTree);

        assertFalse(result);
    }

    @Test
    public void checkIfBinaryTreeIsBST_isNotBinarySearchTree2() {
        BinaryTreeNode<Integer> nonBSTTree = createAnotherNonBSTTree();

        boolean result = CheckIfBinaryTreeIsBST.check(nonBSTTree);

        assertFalse(result);
    }

    @Test
    public void checkIfBinaryTreeIsBST_isBinarySearchTree() {
        BinaryTreeNode<Integer> bstTree = createBSTTree();

        boolean result = CheckIfBinaryTreeIsBST.check(bstTree);

        assertTrue(result);
    }

    private static BinaryTreeNode<Integer> createNonBSTTree() {
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

    public static BinaryTreeNode<Integer> createAnotherNonBSTTree() {
        /*
         * Here the 9 is less than 15 but is less than 10 so it's not a BST
         *              10
         *
         *          5      15
         *
         *       -3       9   23
         */

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

        BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5);
        root.left = five;

        five.left = new BinaryTreeNode<>(-3);
        //five.right = new BinaryTreeNode<>();

        BinaryTreeNode<Integer> fifteen = new BinaryTreeNode<>(16);
        root.right = fifteen;

        fifteen.left = new BinaryTreeNode<>(17);
        fifteen.right = new BinaryTreeNode<>(23);

        return root;
    }

    private static BinaryTreeNode<Integer> createBSTTree() {
        /*
         *              10
         *
         *          5      15
         *
         *       -3       14   23
         */

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

        BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5);
        root.left = five;

        five.left = new BinaryTreeNode<>(-3);
        //five.right = new BinaryTreeNode<>();

        BinaryTreeNode<Integer> fifteen = new BinaryTreeNode<>(15);
        root.right = fifteen;

        fifteen.left = new BinaryTreeNode<>(14);
        fifteen.right = new BinaryTreeNode<>(23);

        return root;
    }

}