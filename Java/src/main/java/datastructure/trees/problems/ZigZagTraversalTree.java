package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

import java.util.Stack;

public class ZigZagTraversalTree {

    public static String zigZagTraversal(BinaryTreeNode<String> tree) {
        Stack<BinaryTreeNode<String>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<String>> stack2 = new Stack<>();

        stack1.add(tree);

        StringBuilder output = new StringBuilder();
        while(!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                BinaryTreeNode<String> current = stack1.pop();
                output.append(current.data);

                if (current.left != null) stack2.push(current.left);
                if (current.right != null) stack2.push(current.right);
            }

            while (!stack2.isEmpty()) {
                BinaryTreeNode<String> current = stack2.pop();

                output.append(current.data);
                if (current.right != null) stack1.push(current.right);
                if (current.left != null) stack1.push(current.left);
            }
        }

        return output.toString();
    }
}
