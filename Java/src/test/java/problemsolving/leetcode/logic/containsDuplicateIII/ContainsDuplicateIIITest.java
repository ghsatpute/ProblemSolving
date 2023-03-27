package problemsolving.leetcode.logic.containsDuplicateIII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateIIITest {
    @Test
    public void testCase01_leetCode() {
        int[] input = {1, 2, 3, 1};
        int indexDiff = 3;
        int valueDiff = 0;

        boolean output = new ContainsDuplicateIII().containsNearbyAlmostDuplicate(input, indexDiff, valueDiff);

        assertTrue(output);
    }

    @Test
    public void testCase02_leetCode() {
        int[] input = {1, 5, 9, 1, 5, 9};
        int indexDiff = 2;
        int valueDiff = 3;

        boolean output = new ContainsDuplicateIII().containsNearbyAlmostDuplicate(input, indexDiff, valueDiff);

        assertFalse(output);
    }

    @Test
    public void testCase03_leetCode() {
        int[] input = {1, 2, 2, 3, 4, 5};
        int indexDiff = 3;
        int valueDiff = 0;

        boolean output = new ContainsDuplicateIII().containsNearbyAlmostDuplicate(input, indexDiff, valueDiff);

        assertTrue(output);
    }
}