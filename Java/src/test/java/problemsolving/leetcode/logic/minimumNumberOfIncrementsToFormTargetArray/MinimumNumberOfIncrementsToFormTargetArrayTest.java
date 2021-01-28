package problemsolving.leetcode.logic.minimumNumberOfIncrementsToFormTargetArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNumberOfIncrementsToFormTargetArrayTest {
    @Test
    public void testCase01() {
        int[] array = new int[] {1, 2, 3, 2, 2, 1};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int[] array = new int[] {3, 1, 1, 2};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[] array = new int[] {3, 1, 1, 4};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(6, output);
    }

    @Test
    public void testCase04() {
        int[] array = new int[] {5, 4, 3, 1, 1};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(5, output);
    }

    @Test
    public void testCase05() {
        int[] array = new int[] {1, 2, 3, 4, 5};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(5, output);
    }

    @Test
    public void testCase06() {
        int[] array = new int[] {1, 2, 3, 4, 5, 1};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(5, output);
    }

    @Test
    public void testCase07() {
        int[] array = new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(5, output);
    }

    @Test
    public void testCase08() {
        int[] array = new int[] {};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(0, output);
    }

    @Test
    public void testCase09() {
        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(null);

        assertEquals(0, output);
    }

    @Test
    public void testCase10() {
        int[] array = new int[] {11};

        int output = new MinimumNumberOfIncrementsToFormTargetArray().minNumberOperations(array);

        assertEquals(11, output);
    }
}
