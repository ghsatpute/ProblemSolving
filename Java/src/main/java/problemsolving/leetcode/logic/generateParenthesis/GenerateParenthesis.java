package problemsolving.leetcode.logic.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        generateParenthesis(result, "", 0, 0, n);

        return result;
    }

    public void generateParenthesis(List<String> lists, String currentString, int numLeftParens, int numRightParens, int max) {
        if (currentString.length() == max * 2) {
            lists.add(currentString);
            return;
        }

        if (numLeftParens < max) {
            generateParenthesis(lists, currentString + "(", numLeftParens + 1, numRightParens, max);
        }

        if (numRightParens < numLeftParens) {
            generateParenthesis(lists, currentString + ")", numLeftParens, numRightParens + 1, max);
        }
    }
}
