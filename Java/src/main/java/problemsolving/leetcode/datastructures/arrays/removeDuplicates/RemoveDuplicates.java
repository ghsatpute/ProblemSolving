package problemsolving.leetcode.datastructures.arrays.removeDuplicates;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int current = 0;
        while (i < nums.length) {
            int currentElement = nums[i];
            while (i < nums.length && currentElement == nums[i]) {
                i++;
            }
            if (i < nums.length)
                nums[++current] = nums[i];
        }
        return current + 1;
    }
}
