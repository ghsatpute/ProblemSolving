package datastructure.trees.problems;

import datastructure.trees.BinaryTreeNode;

import java.util.Stack;

public class TreeTraversalWithoutRecursion {

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

    public static String inorderTraversalWithoutRecursionVariant2(BinaryTreeNode<String> tree) {
        StringBuilder output = new StringBuilder();

        Stack<BinaryTreeNode<String>> stack = new Stack<>();

        BinaryTreeNode<String> current = tree;

        while (current != null || !stack.empty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();

                output.append(current.data);

                current = current.right;
            }
        }

        return output.toString();
    }

    public static String preOrderTraversalWithoutRecursionVariant1(BinaryTreeNode<String> tree) {
        Stack<BinaryTreeNode<String>> stack = new Stack<>();
        stack.push(tree);
        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty()) {
            BinaryTreeNode<String> current = stack.pop();

            output.append(current.data);
            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return output.toString();
    }

    public static String preOrderTraversalWithoutRecursionVariant2(BinaryTreeNode<String> tree) {
        Stack<BinaryTreeNode<String>> stack = new Stack<>();

        BinaryTreeNode<String> current = tree;
        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty() || current != null) {
            // Go to end of left side of the tree while pushing all the
            // elements on the stack
            while (current!= null) {
                output.append(current.data);
                stack.push(current);
                current = current.left;
            }

            current = stack.pop().right;
        }
        return output.toString();
    }

    public static String postOrderTraversalWithoutRecursionWithTwoStacks(BinaryTreeNode<String> tree) {
        Stack<BinaryTreeNode<String>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<String>> stack2 = new Stack<>();
        stack1.add(tree);
        while (!stack1.isEmpty()) {
            BinaryTreeNode<String> current = stack1.pop();

            stack2.push(current);

            if (current.left != null) {
                stack1.push(current.left);
            }

            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        StringBuilder output = new StringBuilder();
        while(!stack2.isEmpty()) {
            output.append(stack2.pop().data);
        }

        return output.toString();
    }

    public static String postOrderTraversalWithoutRecursionSingleStack(BinaryTreeNode<String> tree) {
        Stack<BinaryTreeNode<String>> stack = new Stack<>();

        BinaryTreeNode<String> current = tree;
        StringBuilder output = new StringBuilder();

        BinaryTreeNode<String> lastElement = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            BinaryTreeNode<String> rightTree = stack.peek().right;

            if (rightTree == null || rightTree == lastElement) {
                lastElement = stack.pop();
                output.append(lastElement.data);
            } else {
                current = rightTree;
            }
        }

        return output.toString();
    }
}
