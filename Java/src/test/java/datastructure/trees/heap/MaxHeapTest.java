package datastructure.trees.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxHeapTest {

    @Test
    public void testHeapInsert() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.insert(5);
        assertEquals(new Integer(5), maxHeap.peek());

        maxHeap.insert(10);
        assertEquals(new Integer(10), maxHeap.peek());

        maxHeap.insert(15);
        assertEquals(new Integer(15), maxHeap.peek());

        maxHeap.insert(20);
        assertEquals(new Integer(20), maxHeap.peek());

        maxHeap.insert(25);
        assertEquals(new Integer(25), maxHeap.peek());

        maxHeap.insert(12);
        assertEquals(new Integer(25), maxHeap.peek());
    }

    @Test
    public void testHeapPop() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.insert(5);
        maxHeap.insert(10);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(25);
        maxHeap.insert(12);

        assertEquals(new Integer(25), maxHeap.pop());
        assertEquals(new Integer(20), maxHeap.pop());
        assertEquals(new Integer(15), maxHeap.pop());
        assertEquals(new Integer(12), maxHeap.pop());
        assertEquals(new Integer(10), maxHeap.pop());
        assertEquals(new Integer(5), maxHeap.pop());
        assertNull(maxHeap.pop());
    }
}