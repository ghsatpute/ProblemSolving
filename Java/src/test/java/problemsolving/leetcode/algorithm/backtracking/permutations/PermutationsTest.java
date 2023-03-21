package problemsolving.leetcode.algorithm.backtracking.permutations;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationsTest {
    @Test
    public void testCase01() {
        int[] input = {1};

        List<List<Integer>> permute = new Permutations().permute(input);

        Assertions.assertEquals(1, permute.size());
        Assertions.assertEquals(1, permute.get(0).get(0));
    }

    @Test
    public void testCase02() {
        int[] input = {1, 2};

        List<List<Integer>> permute = new Permutations().permute(input);

        Assertions.assertEquals(2, permute.size());

        Assertions.assertEquals(2, permute.get(0).size());
        Assertions.assertEquals(1, permute.get(0).get(0));
        Assertions.assertEquals(2, permute.get(0).get(1));

        Assertions.assertEquals(2, permute.get(1).size());
        Assertions.assertEquals(2, permute.get(1).get(0));
        Assertions.assertEquals(1, permute.get(1).get(1));
    }
}