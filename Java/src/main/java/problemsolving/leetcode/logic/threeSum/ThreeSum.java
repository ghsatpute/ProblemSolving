package problemsolving.leetcode.logic.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    // https://www.youtube.com/watch?v=jzZsG8n2R9A&ab_channel=NeetCode
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            List<List<Integer>>solutions = twoSum(nums, i + 1, nums.length - 1, - nums[i]);
            for (List<Integer> solution: solutions) {
                solution.add(nums[i]);
                output.add(solution);
            }
        }

        return output;
        /*
         Example 1: [-1,0,1,2,-1,-4]
         After sort: [-4, -1, -1, 0, 1, 2]
         i = 0
            twoSum(nums, 1, 5, 0 - (-4))
                start = 1, end = 5, target = 4
                iter 1
                    currentSum = nums[start] + nums[end] = -1 + 2 = 1
                    if (currentSum < target)
                        start = 1 + 1 = 2
                iter 2
                    currentSum = nums[start] + nums[end] = -1 + 2 = 1
                    if (currentSum < target)
                        start = 2 + 1 = 3
                iter 3
                    currentSum = nums[start] + nums[end] = 0 + 2 = 2
                    if (currentSum < target)
                        start = 3 + 1 = 4
                iter 4
                    currentSum = nums[start] + nums[end] = 1 + 2 = 3
                    if (currentSum < target)
                        start = 4 + 1 = 5
                    break;
                return empty set
        i = 1
            twoSum(nums, i + 1, 5, 0 - (-1))
                nums = [-4, -1, -1, 0, 1, 2]
                start = 2, end = 5, target = 1
                iter 1
                currentSum = nums[start] + nums[end] = -1 + 2
                if (currentSum == target) {
                    return [-1, 2]
            solution = [-1, 2]
            solution.add(-1, 0)

        */
    }

    private List<List<Integer>> twoSum(int[] nums, int start, int end, int target) {
        List<List<Integer>> solutions = new ArrayList<>();
        while (start < end) {
            int currentSum = nums[start] + nums[end];
            if (currentSum == target) {
                List<Integer> solution = new ArrayList<>();
                solution.add(nums[start]);
                solution.add(nums[end]);
                solutions.add(solution);
                // We don't want to have duplicate solutions. For example below array
                // [-2, -2, 0, 0, 2, 2]
                // If we found one solution, i.e. -2 (0th index), 0, 2, then we shouldn't consider -2 at 1st index
                // Rest of the duplicates will be taken care similarly.
                // For the last 2, as the sum would be greater than target
                start++;
                while(start < end && nums[start] == nums[start-1]) {
                    start++;
                }
            } else if (currentSum < target) {
                start++;
            } else {
                end--;
            }
        }

        return solutions;
    }
}
