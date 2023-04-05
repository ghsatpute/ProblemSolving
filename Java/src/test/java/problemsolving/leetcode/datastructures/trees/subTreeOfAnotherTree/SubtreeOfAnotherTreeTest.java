package problemsolving.leetcode.datastructures.trees.subTreeOfAnotherTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtreeOfAnotherTreeTest {

    @Test
    public void testCase01() {
        SubtreeOfAnotherTree.TreeNode root = new SubtreeOfAnotherTree.TreeNode(
                3,
                new SubtreeOfAnotherTree.TreeNode(4,
                        new SubtreeOfAnotherTree.TreeNode(1),
                        new SubtreeOfAnotherTree.TreeNode(2)),
                new SubtreeOfAnotherTree.TreeNode(4));

        SubtreeOfAnotherTree.TreeNode subTree = new SubtreeOfAnotherTree.TreeNode(4,
                new SubtreeOfAnotherTree.TreeNode(1),
                new SubtreeOfAnotherTree.TreeNode(2));

        boolean isSubTree = new SubtreeOfAnotherTree().isSubtree(root, subTree);

        assertTrue(isSubTree);
    }

    @Test
    public void testCase02() {
        SubtreeOfAnotherTree.TreeNode root = new SubtreeOfAnotherTree.TreeNode(
                3,
                new SubtreeOfAnotherTree.TreeNode(4,
                        new SubtreeOfAnotherTree.TreeNode(1),
                        new SubtreeOfAnotherTree.TreeNode(2,
                                new SubtreeOfAnotherTree.TreeNode(1),
                                null)),
                new SubtreeOfAnotherTree.TreeNode(4));

        SubtreeOfAnotherTree.TreeNode subTree = new SubtreeOfAnotherTree.TreeNode(4,
                new SubtreeOfAnotherTree.TreeNode(1),
                new SubtreeOfAnotherTree.TreeNode(2));

        boolean isSubTree = new SubtreeOfAnotherTree().isSubtree(root, subTree);

        assertFalse(isSubTree);
    }

}