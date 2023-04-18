package problemsolving.leetcode.datastructures.heap.findMedianFromDataStream;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    static class MedianFinder {
        private PriorityQueue<Integer> maxHeap;
        private PriorityQueue<Integer> minHeap;

        public MedianFinder() {
            // Max heap will store all the elements less than all the elements in the min heap.
            // So [1, 2, 3, 4] numbers are passed, mxHeap will have [1, 2] and minHeap will have [3, 4]
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            // Initially add the element on the left side, i.e assume the element is less than minHeap
            maxHeap.add(num);

            // Once the element gets added to maxHeap, we want to pick out max element add to right side i.e. minHeap
            minHeap.add(maxHeap.poll());

            // If left size side (maxHeap) is smaller then pull from right side and put it into left side
            // We want to keep left side bigger in case of uneven numbers in both heaps
            if (maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {
            // If lef/maxHeap is bigger than right/minheap then return top element from maxHeap
            if (maxHeap.size() > minHeap.size()) {
                return maxHeap.peek();
            }

            // Otherwise send the average of both tops
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
    }
}
