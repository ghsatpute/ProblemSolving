package algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubset {

    public static List<List<Integer>> solution(int[] elements, int totalSum) {
        List<List<Integer>> solutions = new ArrayList<>();
        boolean[] decisionArray = new boolean[elements.length];
        solve(elements, totalSum, 0, 0, decisionArray, solutions);
        return solutions;
    }

    private static void solve(int[] elements, int totalSum, int sumSoFar, int index, boolean[] decisionArray, List<List<Integer>> solutions) {

        // If visited all element
        if (index >= elements.length) {
            return;
        }

        // Bounding condition
        if (sumSoFar > totalSum) {
            return;
        }

        if (sumSoFar + elements[index] == totalSum) { // We found a solution
            decisionArray[index] = true;
            solutions.add(createSolution(elements, decisionArray));
        }
        // Choose current element
        decisionArray[index] = true;
        solve(elements, totalSum, sumSoFar + elements[index], index + 1, decisionArray, solutions);

        // Don't choose current element
        decisionArray[index] = false;
        solve(elements, totalSum, sumSoFar, index + 1, decisionArray, solutions);
    }

    private static List<Integer> createSolution(int[] elements, boolean[] decisionArray) {
        List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < decisionArray.length; i++) {
            if (decisionArray[i]) {
                solution.add(elements[i]);
            }
        }
        return solution;
    }
}
