package problemsolving.problems.dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayProblemTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {-2, 3, 2, -1};

        int output = MaximumSubarrayProblem.solve(input);

        assertEquals(5, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1, 2, 3, 4};

        int output = MaximumSubarrayProblem.solve(input);

        assertEquals(10, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {-1, -2, -3, -4};

        int output = MaximumSubarrayProblem.solve(input);

        assertEquals(-1, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {-1, 2, -3, -4};

        int output = MaximumSubarrayProblem.solve(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[] {-1, 2, -3, 4};

        int output = MaximumSubarrayProblem.solve(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase06() {
        int[] input = new int[] {-1, 2, 3, 4};

        int output = MaximumSubarrayProblem.solve(input);

        assertEquals(9, output);
    }
}