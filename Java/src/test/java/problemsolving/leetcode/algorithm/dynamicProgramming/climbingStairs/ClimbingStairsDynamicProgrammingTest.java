package problemsolving.leetcode.algorithm.dynamicProgramming.climbingStairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairsDynamicProgrammingTest {
    @Test
    public void testCase01() {
        int input = 2;

        int output = new ClimbingStairsDynamicProgramming().climbStairs(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase02() {
        int input = 3;

        int output = new ClimbingStairsDynamicProgramming().climbStairs(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase03() {
        int input = 4;

        int output = new ClimbingStairsDynamicProgramming().climbStairs(input);

        assertEquals(5, output);
    }

    @Test
    public void testCase04() {
        int input = 5;

        int output = new ClimbingStairsDynamicProgramming().climbStairs(input);

        assertEquals(8, output);
    }

    @Test
    public void testCase05() {
        int input = 10;

        int output = new ClimbingStairsDynamicProgramming().climbStairs(input);

        assertEquals(89, output);
    }

}