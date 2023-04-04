package problemsolving.leetcode.logic.findMinimumInRotatedSortedArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void testCase01() {
        int[] input = {5};

        int output = new FindMinimumInRotatedSortedArray().findMin(input);

        assertEquals(5, output);
    }

    @Test
    public void testCase02() {
        int[] input = {5, 1, 2, 3, 4};

        int output = new FindMinimumInRotatedSortedArray().findMin(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        int[] input = {4, 5, 1, 2, 3};

        int output = new FindMinimumInRotatedSortedArray().findMin(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase04() {
        int[] input = {3, 4, 5, 1, 2};

        int output = new FindMinimumInRotatedSortedArray().findMin(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase05() {
        int[] input = {2, 3, 4, 5, 1};

        int output = new FindMinimumInRotatedSortedArray().findMin(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase06() {
        int[] input = {1, 2, 3, 4, 5};

        int output = new FindMinimumInRotatedSortedArray().findMin(input);

        assertEquals(1, output);
    }
}