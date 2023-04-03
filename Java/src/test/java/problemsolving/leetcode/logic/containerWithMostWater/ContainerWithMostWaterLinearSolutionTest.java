package problemsolving.leetcode.logic.containerWithMostWater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterLinearSolutionTest {
    @Test
    public void testCase01() {
        int[] heights = {1,8,6,2,5,4,8,3,7};

        int output = new ContainerWithMostWaterLinearSolution().maxArea(heights);

        assertEquals(49, output);
    }

    @Test
    public void testCase02() {
        int[] heights = {1,1};

        int output = new ContainerWithMostWaterLinearSolution().maxArea(heights);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        int[] heights = {5,5,5,5,5};

        int output = new ContainerWithMostWaterLinearSolution().maxArea(heights);

        assertEquals(20, output);
    }

    @Test
    public void testCase04() {
        int[] heights = {1,2,3,4,5};

        int output = new ContainerWithMostWaterLinearSolution().maxArea(heights);

        assertEquals(6, output);
    }

    @Test
    public void testCase05() {
        int[] heights = {1,2,3,2,1};

        int output = new ContainerWithMostWaterLinearSolution().maxArea(heights);

        assertEquals(4, output);
    }

}