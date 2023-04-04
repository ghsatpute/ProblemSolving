package problemsolving.leetcode.logic.findMinimumInRotatedSortedArray;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        // If array is not rotated or rotated in multiples of array length, then return first element
        if (nums[start] < nums[end]) {
            return nums[0];
        }

        // [5, 1, 2, 3, 4]
        // [4, 5, 1, 2, 3]
        // [3, 4, 5, 1, 2]
        // [2, 3, 4, 5, 1]
        while (true) {
            int mid = (start + end) / 2;
            if (mid < nums.length - 1 && nums[mid + 1] < nums[mid]) {
                return nums[mid + 1];
            }

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
