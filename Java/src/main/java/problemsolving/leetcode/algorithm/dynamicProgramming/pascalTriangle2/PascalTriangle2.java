package problemsolving.leetcode.algorithm.dynamicProgramming.pascalTriangle2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; i++) {
            pascal.add(new ArrayList<>());
            pascal.get(i).add(1);
        }

        if (rowIndex == 0) {
            return pascal.get(0);
        }

        // add for number 2
        pascal.get(1).add(1);

        if (rowIndex == 1) {
            return pascal.get(1);
        }

        for (int i = 1; i <= rowIndex; i++) {
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

        return pascal.get(rowIndex);
    }
}
