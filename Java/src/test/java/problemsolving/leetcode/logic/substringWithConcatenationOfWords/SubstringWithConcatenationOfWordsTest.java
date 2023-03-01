package problemsolving.leetcode.logic.substringWithConcatenationOfWords;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class SubstringWithConcatenationOfWordsTest {
    @Test
    public void testCase01() {
        String string = "abc";
        String[] words = {"foo", "bar"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(0, output.size());
    }

    @Test
    public void testCase02() {
        String string = "foobar";
        String[] words = {"foo", "bar"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(1, output.size());
        assertEquals(0, output.get(0));
    }

    @Test
    public void testCase03() {
        String string = "foobarfoo";
        String[] words = {"foo", "bar"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(2, output.size());
        assertEquals(0, output.get(0));
        assertEquals(3, output.get(1));
    }

    @Test
    public void testCase03_1() {
        String string = "foobarfoo";
        String[] words = {"foo", "foo"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(0, output.size());
    }

    @Test
    public void testCase03_2() {
        String string = "foofoofoo";
        String[] words = {"foo", "foo"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(2, output.size());
        assertEquals(0, output.get(0));
        assertEquals(3, output.get(1));
    }

    @Test
    public void testCase04_leetCode() {
        String string = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(2, output.size());
        assertEquals(0, output.get(0));
        assertEquals(9, output.get(1));
    }

    @Test
    public void testCase05_leetCode() {
        String string = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(0, output.size());
    }

    @Test
    public void testCase06_leetCode() {
        String string = "barfoofoobarthefoobarman";
        String[] words = {"foo", "bar", "the"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(3, output.size());
        assertEquals(6, output.get(0));
        assertEquals(9, output.get(1));
        assertEquals(12, output.get(2));
    }

    @Test
    public void testCase07_leetCode() {
        String string = "bcabbcaabbccacacbabccacaababcbb";
        String[] words = {"c", "b", "a", "c", "a", "a", "a", "b", "c"};

        List<Integer> output = new SubstringWithConcatenationOfWords().findSubstring(string, words);

        assertEquals(6, output.size());
        assertEquals(6, output.get(0));
        assertEquals(16, output.get(1));
        assertEquals(17, output.get(2));
        assertEquals(18, output.get(3));
        assertEquals(19, output.get(4));
        assertEquals(20, output.get(5));
    }
}