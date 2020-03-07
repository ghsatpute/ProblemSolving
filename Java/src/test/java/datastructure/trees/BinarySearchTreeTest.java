package datastructure.trees;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {
    @Test
    public void insertFirst() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(10);

        bst.insert(node);

        assertNotNull(bst.tree);
    }

    @Test
    public void insertToLeft() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(10);
        bst.insert(node);
        BinaryTreeNode<Integer> nodeToLeft = new BinaryTreeNode<>(5);

        bst.insert(nodeToLeft);

        assertNotNull(bst.tree);
        assertNotNull(bst.tree.left);
    }

    @Test
    public void insertToRight() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(10);
        bst.insert(node);
        BinaryTreeNode<Integer> nodeToRight = new BinaryTreeNode<>(20);

        bst.insert(nodeToRight);

        assertNotNull(bst.tree);
        assertNotNull(bst.tree.right);
    }

    @Test
    public void insertAlreadyExistingData() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(10);
        bst.insert(node);
        BinaryTreeNode<Integer> nodeWithExistingData = new BinaryTreeNode<>(10);

        bst.insert(nodeWithExistingData);

        assertNotNull(bst.tree);
        assertNull(bst.tree.left);
        assertNull(bst.tree.right);
    }


    @Test
    public void search_emptyTree() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinaryTreeNode<Integer> result = bst.search(5);

        assertNull(result);
    }

    @Test
    public void search_found() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(20);

        bst.insert(node1);
        bst.insert(node2);
        bst.insert(node3);

        BinaryTreeNode<Integer> result = bst.search(5);

        assertNotNull(result);
    }

    @Test
    public void search_notFound() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(20);

        bst.insert(node1);
        bst.insert(node2);
        bst.insert(node3);

        BinaryTreeNode<Integer> result = bst.search(7);

        assertNull(result);
    }
}
