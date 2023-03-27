package problemsolving.leetcode.logic.containsDuplicate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
    @Test
    public void testCase01() {
        int[] input = {1, 2, 3, 1};

        boolean output = new ContainsDuplicate().containsDuplicate(input);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        int[] input = {1, 2, 3, 4};

        boolean output = new ContainsDuplicate().containsDuplicate(input);

        assertFalse(output);
    }

    @Test
    public void testCase03() {
        int[] input = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean output = new ContainsDuplicate().containsDuplicate(input);

        assertTrue(output);
    }
}