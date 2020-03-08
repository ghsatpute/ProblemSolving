package datastructure.trees.heap;

public class MaxHeap<T extends Comparable<T>> extends AbstractHeap<T> {

    public void insert(T data) {
        int size = heap.size();
        heap.add(size, data);

        while(size > 0) {
            int parentsLocation = getParentsLocation(size);
            if (heap.get(size).compareTo(heap.get(parentsLocation)) > 0) {
                swapWithParent(size);
                size = parentsLocation;
            } else {
                break;
            }
        }
    }

    public T pop() {
        if (heap.size() == 0) return null;
        if (heap.size() == 1) return heap.remove(0);

        T popped = this.peek();
        heap.set(0, heap.remove(heap.size() - 1));
        int currentIndex = 0;
        while (true) {
            int leftIndex = getLeftChildLocation(currentIndex);
            int rightIndex = getRightChildLocation(currentIndex);
            // TODO: Simplify these too many if-else conditions
            if (leftIndex >= heap.size() && rightIndex >= heap.size()) { // No child is present
                break;
            } else if (rightIndex >= heap.size()         // No right child, left child is smaller than current
                    && isGreater(currentIndex, leftIndex)) {
                break;
            } else if (rightIndex >= heap.size()  // No right child, left child is greater than current
                    && !isGreater(currentIndex, leftIndex)) {
                swap(currentIndex, leftIndex);
                break;
            } else if (isGreater(currentIndex, leftIndex) // Both children are present, both are greater than current
                    && isGreater(currentIndex, rightIndex)) {
                break;
            } else if (isGreater(leftIndex, rightIndex)) { // Both children are present, left is greater
                swap(currentIndex, leftIndex);
                currentIndex = leftIndex;
            } else {                                       // Both children are present, right is smaller
                swap(currentIndex, rightIndex);
                currentIndex = rightIndex;
            }
        }
        return popped;
    }
}
