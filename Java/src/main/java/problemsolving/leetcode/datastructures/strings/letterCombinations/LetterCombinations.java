package problemsolving.leetcode.datastructures.strings.letterCombinations;

import java.util.*;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.trim().length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, String> wordMap = new HashMap<Character, String>() {{
            put('1', "");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        Set<String> letterCombinations = formLetterCombinations(digits, 0, wordMap, null);

        return new ArrayList<>(letterCombinations);
    }

    private Set<String> formLetterCombinations(String digits, int current, Map<Character, String> wordMap, Set<String> lists) {

        if (current >= digits.length()) {
            return lists;
        }

        char currentDigit = digits.charAt(current);
        char[] currentChars = wordMap.get(currentDigit).toCharArray();

        Set<String> newLetterCombinations = new HashSet<>();

        if (lists == null) {
            for (char ch: currentChars) {
                newLetterCombinations.add(ch + "");
            }
        } else {
            for (String string : lists) {
                for (char ch : currentChars) {
                    newLetterCombinations.add(string + ch);
                }
            }
        }

        return formLetterCombinations(digits, current + 1, wordMap, newLetterCombinations);
    }

}
