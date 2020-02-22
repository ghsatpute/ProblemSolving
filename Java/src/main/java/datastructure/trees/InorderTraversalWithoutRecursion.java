package datastructure.trees;

import java.util.Stack;

import static datastructure.trees.TreeUtils.createTree;

public class InorderTraversalWithoutRecursion {

    public static String inorderTraversalWithoutRecursion(BinaryTreeNode<String> tree) {
        StringBuilder output = new StringBuilder();

        Stack<BinaryTreeNode<String>> stack = new Stack<>();

        BinaryTreeNode<String> current = tree;

        while (current != null || !stack.empty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            output.append(current.data);

            current = current.right;
        }

        return output.toString();
    }
}
