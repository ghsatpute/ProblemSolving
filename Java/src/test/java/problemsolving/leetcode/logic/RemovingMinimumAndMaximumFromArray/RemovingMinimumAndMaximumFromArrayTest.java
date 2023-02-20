package problemsolving.leetcode.logic.RemovingMinimumAndMaximumFromArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemovingMinimumAndMaximumFromArrayTest {

    @Test
    public void testCase01() {
        int[] input = new int[]{1};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase02() {
        int[] input = new int[]{1, 2};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase03() {
        int[] input = new int[]{1, 2, 3};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase04() {
        int[] input = new int[]{3, 2, 1};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase05() {
        int[] input = new int[]{3, 2, 5, 4, 1};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(3, output);
    }

    @Test
    public void testCase06_leetCode() {
        int[] input = new int[]{2, 10, 7, 5, 4, 1, 8, 6};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(5, output);
    }

    @Test
    public void testCase07_leetCode() {
        int[] input = new int[]{0, -4, 19, 1, 8, -2, -3, 5};

        int output = new RemovingMinimumAndMaximumFromArray().minimumDeletions(input);

        assertEquals(3, output);
    }
}