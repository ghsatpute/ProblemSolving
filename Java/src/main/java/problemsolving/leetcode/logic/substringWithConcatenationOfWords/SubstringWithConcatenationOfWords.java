package problemsolving.leetcode.logic.substringWithConcatenationOfWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> output = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) {
            return output;
        }
        int eachWordLength = words[0].length();

        Map<String, Integer> wordCount = new HashMap<>();
        Arrays.stream(words).forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));

        int outputLength = words.length * words[0].length();

        for (int i = 0; i <= s.length() - outputLength; i++) {
            List<String> removedWords = new ArrayList<>();
            for (int j = i;
                 j <= s.length() - eachWordLength
                         && wordCount.getOrDefault(s.substring(j, j + eachWordLength), 0) >= 1;
                 j += eachWordLength) {
                wordCount.put(s.substring(j, j + eachWordLength), wordCount.get(s.substring(j, j + eachWordLength)) - 1);
                removedWords.add(s.substring(j, j + eachWordLength));
            }
            if (removedWords.size() == words.length) {
                output.add(i);
            }
            removedWords.forEach(word -> wordCount.put(word, wordCount.getOrDefault(word,0) + 1));
        }

        return output;
    }
}
