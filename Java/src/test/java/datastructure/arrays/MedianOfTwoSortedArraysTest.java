package datastructure.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void testCase01_equalArrayLengthAndMixedElementsAndTotalSizeEven() {
        int[] array1 = new int[] {1, 4, 5, 7, 8};
        int[] array2 = new int[] {2, 3, 7, 9, 10};
        // 1 2 3 4 5 7 7 8 9 10

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase02_secondArrayBiggerAndMixedElementsAndTotalSizeEven() {
        int[] array1 = new int[] {1, 4, 5, 7};
        int[] array2 = new int[] {2, 3, 7, 8, 9, 10};
        // 1 2 3 4 5 7 7 8 9 10

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase03_firstArrayBiggerAndMixedElementsAndTotalSizeEven() {
        int[] array1 = new int[] {2, 3, 7, 8, 9, 10};
        int[] array2 = new int[] {1, 4, 5, 7};
        // 1 2 3 4 5 7 7 8 9 10

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase04_secondArrayBiggerAndMixedElementsAndTotalSizeOdd() {
        int[] array1 = new int[] {2, 3, 7, 8, 9, 10};
        int[] array2 = new int[] {1, 4, 5, 6, 7};
        // 1 2 3 4 5  6  7 7 8 9 10

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase05_secondArrayElementsBiggerThanFirstArrayAndTotalSizeEven() {
        int[] array1 = new int[] {1, 2, 3, 4, 5};
        int[] array2 = new int[] {7, 8, 9, 10, 11};
        // 1 2 3 4 5   7 8 9 10  11

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase06_secondArrayElementsBiggerThanFirstArrayAndTotalSizeOdd() {
        int[] array1 = new int[] {1, 2, 3, 4, 5, 6};
        int[] array2 = new int[] {7, 8, 9, 10, 11};
        // 1 2 3 4 5   7 8 9 10  11

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase07_firstArrayElementsBiggerThanSecondArrayAndTotalSizeEven() {
        int[] array1 = new int[] {7, 8, 9, 10, 11};
        int[] array2 = new int[] {1, 2, 3, 4, 5};

        // 1 2 3 4 5   7 8 9 10  11

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }

    @Test
    public void testCase08_firstArrayElementsBiggerThanSecondArrayAndTotalSizeOdd() {
        int[] array1 = new int[] {7, 8, 9, 10, 11};
        int[] array2 = new int[] {1, 2, 3, 4, 5, 6};
        // 1 2 3 4 5   7 8 9 10  11

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.solution(array1, array2);

        assertEquals(6.0, result, 0.00000001);
    }
}