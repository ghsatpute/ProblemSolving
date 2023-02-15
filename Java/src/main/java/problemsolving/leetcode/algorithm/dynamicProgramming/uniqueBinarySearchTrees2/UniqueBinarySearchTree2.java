package problemsolving.leetcode.algorithm.dynamicProgramming.uniqueBinarySearchTrees2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueBinarySearchTree2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<TreeNode> generateTrees(int n) {
        List<Integer> numbers = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
        return generateTreesInternal(numbers);
    }

    private List<TreeNode> generateTreesInternal(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return Collections.emptyList();
        }

        if (numbers.size() == 1) {
            TreeNode treeNode = new TreeNode();
            treeNode.val = numbers.get(0);

            return Collections.singletonList(treeNode);
        }

        List<TreeNode> allPossibleTrees = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> leftNumbers = numbers.subList(0, i);
            List<TreeNode> leftTrees = generateTreesInternal(leftNumbers);

            List<Integer> rightNumbers = numbers.subList(i + 1, numbers.size());
            List<TreeNode> rightTrees = generateTreesInternal(rightNumbers);

            allPossibleTrees.addAll(generateTreeCombinations(numbers.get(i), leftTrees, rightTrees));
        }

        return allPossibleTrees;
    }

    private List<TreeNode> generateTreeCombinations(int rootData, List<TreeNode> leftTrees, List<TreeNode> rightTrees) {
        if (leftTrees.size() == 0) {
            return rightTrees.stream().map(treeNode -> {
                UniqueBinarySearchTree2.TreeNode root = new TreeNode(rootData);
                root.right = treeNode;

                return root;
            }).collect(Collectors.toList());
        }

        if (rightTrees.size() == 0) {
            return leftTrees.stream().map(treeNode -> {
                UniqueBinarySearchTree2.TreeNode root = new TreeNode(rootData);
                root.left = treeNode;

                return root;
            }).collect(Collectors.toList());
        }

        List<TreeNode> allTrees = new ArrayList<>();

        for (TreeNode leftTreeNode: leftTrees) {
            for (TreeNode rightTreeNode: rightTrees) {
                TreeNode root = new TreeNode();
                root.val = rootData;

                root.left = leftTreeNode;
                root.right = rightTreeNode;

                allTrees.add(root);
            }
        }

        return allTrees;
    }
}
