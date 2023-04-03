package problemsolving.leetcode.logic.threeSum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ThreeSumTest {
    @Test
    public void testCase01() {
        int[] input = {0, 0, 0, 0};

        List<List<Integer>> output = new ThreeSum().threeSum(input);

        assertEquals(1, output.size());
        assertEquals(3, output.get(0).size());
        assertEquals(0, output.get(0).get(0));
        assertEquals(0, output.get(0).get(1));
        assertEquals(0, output.get(0).get(2));
    }

    @Test
    public void testCase02() {
        int[] input = {0, 1, 1};

        List<List<Integer>> output = new ThreeSum().threeSum(input);

        assertEquals(0, output.size());
    }

    @Test
    public void testCase03() {
        int[] input = {0, 0, 0};

        List<List<Integer>> output = new ThreeSum().threeSum(input);

        assertEquals(1, output.size());
        assertEquals(3, output.get(0).size());
        assertEquals(0, output.get(0).get(0));
        assertEquals(0, output.get(0).get(1));
        assertEquals(0, output.get(0).get(2));
    }

    @Test
    public void testCase04() {
        int[] input = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> output = new ThreeSum().threeSum(input);

        assertEquals(2, output.size());

        assertEquals(3, output.get(0).size());
        assertEquals(-1, output.get(0).get(0));
        assertEquals(2, output.get(0).get(1));
        assertEquals(-1, output.get(0).get(2));

        assertEquals(3, output.get(1).size());
        assertEquals(0, output.get(1).get(0));
        assertEquals(1, output.get(1).get(1));
        assertEquals(-1, output.get(1).get(2));
    }

    @Test
    public void testCase05() {
        int[] input = {-2, -2, 0, 0, 2, 2};

        List<List<Integer>> output = new ThreeSum().threeSum(input);

        assertEquals(1, output.size());

        assertEquals(3, output.get(0).size());
        assertEquals(0, output.get(0).get(0));
        assertEquals(2, output.get(0).get(1));
        assertEquals(-2, output.get(0).get(2));
    }
}