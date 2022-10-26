package problemsolving.leetcode.logic.maximalRectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalRectangleTest {

    @Test
    public void testCase01() {
        char[][] input = new char[][]{{}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        char[][] input = new char[][]{{'1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase03() {
        char[][] input = new char[][]{{'1', '0'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase04() {
        char[][] input = new char[][]{{'0', '1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase05() {
        char[][] input = new char[][]{{'1', '1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase06() {
        char[][] input = new char[][]{{'1', '0'}, {'0', '1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase07() {
        char[][] input = new char[][]{{'1', '0'}, {'1', '1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase08() {
        char[][] input = new char[][]{{'1', '1'}, {'0', '1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase09() {
        char[][] input = new char[][]{{'1', '1'}, {'1', '1'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase10() {
        char[][] input = new char[][] {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};

        int output = new MaximalRectangle().maximalRectangle(input);

        assertEquals(6, output);
    }
}