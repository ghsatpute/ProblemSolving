package problemsolving.leetcode.datastructures.trees.constructBinaryTreeFromPreOrderAndInOrderTraversal;

public class ConstructBinaryTreeFromPreOrderAndInOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(
            int[] preorder, int startPreorder, int endPreorder,
            int[] inorder, int startInorder, int endInorder) {

        TreeNode currentRoot = null;
        if (endPreorder < startPreorder) {
            return currentRoot;
        }

        currentRoot = new TreeNode(preorder[startPreorder]);

        if (endPreorder == startPreorder) {
            return currentRoot;
        }

        // The first element in current array is root. Find that element in inorder array
        int rootIndexInInorder = findIndex(inorder, startInorder, endPreorder, currentRoot.val);
        int leftTreeSize = rootIndexInInorder - startInorder;

        currentRoot.left = buildTree(
                preorder, startPreorder + 1, startPreorder + leftTreeSize,
                inorder, startInorder, rootIndexInInorder - 1);

        currentRoot.right = buildTree(
                preorder, startPreorder + leftTreeSize + 1, endPreorder,
                inorder, rootIndexInInorder + 1, endInorder);

        return currentRoot;
    }

    private int findIndex(int[] inorder, int start, int end, int itemToFind) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == itemToFind) {
                return i;
            }
        }

        return -1;
    }
}
