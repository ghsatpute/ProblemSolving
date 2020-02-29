package datastructure.trees;

import datastructure.trees.problems.HeightOfBinaryTree;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeightOfBinaryTreeTest {

    @Test
    public void calculateHeightOfTree() {
        BinaryTreeNode<String> tree = TreeUtils.createBinaryTree();

        int result = HeightOfBinaryTree.calculate(tree);

        assertEquals(4, result);
    }

    @Test
    public void calculateHeightOfTree_nullTree() {
        int result = HeightOfBinaryTree.calculate(null);

        assertEquals(0, result);
    }
}