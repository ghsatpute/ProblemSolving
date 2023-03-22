package problemsolving.leetcode.datastructures.trees.binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();

        if (root == null) {
            return output;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // null is a end of level marker
        queue.add(null);

        while (!queue.isEmpty()) {
            List<Integer> currentLevelElements = new ArrayList<>();
            while (queue.peek() != null) {
                TreeNode current = queue.poll();
                currentLevelElements.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            // Remove the null marker from the start
            queue.poll();
            if (!queue.isEmpty()) {
                // add null to end of queue for signifying end of level
                queue.add(null);
            }
            output.add(currentLevelElements);
        }

        return output;
    }
}
