package datastructure.trees;

public class BinaryTreeNode<T> {
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    public T data;

    public BinaryTreeNode() {}

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
