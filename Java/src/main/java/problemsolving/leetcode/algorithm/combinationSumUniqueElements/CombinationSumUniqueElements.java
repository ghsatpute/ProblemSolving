package problemsolving.leetcode.algorithm.combinationSumUniqueElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumUniqueElements {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> solutions = new ArrayList<>();
        Arrays.sort(candidates);
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
            if (i > currentIndex && numbers[i - 1] == numbers[i]) continue;
            if (numbers[i] > target) {
                break;
            }
            currentSolution.add(numbers[i]);
            formSolutions(numbers, target - numbers[i], solutions, currentSolution, i + 1);
            currentSolution.remove(new Integer(numbers[i]));
        }
    }
}
