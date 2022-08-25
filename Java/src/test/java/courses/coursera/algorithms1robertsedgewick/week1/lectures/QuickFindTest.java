package courses.coursera.algorithms1robertsedgewick.week1.lectures;

import courses.coursera.algorithms1robertsedgewick.week1.lectures.week1.QuickFind;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickFindTest {

  @Test
  public void testCase01() {
    QuickFind quickFind = new QuickFind(5);

    assertFalse(quickFind.isConnected(0, 1));
    assertFalse(quickFind.isConnected(1, 2));

    quickFind.union(1, 2);
    assertTrue(quickFind.isConnected(1, 2));
    assertFalse(quickFind.isConnected(0, 1));
    assertFalse(quickFind.isConnected(2, 3));

    quickFind.union(3, 4);
    assertTrue(quickFind.isConnected(3, 4));
    assertFalse(quickFind.isConnected(2, 3));
    assertFalse(quickFind.isConnected(1, 3));

    quickFind.union(2, 4);
    assertTrue(quickFind.isConnected(2, 4));
    assertTrue(quickFind.isConnected(1, 4));
    assertTrue(quickFind.isConnected(1, 3));
    assertTrue(quickFind.isConnected(2, 3));
    assertFalse(quickFind.isConnected(0, 3));
  }

}