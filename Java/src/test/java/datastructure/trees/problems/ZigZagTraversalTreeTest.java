package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;
import datastructure.trees.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagTraversalTreeTest {

    @Test
    public void zigZagTraversalTest() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = ZigZagTraversalTree.zigZagTraversal(tree);

        assertEquals("ACBDEFGKJIH", output);
    }

}