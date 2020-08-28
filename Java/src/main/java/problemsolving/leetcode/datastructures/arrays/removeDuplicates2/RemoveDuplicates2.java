package problemsolving.leetcode.datastructures.arrays.removeDuplicates2;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int trail = 0;
        for (int i = 0; i < nums.length;) {
            int num = nums[i];
            nums[trail++] = nums[i++];

            if (i < nums.length && num == nums[i]) {
                nums[trail++] = nums[i++];
            }

            while (i < nums.length && nums[i] == num) {
                i++;
            }
        }
        return trail;
    }
}
