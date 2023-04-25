package problemsolving.leetcode.algorithm.dynamicProgramming.distinctSubsequneces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistinctSubsequencesDynamicProgrammingTest {
    @Test
    public void testCase01() {
        String source = "rabbbit";
        String target = "rabbit";

        int output = new DistinctSubsequencesDynamicProgramming().numDistinct(source, target);

        assertEquals(3, output);
    }

    @Test
    public void testCase02() {
        String source = "babgbag";
        String target = "bag";

        int output = new DistinctSubsequencesDynamicProgramming().numDistinct(source, target);

        assertEquals(5, output);
    }
}