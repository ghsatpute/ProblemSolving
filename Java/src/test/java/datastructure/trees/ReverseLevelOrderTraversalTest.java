package datastructure.trees;

import datastructure.trees.problems.ReverseLevelOrderTraversal;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseLevelOrderTraversalTest {

    @Test
    public void reverseLeverOrderTraversal() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        String output = ReverseLevelOrderTraversal.reverseLevelOrderTraversal(tree);

        assertEquals("HIJKDEFGBCA", output);
    }
}