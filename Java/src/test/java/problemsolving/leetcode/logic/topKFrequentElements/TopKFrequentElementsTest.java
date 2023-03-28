package problemsolving.leetcode.logic.topKFrequentElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {
    @Test
    public void testCase01() {
        int[] inputArray = {1};
        int k = 1;

        int[] output = new TopKFrequentElements().topKFrequent(inputArray, k);

        assertEquals(1, output.length);
        assertEquals(1, output[0]);
    }

    @Test
    public void testCase02() {
        int[] inputArray = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] output = new TopKFrequentElements().topKFrequent(inputArray, k);

        assertEquals(2, output.length);
        assertEquals(1, output[0]);
        assertEquals(2, output[1]);
    }

    @Test
    public void testCase03() {
        int[] inputArray = {1, 1, 1, 2, 2, 2};
        int k = 2;

        int[] output = new TopKFrequentElements().topKFrequent(inputArray, k);

        assertEquals(2, output.length);
        assertEquals(1, output[0]);
        assertEquals(2, output[1]);
    }
}
