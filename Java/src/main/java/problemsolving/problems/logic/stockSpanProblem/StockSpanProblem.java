package problemsolving.problems.logic.stockSpanProblem;

import java.util.Stack;

public class StockSpanProblem {
    public static int[] solve(int[] stockPrices) {
        if (stockPrices.length == 0) {
            return new int[]{};
        }

        if (stockPrices.length == 1) {
            return new int[] {1};
        }
        int[] output = new int[stockPrices.length];
        output[0] = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < stockPrices.length; i++) {
            while (!stack.empty() && stockPrices[stack.peek()] < stockPrices[i]) {
                stack.pop();
            }

            output[i] = i - stack.peek();
            stack.push(i);
        }
        return output;
    }
}
