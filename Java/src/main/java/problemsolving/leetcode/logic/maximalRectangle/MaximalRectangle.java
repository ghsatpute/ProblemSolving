package problemsolving.leetcode.logic.maximalRectangle;

import problemsolving.leetcode.logic.largestAreaInHistogram.LargestAreaInHistogram;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int[][] input = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                input[i][j] = Character.getNumericValue(matrix[i][j]);
            }
        }

        LargestAreaInHistogram largestAreaInHistogram = new LargestAreaInHistogram();
        int maxArea = largestAreaInHistogram.largestRectangleArea(input[0]);

        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] != 0) {
                    input[i][j] = input[i-1][j] + input[i][j];
                }
            }
            int maxAreaForCurrentRow = largestAreaInHistogram.largestRectangleArea(input[i]);
            if (maxAreaForCurrentRow > maxArea) {
                maxArea = maxAreaForCurrentRow;
            }
        }

        return maxArea;
    }
}
