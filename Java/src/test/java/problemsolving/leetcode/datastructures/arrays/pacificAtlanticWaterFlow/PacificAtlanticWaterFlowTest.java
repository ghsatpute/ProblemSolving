package problemsolving.leetcode.datastructures.arrays.pacificAtlanticWaterFlow;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PacificAtlanticWaterFlowTest {
    @Test
    public void testCase01() {
        int[][] input = {{1}};

        List<List<Integer>> output = new PacificAtlanticWaterFlow().pacificAtlantic(input);

        assertEquals(1, output.size());
    }

    @Test
    public void testCase02() {
        int[][] input = {{1, 2, 3}};

        List<List<Integer>> output = new PacificAtlanticWaterFlow().pacificAtlantic(input);

        assertEquals(3, output.size());

        assertEquals(0, output.get(0).get(0));
        assertEquals(0, output.get(0).get(1));

        assertEquals(0, output.get(1).get(0));
        assertEquals(1, output.get(1).get(1));

        assertEquals(0, output.get(2).get(0));
        assertEquals(2, output.get(2).get(1));
    }

    @Test
    public void testCase03() {
        int[][] input = {{1, 1, 1}, {1, 1, 1}};

        List<List<Integer>> output = new PacificAtlanticWaterFlow().pacificAtlantic(input);

        assertEquals(6, output.size());

        assertEquals(0, output.get(0).get(0));
        assertEquals(0, output.get(0).get(1));

        assertEquals(0, output.get(1).get(0));
        assertEquals(1, output.get(1).get(1));

        assertEquals(0, output.get(2).get(0));
        assertEquals(2, output.get(2).get(1));

        assertEquals(1, output.get(3).get(0));
        assertEquals(0, output.get(3).get(1));

        assertEquals(1, output.get(4).get(0));
        assertEquals(1, output.get(4).get(1));

        assertEquals(1, output.get(5).get(0));
        assertEquals(2, output.get(5).get(1));
    }
}