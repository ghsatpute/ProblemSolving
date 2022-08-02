package problemsolving.leetcode.logic.matrixCellsInDistanceOrder;

import java.util.Arrays;

public class MatrixCellsInDistanceOrder {
  public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
    int[][] output = new int[rows * cols][];
    int count = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        output[count++] = new int[] { i, j};
      }
    }

    // This can be refactored using `Comparator.comparingInt` but this gives faster response times .
    Arrays.sort(output,
      (int[] arr1, int[] arr2) -> {
        return
          (Math.abs(arr1[0] - rCenter) + Math.abs(arr1[1] - cCenter))
            - (Math.abs(arr2[0] - rCenter) + Math.abs(arr2[1] - cCenter));
      }
    );

    return output;
  }
}
