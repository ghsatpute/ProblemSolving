package problemsolving.leetcode.datastructures.arrays.removeElement;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int current = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                i++;
                continue;
            }
            nums[current++] = nums[i++];
        }
        return current;
    }
}
