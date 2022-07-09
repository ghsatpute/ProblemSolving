package problemsolving.leetcode.datastructures.trees.minimumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthOfBinaryTreeTest {

  @Test
  public void testCase01() {
    MinimumDepthOfBinaryTree.TreeNode root =
      new MinimumDepthOfBinaryTree.TreeNode(
        3,
        new MinimumDepthOfBinaryTree.TreeNode(
          9,
          null,
          null
        ),
        new MinimumDepthOfBinaryTree.TreeNode(
          20,
          new MinimumDepthOfBinaryTree.TreeNode(
            15,
            null,
            null
          ),
          new MinimumDepthOfBinaryTree.TreeNode(
            7,
            null,
            null
          )
        )
      );

    int output = MinimumDepthOfBinaryTree.minDepth(root);

    assertEquals(2, output);
  }

  @Test
  public void testCase02() {
    MinimumDepthOfBinaryTree.TreeNode root =
      new MinimumDepthOfBinaryTree.TreeNode(
        2,
        null,
        new MinimumDepthOfBinaryTree.TreeNode(
          3,
          null,
          new MinimumDepthOfBinaryTree.TreeNode(
            4,
            null,
            new MinimumDepthOfBinaryTree.TreeNode(
              5,
              null,
              new MinimumDepthOfBinaryTree.TreeNode(
                6,
                null,
                null
              )
            )
          )
        )
      );

    int output = MinimumDepthOfBinaryTree.minDepth(root);

    assertEquals(5, output);
  }
}