package problemsolving.leetcode.datastructures.arrays.searchInRotatedSortedArray;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int pivot = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                pivot = i;
                break;
            }
        }
        if (nums[0] <= target && target <= nums[pivot]) {
            return binarySearch(nums, 0, pivot, target);
        } else {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
    }

    private int binarySearch(int[] array, int start, int end, int target) {
        if (end < start) {
            return -1;
        }
        if (end == start) {
            if (array[start] == target) {
                return start;
            } else {
                return -1;
            }
        }
        int mid = (start + end) / 2;
        if (target <= array[mid]) {
            return binarySearch(array, start, mid, target);
        } else {
            return binarySearch(array, mid + 1, end, target);
        }
    }
}
