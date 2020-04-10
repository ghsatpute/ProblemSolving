package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;
import datastructure.trees.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorBinaryTreeTest {

    @Test
    public void loweCommonAncestorBinaryTree_testCase01() {
        /*
         *               A
         *
         *          B         C
         *
         *      D      E   F      G
         *
         *   H     I  J         K
         */
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        BinaryTreeNode<String> result = LowestCommonAncestorBinaryTree.calculate(tree, "D", "E");

        assertNotNull(result);
        assertEquals("B", result.data);
    }

    @Test
    public void loweCommonAncestorBinaryTree_testCase02() {
        /*
         *               A
         *
         *          B         C
         *
         *      D      E   F      G
         *
         *   H     I  J         K
         */
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        BinaryTreeNode<String> result = LowestCommonAncestorBinaryTree.calculate(tree, "D", "C");

        assertNotNull(result);
        assertEquals("A", result.data);
    }

    @Test
    public void loweCommonAncestorBinaryTree_testCase03() {
        /*
         *               A
         *
         *          B         C
         *
         *      D      E   F      G
         *
         *   H     I  J         K
         */
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        BinaryTreeNode<String> result = LowestCommonAncestorBinaryTree.calculate(tree, "K", "C");

        assertNotNull(result);
        assertEquals("C", result.data);
    }
   /*
   TODO: Enable this test once when code handles support for accepting element which is not present in tree.
    @Test
    public void loweCommonAncestorBinaryTree_testCase04() {
        *//*
         *               A
         *
         *          B         C
         *
         *      D      E   F      G
         *
         *   H     I  J         K
         *//*
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        BinaryTreeNode<String> result = LowestCommonAncestorBinaryTree.calculate(tree, "X", "C");

        assertNull(result);
        //assertEquals(null, result.data);
    }*/
}