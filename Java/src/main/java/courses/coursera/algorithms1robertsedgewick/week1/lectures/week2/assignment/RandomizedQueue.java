import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private static final int INITIAL_SIZE = 10;
    private int size;
    private Item[] array;

    private class RandomizedIterator implements Iterator<Item> {
        private int current;

        private RandomizedIterator() {
            StdRandom.shuffle(array, 0, size);
            current = 0;
        }

        public boolean hasNext() {
            return current < size;
        }

        public Item next() {
            if (current >= size) {
                throw new NoSuchElementException("Iterator is empty");
            }
            current++;
            int random = StdRandom.uniform(size);
            return array[random];
        }

        public void remove() {
            throw new UnsupportedOperationException("Remove is not supported");
        }
    }

    // construct an empty randomized queue
    public RandomizedQueue() {
        array = createNewArray(INITIAL_SIZE);
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the randomized queue
    public int size(int i) {
        return size;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot enqueue null item");
        }
        if (size == array.length) {
            resize(size * 2);
        }
        array[size++] = item;
    }

    private void resize(int newSize) {
        Item[] newArray = createNewArray(newSize);
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        // System.out.println("Resized array to new size " + newSize);
    }

    private Item[] createNewArray(int n) {
        Item[] arrayToReturn = (Item[]) new Object[n];
        for (int i = 0; i < n; i++) {
            arrayToReturn[0] = null;
        }
        return arrayToReturn;
    }

    // remove and return a random item
    public Item dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Randomized Queue is empty");
        }
        int random = StdRandom.uniform(size);
        Item itemToReturn = array[random];
        array[random] = array[size - 1];
        array[size - 1] = null;
        size--;

        if (size <= array.length / 4 && array.length > INITIAL_SIZE) {
            resize(array.length / 4);
        }

        return itemToReturn;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (size == 0) {
            throw new NoSuchElementException("Randomized Queue is empty");
        }

        int random = StdRandom.uniform(size);
        return array[random];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new RandomizedIterator();
    }

    // unit testing (required)
    public static void main(String[] args) {

        RandomizedQueue<String> randomizedQueue2 = new RandomizedQueue<>();
        RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<>();

        System.out.println(randomizedQueue.size(1) == 0);
        randomizedQueue.enqueue(1);
        System.out.println(randomizedQueue.size(1) == 1);
        randomizedQueue.enqueue(2);
        System.out.println(randomizedQueue.size(1) == 2);
        randomizedQueue.enqueue(3);
        System.out.println(randomizedQueue.size(1) == 3);
        randomizedQueue.enqueue(4);
        System.out.println(randomizedQueue.size(1) == 4);
        randomizedQueue.enqueue(5);
        System.out.println(randomizedQueue.size(1) == 5);
        randomizedQueue.enqueue(6);
        System.out.println(randomizedQueue.size(1) == 6);
        randomizedQueue.enqueue(7);
        System.out.println(randomizedQueue.size(1) == 7);
        randomizedQueue.enqueue(8);
        System.out.println(randomizedQueue.size(1) == 8);
        randomizedQueue.enqueue(9);
        System.out.println(randomizedQueue.size(1) == 9);
        randomizedQueue.enqueue(10);
        System.out.println(randomizedQueue.size(1) == 10);
        randomizedQueue.enqueue(11);
        System.out.println(randomizedQueue.size(1) == 11);
        randomizedQueue.enqueue(12);
        System.out.println(randomizedQueue.size(1) == 12);

        int i = 0;
        for (Integer item : randomizedQueue) {
            i++;
            if (i > 10) {
                break;
            }
            System.out.print("\t" + item);
        }
        System.out.println();

        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 11);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 10);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 9);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 8);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 7);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 6);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 5);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 4);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 3);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 2);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 1);
        System.out.println(randomizedQueue.dequeue());
        System.out.println(randomizedQueue.size(1) == 0);

        System.out.println(randomizedQueue.isEmpty());

        RandomizedQueue<Double> queue1 = new RandomizedQueue<>();
        for (int j = 0; j < 100; j++) {
            queue1.enqueue(StdRandom.uniform(0.0, 10.0));
        }

        int queue1Size = 0;
        for (Double element : queue1) {
            queue1Size++;
            StdOut.print(element + " ");
        }
        StdOut.println();
        StdOut.println("Total elements read was " + queue1Size);

        int n = 5;
        RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
        for (int j = 0; j < n; j++)
            queue.enqueue(j);
        for (int a : queue) {
            for (int b : queue)
                StdOut.print(a + "-" + b + " ");
            StdOut.println();
        }
    }
}
