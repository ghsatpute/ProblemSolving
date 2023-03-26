package problemsolving.leetcode.datastructures.trees.validateBinarySearchTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {
    @Test
    public void testCase01() {
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(1);

        boolean output = new ValidateBinarySearchTree().isValidBST(root);

        assertTrue(output);
    }

    @Test
    public void testCase02_leetCodeIntegerOverflow() {
        ValidateBinarySearchTree.TreeNode root
                = new ValidateBinarySearchTree.TreeNode(2147483647);

        boolean output = new ValidateBinarySearchTree().isValidBST(root);

        assertTrue(output);
    }

    @Test
    public void testCase03_leetCodeIntegerOverflow() {
        ValidateBinarySearchTree.TreeNode right
                = new ValidateBinarySearchTree.TreeNode(2147483647);
        ValidateBinarySearchTree.TreeNode root
                = new ValidateBinarySearchTree.TreeNode(-2147483648, null, right);

        boolean output = new ValidateBinarySearchTree().isValidBST(root);

        assertTrue(output);
    }
}