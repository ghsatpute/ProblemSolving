package problemsolving.leetcode.logic.sortColors;

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }

        int leftPointer = 0;
        int current = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer && current <= rightPointer ) {
            if (nums[current] == 0) {
                nums[current] = nums[leftPointer];
                nums[leftPointer] = 0;

                leftPointer++;
                current++;
            } else if (nums[current] == 2) {
                nums[current] = nums[rightPointer];
                nums[rightPointer] = 2;

                rightPointer--;
            } else {
                current++;
            }
        }
    }
}
