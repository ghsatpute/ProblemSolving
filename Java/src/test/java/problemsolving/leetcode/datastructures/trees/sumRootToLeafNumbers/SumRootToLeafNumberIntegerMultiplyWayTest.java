package problemsolving.leetcode.datastructures.trees.sumRootToLeafNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumRootToLeafNumberIntegerMultiplyWayTest {
    @Test
    public void testCase01() {
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode root = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(5);

        int output = new SumRootToLeafNumberIntegerMultiplyWay().sumNumbers(root);

        assertEquals(5, output);
    }

    @Test
    public void testCase02() {
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode root = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(5);
        root.left = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(5);

        int output = new SumRootToLeafNumberIntegerMultiplyWay().sumNumbers(root);

        assertEquals(55, output);
    }

    @Test
    public void testCase03() {
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode root = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(5);
        root.left = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        root.right = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);

        int output = new SumRootToLeafNumberIntegerMultiplyWay().sumNumbers(root);

        assertEquals(102, output);
    }

    @Test
    public void testCase04() {
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode root = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRight = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRightLeft = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRightRight = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);

        root.right = rootRight;
        root.right.left = rootRightLeft;
        root.right.right = rootRightRight;

        int output = new SumRootToLeafNumberIntegerMultiplyWay().sumNumbers(root);

        assertEquals(222, output);
    }

    @Test
    public void testCase05() {
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode root = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRight = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRightLeft = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRightLeftRight = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);
        SumRootToLeafNumberIntegerMultiplyWay.TreeNode rootRightRight = new SumRootToLeafNumberIntegerMultiplyWay.TreeNode(1);

        root.right = rootRight;
        root.right.left = rootRightLeft;
        root.right.left.right = rootRightLeftRight;
        root.right.right = rootRightRight;


        int output = new SumRootToLeafNumberIntegerMultiplyWay().sumNumbers(root);

        assertEquals(1222, output);
    }
}