package problemsolving.leetcode.logic.containerWithMostWater;

public class ContainerWithMostWaterLinearSolution {
    // https://www.youtube.com/watch?v=UuiTKBwPgAo&ab_channel=NeetCode
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while(start < end) {
            int area = (end - start) * Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, area);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }

        return maxArea;
    }
}
