package problemsolving.hackerrank.datastructures.arrays.arrayManipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManipulationTest {

    @Test
    public void testCase01() {
        int n = 5;
        int numQueries = 3;
        int[][] queries = new int[][] {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };

        long result = ArrayManipulation.arrayManipulation(n, queries);
        assertEquals(200, result);
    }

    @Test
    public void testCase02() {
        int n = 10;
        int numQueries = 3;

        int[][] queries = new int[][] {
                {1, 5, 3},  // 03 03 03 03 03  00 00 00 00 00
                {4, 8, 7},  // 03 03 03 10 10  07 07 07 00 00
                {6, 9, 1}   // 03 03 03 10 10  08 08 08 01 00
        };

        long result = ArrayManipulation.arrayManipulation(n, queries);
        assertEquals(10, result);
    }

    @Test
    public void testCase03() {
        int n = 10;
        int numQueries = 4;

        int[][] queries = new int[][] {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };

        long result = ArrayManipulation.arrayManipulation(n, queries);
        assertEquals(31, result);
    }

    @Test
    public void testCase04() {
        int n = 10;
        int numQueries = 4;

        int[][] queries = new int[][] {
                {2, 4, 1},      // 0 1 1 1 0  0 0 0 0 0
                {6, 10, 1},     // 0 1 1 1 0  1 1 1 1 1
                {3, 4, 1},      // 0 1 2 2 0  1 1 1 1 1
                {8, 10, 1},     // 0 1 2 2 0  1 1 2 2 2
                {3, 4, 1},      // 0 1 3 3 0  1 1 2 2 2
                {9, 10, 1},     // 0 1 3 3 0  1 1 2 3 3
                {10, 10, 1}     // 0 1 3 3 0  1 1 2 3 4
        };

        long result = ArrayManipulation.arrayManipulation(n, queries);
        assertEquals(4, result);
    }
}