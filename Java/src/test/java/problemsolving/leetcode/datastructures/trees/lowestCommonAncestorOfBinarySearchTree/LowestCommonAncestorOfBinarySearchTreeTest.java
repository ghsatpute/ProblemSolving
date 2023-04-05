package problemsolving.leetcode.datastructures.trees.lowestCommonAncestorOfBinarySearchTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LowestCommonAncestorOfBinarySearchTreeTest {
    @Test
    public void testCase01() {
        LowestCommonAncestorOfBinarySearchTree.TreeNode root
                = new LowestCommonAncestorOfBinarySearchTree.TreeNode(6,
                    new LowestCommonAncestorOfBinarySearchTree.TreeNode(2,
                            new LowestCommonAncestorOfBinarySearchTree.TreeNode(0),
                            new LowestCommonAncestorOfBinarySearchTree.TreeNode(4,
                                    new LowestCommonAncestorOfBinarySearchTree.TreeNode(3),
                                    new LowestCommonAncestorOfBinarySearchTree.TreeNode(5))),
                new LowestCommonAncestorOfBinarySearchTree.TreeNode(8,
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(7),
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(9)));

        LowestCommonAncestorOfBinarySearchTree.TreeNode output =
                new LowestCommonAncestorOfBinarySearchTree().lowestCommonAncestor(root,
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(2),
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(8));


        assertEquals(6, output.val);
    }

    @Test
    public void testCase02() {
        LowestCommonAncestorOfBinarySearchTree.TreeNode root
                = new LowestCommonAncestorOfBinarySearchTree.TreeNode(6,
                new LowestCommonAncestorOfBinarySearchTree.TreeNode(2,
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(0),
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(4,
                                new LowestCommonAncestorOfBinarySearchTree.TreeNode(3),
                                new LowestCommonAncestorOfBinarySearchTree.TreeNode(5))),
                new LowestCommonAncestorOfBinarySearchTree.TreeNode(8,
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(7),
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(9)));

        LowestCommonAncestorOfBinarySearchTree.TreeNode output =
                new LowestCommonAncestorOfBinarySearchTree().lowestCommonAncestor(root,
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(2),
                        new LowestCommonAncestorOfBinarySearchTree.TreeNode(4));


        assertEquals(2, output.val);
    }
}