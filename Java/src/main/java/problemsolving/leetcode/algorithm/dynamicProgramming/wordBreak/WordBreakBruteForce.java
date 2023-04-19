package problemsolving.leetcode.algorithm.dynamicProgramming.wordBreak;

import java.util.List;

public class WordBreakBruteForce {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        // System.out.println("Searching for word " + s);
        String wordToSearch = s;
        for (String word: wordDict) {
            if (wordToSearch.startsWith(word)) {
                // System.out.println("Found the word " + word + ": " + wordToSearch);
                String newWordToSearch = wordToSearch.substring(word.length());

                boolean output = wordBreak(newWordToSearch, wordDict);
                if (output == true) {
                    // System.out.println("Returning true for word " + s);
                    return true;
                }
            }
        }
        // System.out.println("Returning false for word " + s);
        return false;
    }
}
