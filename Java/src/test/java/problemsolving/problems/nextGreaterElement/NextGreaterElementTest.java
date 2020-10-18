package problemsolving.problems.nextGreaterElement;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElementTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {4, 5, 2, 25};

        int[] output = NextGreaterElement.solve(input);

        assertArrayEquals(new int[] {5, 25, 25, -1}, output);
    }

    @Test
    public void testCase01_increasingNumbers() {
        int[] input = new int[] {1, 2, 3, 4, 5};

        int[] output = NextGreaterElement.solve(input);

        assertArrayEquals(new int[] {2, 3, 4, 5, -1}, output);
    }

    @Test
    public void testCase01_decreasingNumbers() {
        int[] input = new int[] {5, 4, 3, 2, 1};

        int[] output = NextGreaterElement.solve(input);

        assertArrayEquals(new int[] {-1, -1, -1, -1, -1}, output);
    }

    @Test
    public void testCase01_singleElement() {
        int[] input = new int[] {5};

        int[] output = NextGreaterElement.solve(input);

        assertArrayEquals(new int[] {-1}, output);
    }

    @Test
    public void testCase01_duplicaateElement() {
        int[] input = new int[] {5, 5};

        int[] output = NextGreaterElement.solve(input);

        assertArrayEquals(new int[] {-1, -1}, output);
    }
}