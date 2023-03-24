package problemsolving.leetcode.datastructures.trees.sumRootToLeafNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbersStringParsing {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        List<String> allNumStrings = calculateNumStrings(root);
        int sum = 0;
        for (String numString : allNumStrings) {
            sum += Integer.parseInt(numString);
        }
        return sum;
    }

    private List<String> calculateNumStrings(TreeNode root) {
        List<String> output = new ArrayList<>();
        if (root.left == null && root.right == null) {
            output.add("" + root.val);
            return output;
        }

        if (root.left != null) {
            List<String> leftNumberStrings = calculateNumStrings(root.left);
            for (String leftNumString : leftNumberStrings) {
                output.add(root.val + leftNumString);
            }
        }

        if (root.right != null) {
            List<String> rightNumberStrings = calculateNumStrings(root.right);
            for (String rightNumString : rightNumberStrings) {
                output.add(root.val + rightNumString);
            }
        }

        return output;
    }
}
