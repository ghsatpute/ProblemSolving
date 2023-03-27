package problemsolving.leetcode.logic.containsDuplicateII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {
    @Test
    public void testCase01() {
        int[] input = {1, 2, 3, 1};
        int k = 3;

        boolean output = new ContainsDuplicateII().containsNearbyDuplicate(input, k);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        int[] input = {1, 0, 1, 1};
        int k = 1;

        boolean output = new ContainsDuplicateII().containsNearbyDuplicate(input, k);

        assertTrue(output);
    }

    @Test
    public void testCase03() {
        int[] input = {1, 2, 3, 1, 2, 3};
        int k = 2;

        boolean output = new ContainsDuplicateII().containsNearbyDuplicate(input, k);

        assertFalse(output);
    }

}