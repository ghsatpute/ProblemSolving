package problemsolving.leetcode.logic.RemovingMinimumAndMaximumFromArray;

public class RemovingMinimumAndMaximumFromArray {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        int minNumber = nums[0];
        int maxNumber = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNumber) {
                minIndex = i;
                minNumber = nums[i];
            }

            if (nums[i] > maxNumber) {
                maxIndex = i;
                maxNumber = nums[i];
            }
        }

        int leftDistanceMin = minIndex + 1;
        int rightDistanceMin = nums.length - minIndex;

        int leftDistanceMax = maxIndex + 1;
        int rightDistanceMax = nums.length - maxIndex;

        int bothOnLeft = Math.max(leftDistanceMin, leftDistanceMax);
        int bothOnRight = Math.max(rightDistanceMin, rightDistanceMax);
        int minLeftMaxRight = leftDistanceMin + rightDistanceMax;
        int minRightMaxLeft = leftDistanceMax + rightDistanceMin;


        return Math.min(Math.min(Math.min(bothOnLeft, bothOnRight), minLeftMaxRight), minRightMaxLeft);
    }
}
