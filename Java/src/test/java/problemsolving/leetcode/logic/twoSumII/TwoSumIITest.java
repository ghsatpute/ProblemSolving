package problemsolving.leetcode.logic.twoSumII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumIITest {
    @Test
    public void testCase01() {
        int[] array = {2,7,11,15};
        int target = 9;

        int[] output = new TwoSumII().twoSum(array, target);

        assertEquals(1, output[0]);
        assertEquals(2, output[1]);
    }
}