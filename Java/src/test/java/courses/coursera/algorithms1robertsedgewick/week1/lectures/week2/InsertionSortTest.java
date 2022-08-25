package courses.coursera.algorithms1robertsedgewick.week1.lectures.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

  @Test
  public void testCase01() {
    int[] array = new int[] { 5, 1, 4, 3, 2};

    InsertionSort.sort(array);

    assertEquals(array[0], 1);
    assertEquals(array[1], 2);
    assertEquals(array[2], 3);
    assertEquals(array[3], 4);
    assertEquals(array[4], 5);
  }
}