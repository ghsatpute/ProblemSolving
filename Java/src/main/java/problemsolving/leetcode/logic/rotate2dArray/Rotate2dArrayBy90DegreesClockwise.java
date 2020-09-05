package problemsolving.leetcode.logic.rotate2dArray;

public class Rotate2dArrayBy90DegreesClockwise {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length == 1) {
            return;
        }

        flipHorizontal(matrix);
        flipDiagonal(matrix);
    }

    public void flipHorizontal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[0].length - 1;
            while (left < right) {
                int temp = matrix[i][left] ;
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public void flipDiagonal(int[][] matrix) {
        int n = matrix.length - 1; // Zero based
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < (n - x); y++) {
                int x2 = n - y;
                int y2 = n - x;

                int temp = matrix[x][y];
                matrix[x][y] = matrix[x2][y2];
                matrix[x2][y2] = temp;
            }
        }
    }
}
