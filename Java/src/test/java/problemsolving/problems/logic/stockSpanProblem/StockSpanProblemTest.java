package problemsolving.problems.logic.stockSpanProblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockSpanProblemTest {
    @Test
    public void testCase01() {
        int[] input = new int[] {100, 80, 60, 70, 60, 75, 85};

        int[] output = StockSpanProblem.solve(input);

        assertArrayEquals(new int[] {1, 1, 1, 2, 1, 4, 6}, output);
    }
}