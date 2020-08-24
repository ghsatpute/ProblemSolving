package problemsolving.leetcode.algorithm.combinationSum;

import org.junit.Test;
import problemsolving.leetcode.algorithm.combinationSum.CombinationSumProblem;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumProblemTest {
    @Test
    public void testCase01() {
        int[] inputArray = new int[] {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = new CombinationSumProblem().combinationSum(inputArray, target);

        assertEquals(2, result.size());
        assertEquals(Arrays.asList(2, 2, 3), result.get(0));
        assertEquals(Arrays.asList(7), result.get(1));
    }

    @Test
    public void testCase02() {
        int[] inputArray = new int[] {2,3,5};
        int target = 8;

        List<List<Integer>> result = new CombinationSumProblem().combinationSum(inputArray, target);

        assertEquals(3, result.size());
        assertEquals(Arrays.asList(2, 2, 2, 2), result.get(0));
        assertEquals(Arrays.asList(2, 3, 3), result.get(1));
        assertEquals(Arrays.asList(3, 5), result.get(2));
    }

    @Test
    public void testCase03() {
        int[] inputArray = new int[] {8, 7, 4, 3};
        int target = 11;

        List<List<Integer>> result = new CombinationSumProblem().combinationSum(inputArray, target);

        assertEquals(3, result.size());
        assertEquals(Arrays.asList(8, 3), result.get(0));
        assertEquals(Arrays.asList(7, 4), result.get(1));
        assertEquals(Arrays.asList(4, 4, 3), result.get(2));
    }
}