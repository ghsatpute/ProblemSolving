package courses.coursera.algorithms1robertsedgewick.week1.lectures;

import courses.coursera.algorithms1robertsedgewick.week1.lectures.week1.QuickUnion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickUnionTest {
  @Test
  public void testCase01() {
    QuickUnion quickUnion = new QuickUnion(5);

    assertFalse(quickUnion.isConnected(0, 1));
    assertFalse(quickUnion.isConnected(1, 2));

    quickUnion.union(1, 2);
    assertTrue(quickUnion.isConnected(1, 2));
    assertFalse(quickUnion.isConnected(0, 1));
    assertFalse(quickUnion.isConnected(2, 3));

    quickUnion.union(3, 4);
    assertTrue(quickUnion.isConnected(3, 4));
    assertFalse(quickUnion.isConnected(2, 3));
    assertFalse(quickUnion.isConnected(1, 3));

    quickUnion.union(2, 4);
    assertTrue(quickUnion.isConnected(2, 4));
    assertTrue(quickUnion.isConnected(1, 4));
    assertTrue(quickUnion.isConnected(1, 3));
    assertTrue(quickUnion.isConnected(2, 3));
    assertFalse(quickUnion.isConnected(0, 3));
  }

}