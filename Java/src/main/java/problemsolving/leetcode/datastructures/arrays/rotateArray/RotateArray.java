package problemsolving.leetcode.datastructures.arrays.rotateArray;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }

        int numReplacement = 0;
        int currentPos = 0;

        while (numReplacement != nums.length) {
            int initialPosition = currentPos;
            int temp = nums[currentPos];

            do {
                int temp2 = nums[currentPos];
                nums[currentPos] = temp;
                temp = temp2;
                numReplacement++;

                currentPos = getNextPosition(currentPos, k, nums.length);
            } while (currentPos != initialPosition);

            nums[initialPosition] = temp;

            currentPos = getNextPosition(currentPos, 1, nums.length);
        }
    }

    private int getNextPosition(int current, int increment, int length) {
        return (current + increment) % length;
    }
}
