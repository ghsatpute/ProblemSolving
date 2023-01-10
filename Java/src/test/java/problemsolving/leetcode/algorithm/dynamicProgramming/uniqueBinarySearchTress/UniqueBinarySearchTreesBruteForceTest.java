package problemsolving.leetcode.algorithm.dynamicProgramming.uniqueBinarySearchTress;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueBinarySearchTreesBruteForceTest {
    @Test
    public void testCase01() {
        int input = 1;

        int output = new UniqueBinarySearchTreesBruteForce().numTrees(input);

        assertEquals(1, output);
    }


    @Test
    public void testCase02() {
        int input = 2;

        int output = new UniqueBinarySearchTreesBruteForce().numTrees(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase03() {
        int input = 3;

        int output = new UniqueBinarySearchTreesBruteForce().numTrees(input);

        assertEquals(5, output);
    }

    @Test
    public void testCase04() {
        int input = 4;

        int output = new UniqueBinarySearchTreesBruteForce().numTrees(input);

        assertEquals(14, output);
    }
}