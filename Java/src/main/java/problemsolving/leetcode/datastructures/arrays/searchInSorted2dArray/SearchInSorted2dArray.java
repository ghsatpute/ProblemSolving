package problemsolving.leetcode.datastructures.arrays.searchInSorted2dArray;

public class SearchInSorted2dArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0][0] > target) return false;
        if (matrix[matrix.length - 1][matrix[0].length - 1] < target) return false;

        int row = findRow(matrix, target);

        return binarySearch(matrix[row], target);
    }

    private boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    private int findRow(int[][] matrix, int target) {
        int topLeft = 0;
        int bottomLeft = matrix.length - 1;

        while (topLeft < bottomLeft) {
            if (topLeft == bottomLeft - 1) {
                if (matrix[bottomLeft][0] <= target) {
                    topLeft = bottomLeft;
                }
                break;
            }

            int midIndex =  (topLeft + bottomLeft) / 2;

            if (matrix[midIndex][0] <= target) {
                topLeft = midIndex;
            } else if (matrix[midIndex][0] > target) {
                bottomLeft = midIndex;
            }
        }
        return topLeft;
    }
}
