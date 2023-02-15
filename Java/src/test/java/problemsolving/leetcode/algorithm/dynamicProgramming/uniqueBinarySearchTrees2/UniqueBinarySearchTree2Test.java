package problemsolving.leetcode.algorithm.dynamicProgramming.uniqueBinarySearchTrees2;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UniqueBinarySearchTree2Test {
    @Test
    public void testCase01() {
        List<UniqueBinarySearchTree2.TreeNode> treeNodes = new UniqueBinarySearchTree2().generateTrees(0);

        assertEquals(0, treeNodes.size());
    }

    @Test
    public void testCase02() {
        List<UniqueBinarySearchTree2.TreeNode> treeNodes = new UniqueBinarySearchTree2().generateTrees(1);

        assertEquals(1, treeNodes.size());
        assertEquals(1, treeNodes.get(0).val);
    }

    @Test
    public void testCase03() {
        List<UniqueBinarySearchTree2.TreeNode> treeNodes = new UniqueBinarySearchTree2().generateTrees(2);

        assertEquals(2, treeNodes.size());

        UniqueBinarySearchTree2.TreeNode firstTree = treeNodes.get(0);
        assertEquals(1, firstTree.val);
        assertEquals(2, firstTree.right.val);

        UniqueBinarySearchTree2.TreeNode secondTree = treeNodes.get(1);
        assertEquals(2, secondTree.val);
        assertEquals(1, secondTree.left.val);
    }

    @Test
    public void testCase04() {
        List<UniqueBinarySearchTree2.TreeNode> treeNodes = new UniqueBinarySearchTree2().generateTrees(3);

        assertEquals(5, treeNodes.size());

        UniqueBinarySearchTree2.TreeNode tree1 = treeNodes.get(0);
        assertEquals(1, tree1.val);
        assertEquals(2, tree1.right.val);
        assertEquals(3, tree1.right.right.val);

        UniqueBinarySearchTree2.TreeNode tree2 = treeNodes.get(1);
        assertEquals(1, tree2.val);
        assertEquals(3, tree2.right.val);
        assertEquals(2, tree2.right.left.val);

        UniqueBinarySearchTree2.TreeNode tree3 = treeNodes.get(2);
        assertEquals(2, tree3.val);
        assertEquals(1, tree3.left.val);
        assertEquals(3, tree3.right.val);

        UniqueBinarySearchTree2.TreeNode tree4 = treeNodes.get(3);
        assertEquals(3, tree4.val);
        assertEquals(1, tree4.left.val);
        assertEquals(2, tree4.left.right.val);

        UniqueBinarySearchTree2.TreeNode tree5 = treeNodes.get(4);
        assertEquals(3, tree5.val);
        assertEquals(2, tree5.left.val);
        assertEquals(1, tree5.left.left.val);
    }
}