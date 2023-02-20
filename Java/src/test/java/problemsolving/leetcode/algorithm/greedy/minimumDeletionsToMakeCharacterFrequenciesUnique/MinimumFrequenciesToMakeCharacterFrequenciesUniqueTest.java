package problemsolving.leetcode.algorithm.greedy.minimumDeletionsToMakeCharacterFrequenciesUnique;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumFrequenciesToMakeCharacterFrequenciesUniqueTest {
    @Test
    public void testCase01() {
        String input = "a";

        int output = new MinimumFrequenciesToMakeCharacterFrequenciesUnique().minDeletions(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase02() {
        String input = "aa";

        int output = new MinimumFrequenciesToMakeCharacterFrequenciesUnique().minDeletions(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase03() {
        String input = "ab";

        int output = new MinimumFrequenciesToMakeCharacterFrequenciesUnique().minDeletions(input);

        assertEquals(1, output);
    }

    @Test
    public void testCase04() {
        String input = "abb";

        int output = new MinimumFrequenciesToMakeCharacterFrequenciesUnique().minDeletions(input);

        assertEquals(0, output);
    }

    @Test
    public void testCase05() {
        String input = "abbcc";

        int output = new MinimumFrequenciesToMakeCharacterFrequenciesUnique().minDeletions(input);

        assertEquals(2, output);
    }

    @Test
    public void testCase06() {
        String input = "abcd";

        int output = new MinimumFrequenciesToMakeCharacterFrequenciesUnique().minDeletions(input);

        assertEquals(3, output);
    }
}