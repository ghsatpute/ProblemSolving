package problemsolving.leetcode.algorithm.dynamicProgramming.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            pascal.add(new ArrayList<>());
            pascal.get(i).add(1);
        }

        if (numRows == 1) {
            return pascal;
        }

        // add for number 2
        pascal.get(1).add(1);

        if (numRows == 2) {
            return pascal;
        }

        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    pascal.get(i).add(1);
                } else {
                    int top1 = pascal.get(i - 1).get(j - 1);
                    int top2 = pascal.get(i - 1).get(j);
                    pascal.get(i).add( top1 + top2);
                }
            }
        }

        return pascal;
    }
}
