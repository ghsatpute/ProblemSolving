package problemsolving.leetcode.algorithm.greedy.jumpGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class JumpGameTest {
    @Test
    public void testCase01() {
        int[] input = new int[]{0};

        boolean output = new JumpGame().canJump(input);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[]{0, 0};

        boolean output = new JumpGame().canJump(input);

        assertFalse(output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[]{1, 0};

        boolean output = new JumpGame().canJump(input);

        assertTrue(output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[]{2, 0, 0};

        boolean output = new JumpGame().canJump(input);

        assertTrue(output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[]{2, 3, 1, 1, 4};

        boolean output = new JumpGame().canJump(input);

        assertTrue(output);
    }

    @Test
    public void testCase06() {
        int[] input = new int[]{3, 2, 1, 0, 4};

        boolean output = new JumpGame().canJump(input);

        assertFalse(output);
    }

}