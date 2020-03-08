package datastructure.trees.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinHeapTest {
    @Test
    public void testMinHeapInsert() {
        MinHeap<Integer> minHeap = new MinHeap<>();
        minHeap.insert(5);
        assertEquals(new Integer(5), minHeap.peek());

        minHeap.insert(10);
        assertEquals(new Integer(5), minHeap.peek());

        minHeap.insert(15);
        assertEquals(new Integer(5), minHeap.peek());

        minHeap.insert(20);
        assertEquals(new Integer(5), minHeap.peek());

        minHeap.insert(2);
        assertEquals(new Integer(2), minHeap.peek());

        minHeap.insert(1);
        assertEquals(new Integer(1), minHeap.peek());
    }

    @Test
    public void testMinHeapPop() {
        MinHeap<Integer> minHeap = new MinHeap<>();
        minHeap.insert(5);
        minHeap.insert(10);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(2);
        minHeap.insert(1);

        assertEquals(new Integer(1), minHeap.pop());
        assertEquals(new Integer(2), minHeap.pop());
        assertEquals(new Integer(5), minHeap.pop());
        assertEquals(new Integer(10), minHeap.pop());
        assertEquals(new Integer(15), minHeap.pop());
        assertEquals(new Integer(20), minHeap.pop());
        assertNull(minHeap.pop());
    }
}