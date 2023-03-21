package problemsolving.leetcode.algorithm.backtracking.permutationsII;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PermutationsIITest {
    @Test
    public void testCase01() {
        int[] input = {1, 1};

        List<List<Integer>> output = new PermutationsII().permuteUnique(input);

        assertEquals(1, output.size());

        assertEquals(2, output.get(0).size());
        assertEquals(1, output.get(0).get(0));
        assertEquals(1, output.get(0).get(1));
    }

    @Test
    public void testCase02() {
        int[] input = {1, 1, 2};

        List<List<Integer>> output = new PermutationsII().permuteUnique(input);

        assertEquals(3, output.size());

        assertEquals(3, output.get(0).size());
        assertEquals(1, output.get(0).get(0));
        assertEquals(1, output.get(0).get(1));
        assertEquals(2, output.get(0).get(2));

        assertEquals(3, output.get(1).size());
        assertEquals(1, output.get(1).get(0));
        assertEquals(2, output.get(1).get(1));
        assertEquals(1, output.get(1).get(2));

        assertEquals(3, output.get(2).size());
        assertEquals(2, output.get(2).get(0));
        assertEquals(1, output.get(2).get(1));
        assertEquals(1, output.get(2).get(2));
    }

    @Test
    public void testCase03() {
        int[] input = {1, 1, 1};

        List<List<Integer>> output = new PermutationsII().permuteUnique(input);

        assertEquals(1, output.size());

        assertEquals(3, output.get(0).size());
        assertEquals(1, output.get(0).get(0));
        assertEquals(1, output.get(0).get(1));
        assertEquals(1, output.get(0).get(2));
    }
}