package problemsolving.hackerrank.datastructures.stacks.equalStacks;

public class EqualStacks {
    private static class MinWithIndex {
        int min;
        int index;
    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int[][] stacks = new int[][] {h1, h2, h3};
        int[] currentHeights = new int[] {getStackHeight(h1), getStackHeight(h2), getStackHeight(h3)};
        int[] indexes = new int[] {0, 0, 0};

        while (true) {

            if (currentHeights[0] == currentHeights[1] && currentHeights[1] == currentHeights[2]) {
                return currentHeights[0];
            }

            MinWithIndex minWithIndex = findMinWithIndex(currentHeights[0], currentHeights[1], currentHeights[2]);

            int minHeight = minWithIndex.min;


            for (int i = 0; i < stacks.length; i++) {
                if (i == minWithIndex.index) {
                    continue;
                }

                int stackCurrentHeight = currentHeights[i];

                int index = indexes[i];
                while (stackCurrentHeight > minHeight) {
                    stackCurrentHeight -= stacks[i][index++];
                }
                currentHeights[i] = stackCurrentHeight;
                indexes[i] = index;
            }
        }
    }

    private static MinWithIndex findMinWithIndex(int num1, int num2, int num3) {
        MinWithIndex result = new MinWithIndex();
        if (num1 <= num2 && num1 <= num3) {
            result.min = num1;
            result.index = 0;
        } else if (num2 <= num3) {
            result.min = num2;
            result.index = 1;
        } else {
            result.min = num3;
            result.index = 2;
        }
        return result;
    }

    private static int getStackHeight(int[] stack) {
        int height = 0;
        for (int value : stack) {
            height += value;
        }
        return height;
    }
}
