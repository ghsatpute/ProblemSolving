package datastructure.trees.problems;

public class ConstructBstFromPreorderTraversal {
    public static class Tree {
        Tree left;
        Tree right;
        int data;
    }
    public static Tree solve(int[] preOrderTraversal) {
        if (preOrderTraversal.length == 0) {
            return null;
        }

        return createTree(preOrderTraversal, 0, preOrderTraversal.length - 1);
    }

    private static Tree createTree(int[] preOrderTraversal, int start, int end) {
        if (start > end) {
            return null;
        }

        Tree root = new Tree();
        root.data = preOrderTraversal[start];

        if (start == end) {
            return root;
        }

        int i = start;
        while (i <= end && preOrderTraversal[i] <= root.data) {
            i++;
        }

        root.right = createTree(preOrderTraversal, i, end);
        root.left = createTree(preOrderTraversal, start + 1, i - 1);

        return root;
    }
}
