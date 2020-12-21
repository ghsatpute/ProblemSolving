package problemsolving.leetcode.logic.findDuplicate;

public class FindTheDuplicate {
    public int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int originalValue = nums[i] % nums.length;
            if (originalValue >= 1 && originalValue <= nums.length) {
                nums[originalValue - 1] += nums.length;
            }
        }

        // Example 1
        // [1,3,4,2,2]
        // [6,  13,  9, 7, 2]
        // max = 13
        //
        // Example 2
        // [3,1,3,4,2]
        // [ 8, 6 , 13, 9, 2 ]
        // max = 13
        //
        // Example 3
        // [1, 1, 1, 1, 1]
        // [26, 1, 1, 1, 1]
        // max = 26
        //
        // Example 4
        // [7,9,7,4,2,8,7,7,1,5]
        //

        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i + 1;
            }
            nums[i] = nums[i] % nums.length;
        }


        return index ;
    }
}