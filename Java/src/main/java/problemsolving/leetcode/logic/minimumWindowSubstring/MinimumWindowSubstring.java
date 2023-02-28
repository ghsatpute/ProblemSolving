package problemsolving.leetcode.logic.minimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        // https://www.youtube.com/watch?v=jSto0O4AJbM
        if (s.length() == 0) {
            return "";
        }

        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> expectedCount = new HashMap<>();
        for (Character character: t.toCharArray()) {
            expectedCount.put(character, expectedCount.getOrDefault(character, 0) + 1);
        }

        Map<Character, Integer> actualCount = new HashMap<>();

        int start = 0;
        int end = 0;
        int answerStart = 0, answerEnd = s.length(), answerLength = s.length() + 1;
        boolean slideEnd = true;

        while (start < s.length() && end < s.length()) {
            if (slideEnd) {
                char currentChar = s.charAt(end);
                if (!expectedCount.containsKey(currentChar)) {
                    end++;
                    continue;
                }

                actualCount.put(currentChar, actualCount.getOrDefault(currentChar, 0) + 1);
                if (doesExpectedMatchActual(expectedCount, actualCount)) {
                    int newAnswerLength = end - start + 1;
                    if (newAnswerLength <= answerLength) {
                        answerStart = start;
                        answerEnd = end;
                        answerLength = newAnswerLength;
                    }
                    slideEnd = false;
                } else {
                    end++;
                }
            } else {
                char currentChar = s.charAt(start);

                if (doesExpectedMatchActual(expectedCount, actualCount)) {
                    int newAnswerLength = end - start + 1;
                    if (newAnswerLength < answerLength) {
                        answerStart = start;
                        answerEnd = end;
                        answerLength = newAnswerLength;
                    }
                    start++;
                } else {
                    slideEnd = true;
                    start++;
                    end++;
                }

                if (expectedCount.containsKey(currentChar)) {
                    actualCount.put(currentChar, actualCount.getOrDefault(currentChar, 0) - 1);
                }
            }
        }

        if (answerLength <= s.length()) {
            return s.substring(answerStart, answerEnd + 1);
        } else {
            return "";
        }
    }

    private boolean doesExpectedMatchActual(Map<Character, Integer> expectedCount,
                                            Map<Character, Integer> actualCount) {
        for (char character: expectedCount.keySet()) {
            if (!actualCount.containsKey(character) || expectedCount.get(character) > actualCount.get(character)) {
                return false;
            }
        }

        return true;
    }
}
