package problemsolving.problems.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    @Test
    public void testCase01() {
        int mat[][] = {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        int output = NumberOfIslands.solve(mat);

        assertEquals(5, output);
    }
}