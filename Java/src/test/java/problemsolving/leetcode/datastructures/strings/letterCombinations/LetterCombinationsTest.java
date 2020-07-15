package problemsolving.leetcode.datastructures.strings.letterCombinations;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsTest {
    @Test
    public void testCase01() {
        LetterCombinations letterCombinations = new LetterCombinations();

        List<String> result = letterCombinations.letterCombinations("");

        assertEquals(0, result.size());
    }

    @Test
    public void testCase02() {
        LetterCombinations letterCombinations = new LetterCombinations();

        List<String> result = letterCombinations.letterCombinations("23");

        assertEquals(9, result.size());
    }
}