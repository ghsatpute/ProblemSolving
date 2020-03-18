package algorithms.backtracking;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumOfSubsetTest {

    @Test
    public void testSumOfSubset_testCase01() {
        int[] elements = new int[] {5, 10, 12, 13, 15, 18};
        int sum = 30;

        List<List<Integer>> output = SumOfSubset.solution(elements, sum);

        assertEquals(3, output.size());
        // {{5, 10, 15}, {5, 12, 13}, {12, 18}}
    }


}