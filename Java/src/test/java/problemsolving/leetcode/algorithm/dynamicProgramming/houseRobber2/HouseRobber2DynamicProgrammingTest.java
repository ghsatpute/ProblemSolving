package problemsolving.leetcode.algorithm.dynamicProgramming.houseRobber2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseRobber2DynamicProgrammingTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {2,3,2};

        int output = new HouseRobber2DynamicProgramming().rob(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1,2,3,1};

        int output = new HouseRobber2DynamicProgramming().rob(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {1,2,3};

        int output = new HouseRobber2DynamicProgramming().rob(input);

        assertEquals(3, output);
    }
}