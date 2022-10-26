package problemsolving.leetcode.logic.largestAreaInHistogram;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaInHistogram {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int[] leftLimits = new int[heights.length];
        int[] rightLimits = new int[heights.length];

        calculateLeftLimits(heights, leftLimits);
        calculateRightLimits(heights, rightLimits);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int area = (rightLimits[i] - leftLimits[i] + 1) * heights[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }

    private void calculateLeftLimits(int[] heights, int[] leftLimits) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                leftLimits[i] = 0;
            } else {
                leftLimits[i] = stack.peek() + 1;
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(leftLimits));
    }

    private void calculateRightLimits(int[] heights, int[] rightLimits) {
        Stack<Integer> stack = new Stack<>();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                rightLimits[i] = heights.length - 1;
            } else {
                rightLimits[i] = stack.peek() - 1;
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(rightLimits));
    }

}
