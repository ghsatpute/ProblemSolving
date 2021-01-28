package problemsolving.leetcode.logic.minimumNumberOfIncrementsToFormTargetArray;

import java.util.Stack;

public class MinimumNumberOfIncrementsToFormTargetArray {
    public int minNumberOperations(int[] target) {
        if (target == null || target.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < target.length; i++) {
            if (stack.isEmpty()) {
                stack.push(target[i]);
                continue;
            }
            if (stack.peek() > target[i]) {
                count += stack.peek() - target[i];
                while (!stack.isEmpty() && stack.peek() > target[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty() || stack.peek() < target[i]) {
                stack.push(target[i]);
            }
        }
        if (!stack.isEmpty()) {
            count += stack.peek();
        }
        return count;
    }
}
