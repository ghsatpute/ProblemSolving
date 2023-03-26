package problemsolving.leetcode.datastructures.trees.constructBinaryTreeFromPreOrderAndInOrderTraversal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructBinaryTreeFromPreOrderAndInOrderTraversalTest {
    @Test
    public void testCase01() {
        int[] preorder = {1};
        int[] inorder = {1};

        ConstructBinaryTreeFromPreOrderAndInOrderTraversal.TreeNode output =
                new ConstructBinaryTreeFromPreOrderAndInOrderTraversal().buildTree(preorder, inorder);

        assertNotNull(output);
        assertEquals(1, output.val);
        assertNull(output.left);
        assertNull(output.right);
    }

    @Test
    public void testCase02_leetCodeExample1() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        ConstructBinaryTreeFromPreOrderAndInOrderTraversal.TreeNode output =
                new ConstructBinaryTreeFromPreOrderAndInOrderTraversal().buildTree(preorder, inorder);

        assertNotNull(output);
        assertEquals(3, output.val);
        assertEquals(9, output.left.val);
        assertEquals(20, output.right.val);
        assertEquals(15, output.right.left.val);
        assertEquals(7, output.right.right.val);
    }
}