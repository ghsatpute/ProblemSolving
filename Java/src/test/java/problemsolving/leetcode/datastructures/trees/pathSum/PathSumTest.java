package problemsolving.leetcode.datastructures.trees.pathSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

class PathSumTest {

  @Test
  public void testCase01() {
    PathSum.TreeNode root = null;

    boolean output = PathSum.hasPathSum(root, 10);

    Assertions.assertFalse(output);
  }

  @Test
  public void testCase02() {
    PathSum.TreeNode root = new PathSum.TreeNode(
      5,
      new PathSum.TreeNode(
        4,
        new PathSum.TreeNode(
          11,
          new PathSum.TreeNode(
            7,
            null,
            null),
          new PathSum.TreeNode(
            2,
            null,
            null)
        ),
        null),
      new PathSum.TreeNode(
        8,
        new PathSum.TreeNode(
          13,
          null,
          null
        ),
        new PathSum.TreeNode(
          4,
          null,
          new PathSum.TreeNode(
            1,
            null,
            null)
        )
      )
    );

    boolean output = PathSum.hasPathSum(root, 22);

    Assertions.assertTrue(output);
  }
}