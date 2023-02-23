package problemsolving.leetcode.logic.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        ArrayList<Integer> firstList = new ArrayList<>();
        output.add(firstList);
        return subsets(nums, output, 0);
    }

    public List<List<Integer>> subsets(int[] nums, List<List<Integer>> output, int currentIndex) {
        if (currentIndex >= nums.length) {
            return output;
        }

        List<List<Integer>> outputWithChoosingCurrent = new ArrayList<>();

        for (List<Integer> list: output) {
            ArrayList<Integer> newList = new ArrayList<>(list);
            newList.add(nums[currentIndex]);
            outputWithChoosingCurrent.add(newList);
        }

        outputWithChoosingCurrent = subsets(nums, outputWithChoosingCurrent, currentIndex + 1);

        List<List<Integer>> outputWithoutChoosingCurrent = subsets(nums, output, currentIndex + 1);

        outputWithChoosingCurrent.addAll(outputWithoutChoosingCurrent);

        return outputWithChoosingCurrent;
    }
}
