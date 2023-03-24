package problemsolving.leetcode.datastructures.trees.sumRootToLeafNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumRootToLeafNumbersStringParsingTest {
    @Test
    public void testCase01() {
        SumRootToLeafNumbersStringParsing.TreeNode root = new SumRootToLeafNumbersStringParsing.TreeNode(5);

        int output = new SumRootToLeafNumbersStringParsing().sumNumbers(root);

        assertEquals(5, output);
    }

    @Test
    public void testCase02() {
        SumRootToLeafNumbersStringParsing.TreeNode root = new SumRootToLeafNumbersStringParsing.TreeNode(5);
        root.left = new SumRootToLeafNumbersStringParsing.TreeNode(5);

        int output = new SumRootToLeafNumbersStringParsing().sumNumbers(root);

        assertEquals(55, output);
    }

    @Test
    public void testCase03() {
        SumRootToLeafNumbersStringParsing.TreeNode root = new SumRootToLeafNumbersStringParsing.TreeNode(5);
        root.left = new SumRootToLeafNumbersStringParsing.TreeNode(1);
        root.right = new SumRootToLeafNumbersStringParsing.TreeNode(1);

        int output = new SumRootToLeafNumbersStringParsing().sumNumbers(root);

        assertEquals(102, output);
    }

    @Test
    public void testCase04() {
        SumRootToLeafNumbersStringParsing.TreeNode root = new SumRootToLeafNumbersStringParsing.TreeNode(1);
        SumRootToLeafNumbersStringParsing.TreeNode rootRight = new SumRootToLeafNumbersStringParsing.TreeNode(1);
        SumRootToLeafNumbersStringParsing.TreeNode rootRightLeft = new SumRootToLeafNumbersStringParsing.TreeNode(1);
        SumRootToLeafNumbersStringParsing.TreeNode rootRightRight = new SumRootToLeafNumbersStringParsing.TreeNode(1);

        root.right = rootRight;
        root.right.left = rootRightLeft;
        root.right.right = rootRightRight;

        int output = new SumRootToLeafNumbersStringParsing().sumNumbers(root);

        assertEquals(222, output);
    }
}