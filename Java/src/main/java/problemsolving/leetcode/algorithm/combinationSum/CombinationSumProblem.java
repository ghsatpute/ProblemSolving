package problemsolving.leetcode.algorithm.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumProblem {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solutions = new ArrayList<>();

        formSolutions(candidates, target, solutions, new ArrayList<>(), 0);

        return solutions;
    }

    private void formSolutions(int[] numbers, int target, List<List<Integer>> solutions, List<Integer> currentSolution, int currentIndex) {

        if (target < 0) {
            return;
        }

        if (target == 0 && currentSolution.size() != 0) {
            solutions.add(new ArrayList<>(currentSolution));
        }

        for (int i = currentIndex; i < numbers.length; i++) {
            if (numbers[i] <= target) {
                // Choose the current element
                currentSolution.add(numbers[i]);
                formSolutions(numbers, target - numbers[i], solutions, currentSolution, i);

                currentSolution.remove(new Integer(numbers[i]));
            }
        }
    }

}
