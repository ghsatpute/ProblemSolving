package datastructure.trees;

public class TreeUtils {

    public static BinaryTreeNode<String> createBinaryTree() {
        /*
         *               A
         *
         *          B         C
         *
         *      D      E   F      G
         *
         *   H     I  J         K
         *
         * InOrder: HDIBJEAFCKG
         * PreOrder: ABDHIEJCFGK
         * PostOrder: HIDJEBFKGCA
         * ZigZag Traversal: ACBDEFGKJIH
         */
        BinaryTreeNode<String> root = createTreeNode("A");

        BinaryTreeNode<String> bNode = createTreeNode("B");
        root.left = bNode;
        BinaryTreeNode<String> cNode = createTreeNode("C");
        root.right = cNode;

        BinaryTreeNode<String> dNode = createTreeNode("D");
        bNode.left = dNode;
        BinaryTreeNode<String> eNode = createTreeNode("E");
        bNode.right = eNode;

        cNode.left = createTreeNode("F");
        BinaryTreeNode<String> gNode = createTreeNode("G");
        cNode.right = gNode;

        BinaryTreeNode<String> hNode = createTreeNode("H");
        dNode.left = hNode;
        BinaryTreeNode<String> iNode = createTreeNode("I");
        dNode.right = iNode;

        BinaryTreeNode<String> jNode = createTreeNode("J");
        eNode.left = jNode;

        BinaryTreeNode<String> kNode = createTreeNode("K");
        gNode.left = kNode;

        return root;
    }

    private static BinaryTreeNode<String> createTreeNode(String data) {
        BinaryTreeNode<String> binaryTreeNode = new BinaryTreeNode<>();
        binaryTreeNode.data = data;
        return binaryTreeNode;
    }
}
