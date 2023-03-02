package problemsolving.leetcode.logic.longestValidParenthesis;

import java.util.Stack;

public class LongestValidParenthesis {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int max = 0;

        if (s == null || s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.size() > 1 && s.charAt(stack.peek()) == '(' ) {
                    stack.pop();
                    max = Math.max(i - stack.peek(), max);
                } else {
                    stack.push(i);
                }
            } else {
                throw new RuntimeException("Unknown character");
            }
        }

        return max;
    }
}
