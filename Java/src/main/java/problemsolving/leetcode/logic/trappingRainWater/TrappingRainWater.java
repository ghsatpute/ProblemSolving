package problemsolving.leetcode.logic.trappingRainWater;

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }

        int[] rMax= new int[height.length];
        int[] lMax= new int[height.length];

        rMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            rMax[i] = Math.max(height[i], rMax[i - 1]);
        }

        lMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            lMax[i] = Math.max(height[i], lMax[i + 1]);
        }

        int trapped = 0;
        for (int i = 0; i < height.length; i++) {
            trapped += Math.min(rMax[i], lMax[i]) - height[i];
        }

        return trapped;

    }
}
