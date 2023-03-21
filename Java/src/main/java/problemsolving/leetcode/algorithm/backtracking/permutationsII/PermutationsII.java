package problemsolving.leetcode.algorithm.backtracking.permutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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

            if (i > 0 && used[i-1] && nums[i] == nums[i - 1]) {
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
