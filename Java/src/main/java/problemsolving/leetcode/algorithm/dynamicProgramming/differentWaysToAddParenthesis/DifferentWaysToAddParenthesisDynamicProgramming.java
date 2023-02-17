package problemsolving.leetcode.algorithm.dynamicProgramming.differentWaysToAddParenthesis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DifferentWaysToAddParenthesisDynamicProgramming {
    public static class Token {
    }

    public static class OperatorToken extends Token {
        public char operator;

        @Override
        public String toString() {
            return operator + "";
        }
    }

    public static class OperandToken extends Token {
        public int operand;

        @Override
        public String toString() {
            return operand + "";
        }
    }

    public List<Integer> diffWaysToCompute(String expression) {
        List<Token> tokens = tokenize(expression);

        HashMap<String, List<Integer>> memo = new HashMap<>();

        return calculateCombinations(tokens, memo);
    }

    private List<Integer> calculateCombinations(List<Token> tokens, HashMap<String, List<Integer>> memo) {
        if (tokens.size() == 1) {
            return Collections.singletonList(((OperandToken) tokens.get(0)).operand);
        }

        if (tokens.size() == 2) {
            throw new IllegalArgumentException("Cannot do operation on 2 tokens");
        }

        if (tokens.size() == 3) {
            int result = performMathOperations(
                    ((OperandToken) tokens.get(0)).operand,
                    ((OperatorToken) tokens.get(1)).operator,
                    ((OperandToken) tokens.get(2)).operand);

            return Collections.singletonList(result);
        }

        String memoKey = tokens.stream().map(Objects::toString).collect(Collectors.joining());
        if (memo.containsKey(memoKey)) {
            System.out.println("Reading from memo" + memoKey);
            return memo.get(memoKey);
        }

        List<Integer> outputs = new ArrayList<>();
        for (int i = 0; i < tokens.size(); i++) {
            Token current = tokens.get(i);
            // If we found operand, then continue
            if (!(current instanceof OperatorToken)) {
                continue;
            }

            // If we found an operator, calculate left & right part values and then multiply them together.
            List<Token> leftTokens = tokens.subList(0, i);
            String leftKey = leftTokens.stream().map(Objects::toString).collect(Collectors.joining());
            List<Integer> leftAnswers;
            if (memo.containsKey(leftKey)) {
                System.out.println("Reading from memo, left " + leftKey);
                leftAnswers = memo.get(leftKey);
            } else {
                leftAnswers = calculateCombinations(leftTokens, memo);
                memo.put(leftKey, leftAnswers);
            }

            List<Token> rightTokens = tokens.subList(i + 1, tokens.size());
            String rightKey = rightTokens.stream().map(Objects::toString).collect(Collectors.joining());
            List<Integer> rightAnswers;
            if (memo.containsKey(rightKey)) {
                System.out.println("Reading from memo, right " + rightKey);
                rightAnswers = memo.get(rightKey);
            } else {
                rightAnswers = calculateCombinations(rightTokens, memo);
                memo.put(rightKey, rightAnswers);
            }
            for (int left: leftAnswers) {
                for (int right: rightAnswers) {
                    outputs.add(performMathOperations(left, (((OperatorToken) current).operator), right));
                }
            }
        }

        memo.put(memoKey, outputs);

        return outputs;
    }

    private int performMathOperations(int operand1, char operator, int operand2) {
        if (operator == '+') {
            return operand1 + operand2;
        }

        if (operator == '-') {
            return operand1 - operand2;
        }

        if (operator == '*') {
            return operand1 * operand2;
        }

        throw new IllegalArgumentException("Unhandled operator " + operator);
    }

    private List<Token> tokenize(String expression) {
        List<Token> tokens = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            StringBuilder character = new StringBuilder();
            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                character.append(expression.charAt(i));
                i++;
            }
            if (character.length() > 0) {
                OperandToken operandToken = new OperandToken();
                operandToken.operand = Integer.parseInt(character.toString());
                tokens.add(operandToken);
            }

            if (i < expression.length() && isOperator(expression.charAt(i))) {
                OperatorToken operatorToken = new OperatorToken();
                operatorToken.operator = expression.charAt(i);

                tokens.add(operatorToken);
            }
        }

        return tokens;
    }

    private boolean isOperator(char character) {
        return character == '+' || character == '-' || character == '*';
    }
}
