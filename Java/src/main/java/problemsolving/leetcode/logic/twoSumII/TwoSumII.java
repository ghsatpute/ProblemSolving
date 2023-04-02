package problemsolving.leetcode.logic.twoSumII;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int first = numbers[start];
            int second = numbers[end];

            if (first + second == target) {
                return new int[] {start + 1, end + 1};
            } else if (first + second < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1};
    }
}
