package datastructure.trees.heap;

import java.util.ArrayList;

public abstract class AbstractHeap<T extends Comparable<T>> {

    ArrayList<T> heap = new ArrayList<>();

    public abstract void insert(T data);
    public abstract T pop();

    public T peek() {
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }

    protected void swap(int index1, int index2) {
        T temp = heap.get(index2);
        heap.set(index2, heap.get(index1));
        heap.set(index1, temp);
    }

    protected boolean isSmaller(int index1, int index2) {
        return heap.get(index1).compareTo(heap.get(index2)) < 0;
    }

    protected boolean isGreater(int index1, int index2) {
        return heap.get(index1).compareTo(heap.get(index2)) > 0;
    }


    protected int getParentsLocation(int parentLocation) {
        return (int) Math.round(Math.floor(parentLocation / 2.0));
    }

    protected int getLeftChildLocation(int parentLocation) {
        parentLocation += 1; // Make it 1-indexed so easier to calculate
        return parentLocation * 2 - 1 /* +1 and -1 cancels out */;
    }

    protected int getRightChildLocation(int parentLocation) {
        parentLocation += 1; // Make it 1-indexed so easier to calculate
        return parentLocation * 2;
    }

    protected void swapWithParent(int index) {
        int parentsLocation = getParentsLocation(index);
        swap(parentsLocation, index);
    }
}
