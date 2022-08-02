package problemsolving.leetcode.logic.matrixCellsInDistanceOrder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixCellsInDistanceOrderTest {
  @Test
  public void testCase01() {
    int[][] output = MatrixCellsInDistanceOrder.allCellsDistOrder(1, 2, 0, 0);

    int[][] expectedOutput = new int[][] {{0,0}, {0,1}};

    assertTrue(Arrays.deepEquals(output, expectedOutput));
  }

  @Test
  public void testCase02() {
    int[][] output = MatrixCellsInDistanceOrder.allCellsDistOrder(2, 2, 0, 1);

    int[][] expectedOutput = new int[][] {{0,1},{0,0},{1,1},{1,0}};

    assertTrue(Arrays.deepEquals(output, expectedOutput));
  }

  @Test
  public void testCase03() {
    int[][] output = MatrixCellsInDistanceOrder.allCellsDistOrder(2, 3, 1, 2);

    int[][] expectedOutput = new int[][] {{1,2},{0,2},{1,1},{0,1},{1,0},{0,0}};

    assertTrue(Arrays.deepEquals(output, expectedOutput));
  }

  @Test
  public void testCase04() {
    int[][] output = MatrixCellsInDistanceOrder.allCellsDistOrder(3, 4, 0, 1);

    int[][] expectedOutput = new int[][] {{0,1},{0,0},{0,2},{1,1},{0,3},{1,0},{1,2},{2,1},{1,3},{2,0},{2,2},{2,3}};

    assertTrue(Arrays.deepEquals(output, expectedOutput));
  }
}