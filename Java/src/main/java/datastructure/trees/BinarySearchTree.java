package datastructure.trees;

public class BinarySearchTree<T extends Comparable<T>> {
    BinaryTreeNode<T> tree;

    private class BinarySearchTreeResult {
        BinaryTreeNode<T> parent; // If node is not found it'll still set this node.
        BinaryTreeNode<T> node;

        private BinarySearchTreeResult(BinaryTreeNode<T> parent, BinaryTreeNode<T> node) {
            this.parent = parent;
            this.node = node;
        }
    }

    public void insert(BinaryTreeNode<T> node) {

        if (tree == null) {
            tree = node;
            return;
        }

        BinarySearchTreeResult searchResult = searchWithParent(node.data);

        // Data already exist, do nothing
        if (searchResult.node != null) {
            return;
        }

        BinaryTreeNode<T> parent = searchResult.parent;

        if (node.data.compareTo(parent.data) < 0) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }

    public BinaryTreeNode<T> search(T data) {
        BinarySearchTreeResult searchResult = searchWithParent(data);

        return searchResult.node;
    }

    private BinarySearchTreeResult searchWithParent(T data) {
        if (tree == null) {
            return new BinarySearchTreeResult(null, null);
        }
        BinaryTreeNode<T> parent = null;
        BinaryTreeNode<T> current = tree;
        while (current != null) {
            if (data == current.data) {
                return new BinarySearchTreeResult(parent, current);
            } else if (data.compareTo(current.data) < 0) {
                parent = current;
                current = current.left;
            } else if (data.compareTo(current.data) > 0) {
                parent = current;
                current = current.right;
            }
        }

        return new BinarySearchTreeResult(parent, null);
    }
}
