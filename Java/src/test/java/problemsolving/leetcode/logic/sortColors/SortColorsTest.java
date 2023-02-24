package problemsolving.leetcode.logic.sortColors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortColorsTest {
    @Test
    public void testCase01() {
        int[] input = {};

        new SortColors().sortColors(input);

        assertEquals(0, input.length);
    }

    @Test
    public void testCase02() {
        int[] input = {1};

        new SortColors().sortColors(input);

        assertEquals(1, input.length);
        assertEquals(1, input[0]);
    }

    @Test
    public void testCase03() {
        int[] input = {0, 1};

        new SortColors().sortColors(input);

        assertEquals(2, input.length);
        assertEquals(0, input[0]);
        assertEquals(1, input[1]);
    }

    @Test
    public void testCase04() {
        int[] input = {1, 0};

        new SortColors().sortColors(input);

        assertEquals(2, input.length);
        assertEquals(0, input[0]);
        assertEquals(1, input[1]);
    }

    @Test
    public void testCase05() {
        int[] input = {1, 1, 1};

        new SortColors().sortColors(input);

        assertEquals(3, input.length);
        assertEquals(1, input[0]);
        assertEquals(1, input[1]);
        assertEquals(1, input[2]);
    }

    @Test
    public void testCase06() {
        int[] input = {2, 1, 2};

        new SortColors().sortColors(input);

        assertEquals(3, input.length);
        assertEquals(1, input[0]);
        assertEquals(2, input[1]);
        assertEquals(2, input[2]);
    }

    @Test
    public void testCase07() {
        int[] input = {2, 1, 0};

        new SortColors().sortColors(input);

        assertEquals(3, input.length);
        assertEquals(0, input[0]);
        assertEquals(1, input[1]);
        assertEquals(2, input[2]);
    }

    @Test
    public void testCase08() {
        int[] input = {2, 1, 2, 2, 1, 0};

        new SortColors().sortColors(input);

        assertEquals(6, input.length);
        assertEquals(0, input[0]);
        assertEquals(1, input[1]);
        assertEquals(1, input[2]);
        assertEquals(2, input[3]);
        assertEquals(2, input[4]);
        assertEquals(2, input[5]);
    }
}