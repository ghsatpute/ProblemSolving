package algorithms.dynamicprogramming;

class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] values = new int[]{60, 100, 120};
        int[] weights = new int[]{10, 20, 30};
        int maxWeight = 50;
        int n = values.length - 1;

        int result = knapsackRecursive(maxWeight, weights, values, n);
        System.out.println(String.format("Maximum weight can be filled is {}", n));
    }

    public static int knapsackRecursive(int maxWeight, int[] weights, int[] values, int n) {
        if (n == 0)
            return 0;

        if (weights[n] > maxWeight) {
            return knapsackRecursive(maxWeight, weights, values, n - 1);
        }

        // Choose a maximum of either choosing the current item or not choosing it
        return Math.max(
                values[n] + knapsackRecursive(maxWeight - weights[n], weights, values, n - 1),
                knapsackRecursive(maxWeight, weights, values, n - 1)
        );
    }
}
