package problemsolving.leetcode.logic.trappingRainWater;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {
    @Test
    public void testCase01() {
        int[] height = new int[] {0, 1, 2, 3, 0, 3};

        int output = new TrappingRainWater().trap(height);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        int[] height = new int[] {3, 2, 1, 0, 1, 2, 3};

        int output = new TrappingRainWater().trap(height);

        assertEquals(9, output);
    }
}