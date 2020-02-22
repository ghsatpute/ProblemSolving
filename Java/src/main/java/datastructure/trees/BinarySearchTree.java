package datastructure.trees;

import javafx.util.Pair;

public class BinarySearchTree<T extends Comparable<T>> {
    BinaryTreeNode<T> tree;

    public void insert(BinaryTreeNode<T> node) {
        Pair<BinaryTreeNode<T>, BinaryTreeNode<T>> searchResult = searchWithParent(node.data);

        // Empty tree
        if (searchResult == null) {
            tree = node;
            return;
        }

        // Data already exist, do nothing
        BinaryTreeNode<T> existingNode = searchResult.getValue();
        if (existingNode != null) {
            return;
        }

        BinaryTreeNode<T> parent = searchResult.getKey();

        if (node.data.compareTo(parent.data) < 0) {
            searchResult.getKey().left = node;
        } else {
            searchResult.getKey().right = node;
        }
    }

    public BinaryTreeNode<T> search(T data) {
        Pair<BinaryTreeNode<T>, BinaryTreeNode<T>> searchResult = searchWithParent(data);
        if (searchResult != null) {
            return searchResult.getValue();
        }
        return null;
    }

    private Pair<BinaryTreeNode<T>, BinaryTreeNode<T>> searchWithParent(T data) {
        if (tree == null) {
            return null;
        }
        BinaryTreeNode<T> parent = null;
        BinaryTreeNode<T> current = tree;
        while (current != null) {
            parent = current;
            if (data == current.data) {
                return new Pair<>(parent, current);
            } else if (data.compareTo(current.data) < 0) {
                current = current.left;
            } else if (data.compareTo(current.data) > 0) {
                current = current.right;
            }
        }

        return new Pair<>(parent, null);
    }
}
