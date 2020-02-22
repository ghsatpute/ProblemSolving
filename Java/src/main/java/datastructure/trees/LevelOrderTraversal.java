package datastructure.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static String levelOrderTraversal(BinaryTreeNode<String> tree) {
        Queue<BinaryTreeNode<String>> queue = new LinkedList<>();
        queue.add(tree);

        StringBuilder output = new StringBuilder();

        while (!queue.isEmpty()) {
            BinaryTreeNode<String> binaryTreeNode = queue.remove();
            output.append(binaryTreeNode.data);

            if (binaryTreeNode.left != null) queue.add(binaryTreeNode.left);
            if (binaryTreeNode.right != null) queue.add(binaryTreeNode.right);
        }

        return output.toString();
    }
}
