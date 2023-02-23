package problemsolving.leetcode.logic.combinations;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CombinationsTest {

    @Test
    public void testCase01() {
        List<List<Integer>> output = new Combinations().combine(1, 1);

        assertEquals(1, output.size());
        assertEquals(1, output.get(0).size());
        assertEquals(1, output.get(0).get(0));
    }

    @Test
    public void testCase02() {
        List<List<Integer>> output = new Combinations().combine(2, 1);

        assertEquals(2, output.size());
        assertEquals(1, output.get(0).size());

        assertEquals(1, output.get(0).get(0));

        assertEquals(2, output.get(1).get(0));
    }

    @Test
    public void testCase03() {
        List<List<Integer>> output = new Combinations().combine(2, 2);

        System.out.println(output);

        assertEquals(1, output.size());
        assertEquals(2, output.get(0).size());

        assertEquals(1, output.get(0).get(0));
        assertEquals(2, output.get(0).get(1));
    }

    @Test
    public void testCase04() {
        List<List<Integer>> output = new Combinations().combine(3, 2);

        System.out.println(output);

        assertEquals(3, output.size());

        assertEquals(2, output.get(0).size());

        assertEquals(1, output.get(0).get(0));
        assertEquals(2, output.get(0).get(1));

        assertEquals(2, output.get(1).size());

        assertEquals(1, output.get(1).get(0));
        assertEquals(3, output.get(1).get(1));

        assertEquals(2, output.get(2).size());

        assertEquals(2, output.get(2).get(0));
        assertEquals(3, output.get(2).get(1));
    }
}