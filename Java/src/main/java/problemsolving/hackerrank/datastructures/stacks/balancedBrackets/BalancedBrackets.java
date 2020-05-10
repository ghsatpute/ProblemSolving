package problemsolving.hackerrank.datastructures.stacks.balancedBrackets;

import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            switch(ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) return "NO";

                    if (!isMatchingBrace(stack.peek(), ch)) {
                        return "NO";
                    } else {
                        stack.pop();
                    }
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static boolean isMatchingBrace(char left, Character right) {
        if (left == '(' && right == ')') return true;
        if (left == '[' && right == ']') return true;
        if (left == '{' && right == '}') return true;
        return false;
    }

}
