package problemsolving.leetcode.datastructures.trees.binaryTreeLevelOrderTraversal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void testCase01() {
        BinaryTreeLevelOrderTraversal.TreeNode root = null;

        List<List<Integer>> output = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertNotNull(output);
        assertEquals(0, output.size());
    }

    @Test
    public void testCase02() {
        BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(3);

        List<List<Integer>> output = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertNotNull(output);
        assertEquals(1, output.size());
        assertEquals(3, output.get(0).get(0));
    }

    @Test
    public void testCase03() {
        BinaryTreeLevelOrderTraversal.TreeNode rootRightLeft = new BinaryTreeLevelOrderTraversal.TreeNode(15);
        BinaryTreeLevelOrderTraversal.TreeNode rootRightRight = new BinaryTreeLevelOrderTraversal.TreeNode(7);
        BinaryTreeLevelOrderTraversal.TreeNode rootRight =
                new BinaryTreeLevelOrderTraversal.TreeNode(20, rootRightLeft, rootRightRight);

        BinaryTreeLevelOrderTraversal.TreeNode rootLeft = new BinaryTreeLevelOrderTraversal.TreeNode(9);

        BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(3, rootLeft, rootRight);


        List<List<Integer>> output = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertNotNull(output);
        assertEquals(3, output.size());

        assertEquals(1, output.get(0).size());
        assertEquals(3, output.get(0).get(0));

        assertEquals(2, output.get(1).size());
        assertEquals(9, output.get(1).get(0));
        assertEquals(20, output.get(1).get(1));

        assertEquals(2, output.get(2).size());
        assertEquals(15, output.get(2).get(0));
        assertEquals(7, output.get(2).get(1));
    }
}