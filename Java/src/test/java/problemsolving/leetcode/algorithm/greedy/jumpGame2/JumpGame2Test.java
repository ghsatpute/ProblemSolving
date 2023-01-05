package problemsolving.leetcode.algorithm.greedy.jumpGame2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpGame2Test {
    @Test
    public void testCase01() {
        int[] input = new int[] {2,3,1,1,4};

        int output = new JumpGame2().jump(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {2,3,0,1,4};

        int output = new JumpGame2().jump(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {1, 2, 3};

        int output = new JumpGame2().jump(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {1};

        int output = new JumpGame2().jump(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[] {2, 1};

        int output = new JumpGame2().jump(input);

        assertEquals(1, output);
    }
}