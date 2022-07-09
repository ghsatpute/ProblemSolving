package problemsolving.leetcode.datastructures.trees.maximumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {
  @Test
  public void testCaseO1() {
    MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
      3,
      new MaximumDepthOfBinaryTree.TreeNode(
        9,
        null,
        null
      ),
      new MaximumDepthOfBinaryTree.TreeNode(
        20,
        new MaximumDepthOfBinaryTree.TreeNode(
          15,
          null,
          null
        ),
        new MaximumDepthOfBinaryTree.TreeNode(
          7,
          null,
          null
        )
      )
    );

    int output = MaximumDepthOfBinaryTree.maxDepth(root);

    assertEquals(3, output);
  }

  @Test
  public void testCase02() {
    MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
      1,
      null,
      new MaximumDepthOfBinaryTree.TreeNode(
        2,
        null,
        null
      )
    );

    int output = MaximumDepthOfBinaryTree.maxDepth(root);

    assertEquals(2, output);
  }
}