package problemsolving.leetcode.logic.twoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumWithMapTest {
    @Test
    public void testCase01() {
        int[] input = { 2,7,11,15};
        int target = 9;

        int[] output = new TwoSumWithMap().twoSum(input, target);

        assertEquals(2, output.length);
        assertEquals(0, output[0]);
        assertEquals(1, output[1]);
    }
}
