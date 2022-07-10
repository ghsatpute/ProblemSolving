package problemsolving.leetcode.datastructures.trees.maximumDepthOfNAryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDepthOfNAryTree {
  public static class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }
  public int maxDepth(Node root) {
    if (root == null) {
      return 0;
    }

    if (root.children.size() == 0) {
      return 1;
    }

    List<Integer> depths = new ArrayList<>();

    for (Node child: root.children) {
      Integer depth = maxDepth(child);

      depths.add(depth);
    }

    return 1 + Collections.max(depths);
  }
}
