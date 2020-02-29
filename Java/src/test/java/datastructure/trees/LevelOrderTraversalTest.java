package datastructure.trees;

import datastructure.trees.problems.LevelOrderTraversal;
import org.junit.Test;

import static datastructure.trees.TreeUtils.createBinaryTree;
import static org.junit.Assert.*;

public class LevelOrderTraversalTest {

    @Test
    public void levelOrderTraversalTest() {
        BinaryTreeNode<String> tree = createBinaryTree();

        String output = LevelOrderTraversal.levelOrderTraversal(tree);

        // Inorder traversal: HDIBJEAFCKG
        // Level order traversal: ABCDEFGHIJK
        assertEquals("ABCDEFGHIJK", output);
    }
}