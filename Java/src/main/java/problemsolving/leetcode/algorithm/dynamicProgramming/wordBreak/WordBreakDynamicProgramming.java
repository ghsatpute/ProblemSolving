package problemsolving.leetcode.algorithm.dynamicProgramming.wordBreak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakDynamicProgramming {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> memo = new HashMap<>();
        return wordBreak(s, wordDict, memo);
    }

    private boolean wordBreak(String s, List<String> wordDict, Map<String, Boolean> memo) {
        if (s.length() == 0) {
            return true;
        }

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        // System.out.println("Searching for word " + s);
        for (String word: wordDict) {
            if (s.startsWith(word)) {
                String newWordToSearch = s.substring(word.length());

                boolean output = wordBreak(newWordToSearch, wordDict, memo);
                if (output) {
                    memo.put(s, true);
                    return true;
                }
            }
        }
        memo.put(s, false);
        return false;
    }
}
