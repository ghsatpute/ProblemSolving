package problemsolving.leetcode.datastructures.heap.findMedianFromDataStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMedianFromDataStreamTest {
    @Test
    public void testCase01() {
        FindMedianFromDataStream.MedianFinder medianFinder = new FindMedianFromDataStream.MedianFinder();

        medianFinder.addNum(1);
        assertEquals(1.0, medianFinder.findMedian());

        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian());

        medianFinder.addNum(3);
        assertEquals(2, medianFinder.findMedian());

        medianFinder.addNum(4);
        assertEquals(2.5, medianFinder.findMedian());

        medianFinder.addNum(5);
        assertEquals(3, medianFinder.findMedian());
    }

    @Test
    public void testCase02() {
        FindMedianFromDataStream.MedianFinder medianFinder = new FindMedianFromDataStream.MedianFinder();

        medianFinder.addNum(5);
        assertEquals(5, medianFinder.findMedian());

        medianFinder.addNum(1);
        assertEquals(3, medianFinder.findMedian());

        medianFinder.addNum(2);
        assertEquals(2, medianFinder.findMedian());

        medianFinder.addNum(4);
        assertEquals(3, medianFinder.findMedian());

        medianFinder.addNum(3);
        assertEquals(3, medianFinder.findMedian());
    }
}