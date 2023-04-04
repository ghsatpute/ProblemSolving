package problemsolving.leetcode.datastructures.trees.invertBinaryTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {
    @Test
    public void testCase01() {
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(5);

        InvertBinaryTree.TreeNode inverted = new InvertBinaryTree().invertTree(root);

        assertEquals(5, inverted.val);
        assertNull(inverted.left);
        assertNull(inverted.right);
    }

    @Test
    public void testCase02() {
        InvertBinaryTree.TreeNode left = new InvertBinaryTree.TreeNode(2);
        InvertBinaryTree.TreeNode right = new InvertBinaryTree.TreeNode(3);
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(5, left, right);

        InvertBinaryTree.TreeNode inverted = new InvertBinaryTree().invertTree(root);

        assertEquals(5, inverted.val);
        assertEquals(3, inverted.left.val);
        assertEquals(2, inverted.right.val);
    }

    @Test
    public void testCase03() {
        InvertBinaryTree.TreeNode leftLeft = new InvertBinaryTree.TreeNode(0);
        InvertBinaryTree.TreeNode leftRight = new InvertBinaryTree.TreeNode(1);
        InvertBinaryTree.TreeNode left = new InvertBinaryTree.TreeNode(2, leftLeft, leftRight);
        InvertBinaryTree.TreeNode right = new InvertBinaryTree.TreeNode(3);
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(5, left, right);

        InvertBinaryTree.TreeNode inverted = new InvertBinaryTree().invertTree(root);

        assertEquals(5, inverted.val);
        assertEquals(3, inverted.left.val);
        assertEquals(2, inverted.right.val);
        assertEquals(0, inverted.right.right.val);
        assertEquals(1, inverted.right.left.val);
    }
}