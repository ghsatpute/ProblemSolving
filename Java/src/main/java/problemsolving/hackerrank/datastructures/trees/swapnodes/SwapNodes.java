package problemsolving.hackerrank.datastructures.trees.swapnodes;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class SwapNodes {

    static class BinaryTree implements Serializable {
        Integer data;
        BinaryTree left;
        BinaryTree right;
    }

    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        BinaryTree tree = createTree(indexes, 0);

        int[][] output = new int[queries.length][indexes.length];
        for (int k = 0; k < queries.length; k++) {
            swap(tree, 1, queries[k]);
            List<Integer> outputAtK = new LinkedList<>();
            inorderTraverse(tree, outputAtK);
            for (int j = 0; j < outputAtK.size(); j++) {
                output[k][j] = outputAtK.get(j);
            }
        }

        return output;
    }

    private static void inorderTraverse(BinaryTree tree, List<Integer> output) {
        if (tree == null) {
            return;
        }

        inorderTraverse(tree.left, output);
        output.add(tree.data);
        inorderTraverse(tree.right, output);
    }

    private static void swap(BinaryTree tree, int height, int k) {
        if (tree == null) {
            return;
        }

        if (height % k == 0) {
            BinaryTree temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;
        }

        swap(tree.left, height + 1, k);
        swap(tree.right, height + 1, k);
    }

    static BinaryTree createTree(int[][] indexes, int current) {
        BinaryTree tree = new BinaryTree();
        tree.data = current + 1;

        if (indexes[current][0] != -1)
            tree.left = createTree(indexes, indexes[current][0] - 1);
        if (indexes[current][1] != -1)
            tree.right = createTree(indexes, indexes[current][1] - 1);

        return tree;
    }
}
