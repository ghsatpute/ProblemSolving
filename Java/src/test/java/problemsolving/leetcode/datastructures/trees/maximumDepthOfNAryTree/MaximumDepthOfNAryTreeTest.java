package problemsolving.leetcode.datastructures.trees.maximumDepthOfNAryTree;

import org.junit.jupiter.api.Test;
import problemsolving.leetcode.datastructures.trees.maximumDepthOfBinaryTree.MaximumDepthOfBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfNAryTreeTest {

  @Test
  public void testCase01() {
    // See README at MaximumDepthOfNAryTree class level for visualization
    MaximumDepthOfNAryTree.Node root = new MaximumDepthOfNAryTree.Node(
      1,
      Arrays.asList(
        new MaximumDepthOfNAryTree.Node(
          3,
          Arrays.asList(
            new MaximumDepthOfNAryTree.Node(
              5,
              new ArrayList<>()),
            new MaximumDepthOfNAryTree.Node(
              6,
              new ArrayList<>())
          )
        ),
        new MaximumDepthOfNAryTree.Node(
          2,
          new ArrayList<>()
        ),
        new MaximumDepthOfNAryTree.Node(
          4,
          new ArrayList<>()
        )
      )
    );

    int output = new MaximumDepthOfNAryTree().maxDepth(root);

    assertEquals(3, output);
  }

  @Test
  public void testCase02() {
    MaximumDepthOfNAryTree.Node root = new MaximumDepthOfNAryTree.Node(
      1,
      Arrays.asList(
        new MaximumDepthOfNAryTree.Node(
          2,
          new ArrayList<>()
        ),
        new MaximumDepthOfNAryTree.Node(
          3,
          Arrays.asList(
            new MaximumDepthOfNAryTree.Node(
              6,
              new ArrayList<>()
            ),
            new MaximumDepthOfNAryTree.Node(
              7,
              Arrays.asList(
                new MaximumDepthOfNAryTree.Node(
                  11,
                  Arrays.asList(
                    new MaximumDepthOfNAryTree.Node(
                      14,
                      new ArrayList<>()
                    )
                  )
                )
              )
            )
          )
        ),
        new MaximumDepthOfNAryTree.Node(
          4,
          Arrays.asList(
            new MaximumDepthOfNAryTree.Node(
              8,
              Arrays.asList(
                new MaximumDepthOfNAryTree.Node(
                  12,
                  new ArrayList<>()
                )
              )
            )
          )
        ),
        new MaximumDepthOfNAryTree.Node(
          5,
          Arrays.asList(
            new MaximumDepthOfNAryTree.Node(
              9,
              Arrays.asList(
                new MaximumDepthOfNAryTree.Node(
                  13,
                  new ArrayList<>()
                )
              )
            ),
            new MaximumDepthOfNAryTree.Node(
              10,
              new ArrayList<>()
            )
          )
        )
      )
    );

    int output = new MaximumDepthOfNAryTree().maxDepth(root);

    assertEquals(5, output);
  }
}
