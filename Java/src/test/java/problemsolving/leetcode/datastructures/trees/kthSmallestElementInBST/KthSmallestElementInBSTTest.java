package problemsolving.leetcode.datastructures.trees.kthSmallestElementInBST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthSmallestElementInBSTTest {
    @Test
    public void testCase01() {
        KthSmallestElementInBST.TreeNode root =
                new KthSmallestElementInBST.TreeNode(3,
                        new KthSmallestElementInBST.TreeNode(1,
                                null,
                                new KthSmallestElementInBST.TreeNode(2, null, null)),
                        new KthSmallestElementInBST.TreeNode(4, null, null));

        int output = new KthSmallestElementInBST().kthSmallest(root, 1);

        assertEquals(1, output);
    }

    @Test
    public void testCase02() {
        KthSmallestElementInBST.TreeNode root =
                new KthSmallestElementInBST.TreeNode(3,
                        new KthSmallestElementInBST.TreeNode(1,
                                null,
                                new KthSmallestElementInBST.TreeNode(2, null, null)),
                        new KthSmallestElementInBST.TreeNode(4, null, null));

        int output = new KthSmallestElementInBST().kthSmallest(root, 2);

        assertEquals(2, output);
    }

    @Test
    public void testCase03() {
        KthSmallestElementInBST.TreeNode root =
                new KthSmallestElementInBST.TreeNode(3,
                        new KthSmallestElementInBST.TreeNode(1,
                                null,
                                new KthSmallestElementInBST.TreeNode(2, null, null)),
                        new KthSmallestElementInBST.TreeNode(4, null, null));

        int output = new KthSmallestElementInBST().kthSmallest(root, 3);

        assertEquals(3, output);
    }

    @Test
    public void testCase04() {
        KthSmallestElementInBST.TreeNode root =
                new KthSmallestElementInBST.TreeNode(3,
                        new KthSmallestElementInBST.TreeNode(1,
                                null,
                                new KthSmallestElementInBST.TreeNode(2, null, null)),
                        new KthSmallestElementInBST.TreeNode(4, null, null));

        int output = new KthSmallestElementInBST().kthSmallest(root, 4);

        assertEquals(4, output);
    }

    @Test
    public void testCase05() {
        KthSmallestElementInBST.TreeNode root =
                new KthSmallestElementInBST.TreeNode(5,
                        new KthSmallestElementInBST.TreeNode(3,
                                new KthSmallestElementInBST.TreeNode(2,
                                        new KthSmallestElementInBST.TreeNode(1),
                                        null),
                                new KthSmallestElementInBST.TreeNode(4, null, null)),
                        new KthSmallestElementInBST.TreeNode(6, null, null));

        int output = new KthSmallestElementInBST().kthSmallest(root, 3);

        assertEquals(3, output);
    }
}