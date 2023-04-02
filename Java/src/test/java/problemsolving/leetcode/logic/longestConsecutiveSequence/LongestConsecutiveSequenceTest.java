package problemsolving.leetcode.logic.longestConsecutiveSequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {
    @Test
    public void testCase01() {
        int[] input = {100,4,200,1,3,2};

        int output = new LongestConsecutiveSequence().longestConsecutive(input);

        assertEquals(4, output);
    }

    @Test
    public void testCase02() {
        int[] input = {0,3,7,2,5,8,4,6,0,1};

        int output = new LongestConsecutiveSequence().longestConsecutive(input);

        assertEquals(9, output);
    }

}