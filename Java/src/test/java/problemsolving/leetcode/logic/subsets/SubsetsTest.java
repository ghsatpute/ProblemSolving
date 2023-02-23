package problemsolving.leetcode.logic.subsets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class SubsetsTest {
    @Test
    public void testCase01() {
        int[] input = new int[0];

        List<List<Integer>> subsets = new Subsets().subsets(input);

        assertEquals(0, subsets.size());
    }

    @Test
    public void testCase02() {
        int[] input = new int[] {1};

        List<List<Integer>> subsets = new Subsets().subsets(input);

        System.out.println(subsets);
    }

    @Test
    public void testCase03() {
        int[] input = new int[] {1, 2};

        List<List<Integer>> subsets = new Subsets().subsets(input);

        System.out.println(subsets);
    }

    @Test
    public void testCase04() {
        int[] input = new int[] {1, 2, 3};

        List<List<Integer>> subsets = new Subsets().subsets(input);

        System.out.println(subsets);
    }
}