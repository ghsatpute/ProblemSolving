package problemsolving.leetcode.algorithm.dynamicProgramming.wordBreak;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class WordBreakBruteForceTest {
    @Test
    public void testCase01() {
        String word = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");

        boolean output = new WordBreakBruteForce().wordBreak(word, wordDict);

        assertTrue(output);
    }

    @Test
    public void testCase02() {
        String word = "applepenapple";
        List<String> wordDict = Arrays.asList("apple","pen");

        boolean output = new WordBreakBruteForce().wordBreak(word, wordDict);

        assertTrue(output);
    }

    @Test
    public void testCase03() {
        String word = "catsandog";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");

        boolean output = new WordBreakBruteForce().wordBreak(word, wordDict);

        assertFalse(output);
    }

    @Test
    @Disabled("This test takes 46 seconds. Need to improve in DP version")
    public void testCase04() {
        String word = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> wordDict = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa",
                "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa");

        boolean output = new WordBreakBruteForce().wordBreak(word, wordDict);

        assertFalse(output);
    }
}