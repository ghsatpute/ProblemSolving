package problemsolving.leetcode.algorithm.backtracking.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        return permute(nums, new boolean[nums.length], new ArrayList<>(), new ArrayList<>());
    }

    private List<List<Integer>> permute(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> solutions) {
        if (nums.length == path.size()) {
            List<Integer> solution = new ArrayList<>(path);

            solutions.add(solution);

            return solutions;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            path.add(nums[i]);
            permute(nums, used, path, solutions);
            used[i] = false;
            path.remove(path.size() - 1);
        }

        return solutions;
    }
}
