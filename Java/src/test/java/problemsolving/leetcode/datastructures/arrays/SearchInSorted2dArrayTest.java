package problemsolving.leetcode.datastructures.arrays;

import org.junit.Test;
import problemsolving.leetcode.datastructures.arrays.searchInSorted2dArray.SearchInSorted2dArray;

import static org.junit.Assert.*;

public class SearchInSorted2dArrayTest {

    @Test
    public void twoByOneMatrix_targetInSecondRow() {
        // LeetCode test
        int[][] array = new int[][]{
                {1},
                {3}
        };
        int target = 3;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void twoByOneMatrix_targetInFirstRow() {
        int[][] array = new int[][]{
                {1},
                {3}
        };
        int target = 1;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void oneByOneMatrix_elementPresent() {
        int[][] array = new int[][]{
                {1}
        };
        int target = 1;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void oneByOneMatrix_elementNotPresent_largestElementLessThanTarget() {
        int[][] array = new int[][]{
                {1}
        };
        int target = 3;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertFalse(output);
    }

    @Test
    public void oneByOneMatrix_elementNotPresent_smallestNumberGreaterThanTarget() {
        int[][] array = new int[][]{
                {1}
        };
        int target = -3;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertFalse(output);
    }


    @Test
    public void evenRowsEvenColumns_targetInFirstRow() {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 3;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void oddRowsEvenColumns_targetInFirstRow() {
        int[][] array = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        int target = 3;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void oddRowsOddColumns_targetInFirstRow() {
        int[][] array = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int target = 3;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void evenRowsEvenColumns_targetInSecondRow() {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 7;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void oddRowsEvenColumns_targetInSecondRow() {
        int[][] array = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        int target = 8;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }

    @Test
    public void oddRowsOddColumns_targetInSecondRow() {
        int[][] array = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int target = 6;

        boolean output = new SearchInSorted2dArray().searchMatrix(array, target);

        assertTrue(output);
    }
}