package problemsolving.leetcode.algorithm.combinationSumUniqueElements;

import org.junit.Test;
import problemsolving.leetcode.algorithm.combinationSum.CombinationSumProblem;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumUniqueElementsTest {
    @Test
    public void testCase01() {
        int[] inputArray = new int[] {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> result = new CombinationSumUniqueElements().combinationSum2(inputArray, target);

        assertEquals(4, result.size());
        assertEquals(Arrays.asList(1,1,6), result.get(0));
        assertEquals(Arrays.asList(1,2,5), result.get(1));
        assertEquals(Arrays.asList(1,7), result.get(2));
        assertEquals(Arrays.asList(2,6), result.get(3));
    }

    @Test
    public void testCase02() {
        int[] inputArray = new int[] {1, 1, 1, 1, 1};
        int target = 5;

        List<List<Integer>> result = new CombinationSumUniqueElements().combinationSum2(inputArray, target);

        assertEquals(1, result.size());
        assertEquals(Arrays.asList(1,1,1,1,1), result.get(0));
    }
}