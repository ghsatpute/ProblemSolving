package problemsolving.leetcode.logic.kthLargestElementInAnArray;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int start, int end, int k) {
        int partition = partition(nums, start, end);
        if (k < partition) {
            return quickSelect(nums, start, partition - 1, k);
        } else if (k > partition) {
            return quickSelect(nums, partition + 1, end, k);
        } else {
            return nums[partition];
        }
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int pointer = start;
        for (int i = start; i < end; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, pointer);
                pointer++;
            }
        }

        swap(nums, pointer, end);
        return pointer;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
