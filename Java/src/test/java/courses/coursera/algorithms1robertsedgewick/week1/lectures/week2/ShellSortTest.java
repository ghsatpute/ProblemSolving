package courses.coursera.algorithms1robertsedgewick.week1.lectures.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {
  @Test
  public void testCase01() {
    int[] array = new int[] { 5, 1, 4, 3, 2};

    ShellSort.sort(array);

    assertEquals(array[0], 1);
    assertEquals(array[1], 2);
    assertEquals(array[2], 3);
    assertEquals(array[3], 4);
    assertEquals(array[4], 5);
  }

  @Test
  public void testCase02() {
    int[] array = new int[] {
      15, 11, 14, 13, 12,
      20, 19, 16, 18, 17,
      5, 1, 4, 3, 2,
      10, 9, 6, 7, 8
    };

    ShellSort.sort(array);

    assertEquals(array[0], 1);
    assertEquals(array[1], 2);
    assertEquals(array[2], 3);
    assertEquals(array[3], 4);
    assertEquals(array[4], 5);
    assertEquals(array[5], 6);
    assertEquals(array[6], 7);
    assertEquals(array[7], 8);
    assertEquals(array[8], 9);
    assertEquals(array[9], 10);
    assertEquals(array[10], 11);
    assertEquals(array[11], 12);
    assertEquals(array[12], 13);
    assertEquals(array[13], 14);
    assertEquals(array[14], 15);
    assertEquals(array[15], 16);
    assertEquals(array[16], 17);
    assertEquals(array[17], 18);
    assertEquals(array[18], 19);
    assertEquals(array[19], 20);
  }
}