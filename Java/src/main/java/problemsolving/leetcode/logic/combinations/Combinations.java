package problemsolving.leetcode.logic.combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        return combine(1, n, k);
    }

    public List<List<Integer>> combine(int start, int end, int k) {
        List<List<Integer>> output = new ArrayList<>();
        if (k <= 0) {
            return output;
        }

        for (int i = start; i <= end; i++) {
            if (k == 1) {
                List<Integer> numOutput = new ArrayList<>();
                numOutput.add(i);
                output.add(numOutput);
            } else {
                List<List<Integer>> numOutput = combine(i + 1, end,k - 1);
                for (List<Integer> current: numOutput) {
                    current.add(0, i);
                }

                output.addAll(numOutput);
            }
        }

        return output;
    }
}
