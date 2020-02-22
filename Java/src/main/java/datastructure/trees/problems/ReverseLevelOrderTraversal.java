package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {

    public static String reverseLevelOrderTraversal(BinaryTreeNode<String> root) {

        Stack<BinaryTreeNode<String>> stack = new Stack<>();
        Queue<BinaryTreeNode<String>> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<String> current = queue.remove();
            stack.add(current);

            if (current.right != null) queue.add(current.right);
            if (current.left != null) queue.add(current.left);
        }

        StringBuilder output = new StringBuilder();
        while (!stack.empty()) {
            output.append(stack.pop().data);
        }
        return output.toString();
    }
}
