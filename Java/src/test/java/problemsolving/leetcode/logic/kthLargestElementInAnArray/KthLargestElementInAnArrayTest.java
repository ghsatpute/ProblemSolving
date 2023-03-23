package problemsolving.leetcode.logic.kthLargestElementInAnArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLargestElementInAnArrayTest {
    @Test
    public void testCase01() {
        int[] nums = {3, 2, 1, 5, 4};

        int output = new KthLargestElementInAnArray().findKthLargest(nums, 1);

        assertEquals(5, output);
    }

    @Test
    public void testCase02() {
        int[] nums = {3, 2, 1, 5, 4};

        int output = new KthLargestElementInAnArray().findKthLargest(nums, 2);

        assertEquals(4, output);
    }

    @Test
    public void testCase03() {
        int[] nums = {3, 2, 1, 5, 4};

        int output = new KthLargestElementInAnArray().findKthLargest(nums, 3);

        assertEquals(3, output);
    }

    @Test
    public void testCase04() {
        int[] nums = {3, 2, 1, 5, 4};

        int output = new KthLargestElementInAnArray().findKthLargest(nums, 4);

        assertEquals(2, output);
    }

    @Test
    public void testCase05() {
        int[] nums = {3, 2, 1, 5, 4};

        int output = new KthLargestElementInAnArray().findKthLargest(nums, 5);

        assertEquals(1, output);
    }
}