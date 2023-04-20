package problemsolving.leetcode.datastructures.arrays.insertInterval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertIntervalTest {
    @Test
    public void testCase01() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] output = new InsertInterval().insert(intervals, newInterval);

        assertEquals(1, output[0][0]);
        assertEquals(5, output[0][1]);

        assertEquals(6, output[1][0]);
        assertEquals(9, output[1][1]);
    }

    @Test
    public void testCase02() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {1, 10};

        int[][] output = new InsertInterval().insert(intervals, newInterval);

        assertEquals(1, output[0][0]);
        assertEquals(10, output[0][1]);
    }
}