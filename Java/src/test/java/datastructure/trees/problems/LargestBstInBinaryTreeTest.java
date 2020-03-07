package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestBstInBinaryTreeTest {

    @Test
    public void testLargestBstInBinaryTree_tree01() {
        // Verify
        /*
         *                  20
         *
         *              25      30
         *
         *          13     28  31   34
         */

        BinaryTreeNode<Integer> twentyNode = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> twentyFiveNode = new BinaryTreeNode<>(24);
        BinaryTreeNode<Integer> thirtyNode = new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> thirteenNode = new BinaryTreeNode<>(13);
        BinaryTreeNode<Integer> twentyEightNode = new BinaryTreeNode<>(28);
        BinaryTreeNode<Integer> thirtyOneNode = new BinaryTreeNode<>(31);
        BinaryTreeNode<Integer> thirtyFourNode = new BinaryTreeNode<>(34);

        twentyNode.right = twentyFiveNode;
        twentyNode.left = thirtyNode;

        twentyFiveNode.left = thirteenNode;
        twentyFiveNode.right = twentyEightNode;

        thirtyNode.left = thirtyOneNode;
        thirtyNode.right = thirtyFourNode;

        // Execute
        BinaryTreeNode<Integer> result = LargestBstInBinaryTree.largestBstInBinaryTree(twentyNode);

        // Verify
        assertNotNull(result);
        assertEquals(twentyFiveNode, result);
    }

    @Test
    public void testLargestBstInBinaryTree_tree02() {
        /*
         *                  15
         *
         *              20      1
         *
         */
        // Setup
        BinaryTreeNode<Integer> fifteenNode = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> twentyNode = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> oneNode = new BinaryTreeNode<>(1);

        fifteenNode.left = twentyNode;
        fifteenNode.right = oneNode;

        // Execute
        BinaryTreeNode<Integer> result = LargestBstInBinaryTree.largestBstInBinaryTree(fifteenNode);

        // Verify
        assertNotNull(result);
        assertEquals(twentyNode, result);
    }

    @Test
    public void testLargestBstInBinaryTree_tree03() {
        /*
         *                  15
         *
         *              20      1
         *
         *                   -1    5
         *
         */
        // Setup
        BinaryTreeNode<Integer> fifteenNode = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> twentyNode = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> oneNode = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> minusOneNode = new BinaryTreeNode<>(-1);
        BinaryTreeNode<Integer> fiveNode = new BinaryTreeNode<>(5);

        fifteenNode.left = twentyNode;
        fifteenNode.right = oneNode;

        oneNode.left = minusOneNode;
        oneNode.right = fiveNode;

        // Execute
        BinaryTreeNode<Integer> result = LargestBstInBinaryTree.largestBstInBinaryTree(fifteenNode);

        // Verify
        assertNotNull(result);
        assertEquals(oneNode, result);
    }

}