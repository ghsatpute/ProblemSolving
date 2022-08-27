import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        private Item data;
        private Node next;
        private Node previous;
    }

    private class DequeIterator implements Iterator<Item> {

        private Node current;

        private DequeIterator() {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (current == null) {
                throw new NoSuchElementException("Cannot call next when current is null");
            }
            Node itemToReturn = current;
            current = current.next;

            return itemToReturn.data;
        }

        public void remove() {
            throw new UnsupportedOperationException(
                    "Removing items while iterator is being used is not supported");
        }
    }

    // construct an empty deque
    public Deque() {
    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item to be added cannot be null");
        }

        if (first == null) {
            first = new Node();
            first.data = item;

            last = first;
        }
        else {
            Node newCurrent = new Node();
            newCurrent.data = item;
            newCurrent.next = first;

            first.previous = newCurrent;

            first = newCurrent;
        }

        size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item to be added cannot be null");
        }

        if (last == null) {
            last = new Node();
            last.data = item;

            first = last;
        }
        else {
            Node newLast = new Node();
            newLast.data = item;
            newLast.previous = last;

            last.next = newLast;
            last = newLast;
        }

        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (first == null) {
            throw new NoSuchElementException("First is empty. Cannot remove it.");
        }

        size--;

        if (first == last) {
            Item itemToRemove = first.data;

            first = null;
            last = null;

            return itemToRemove;
        }

        Item itemToRemove = first.data;
        first = first.next;
        first.previous = null;

        return itemToRemove;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (last == null) {
            throw new NoSuchElementException("First is empty. Cannot remove it.");
        }

        size--;

        if (first == last) {
            Item itemToRemove = last.data;

            first = null;
            last = null;

            return itemToRemove;
        }

        Item itemToRemove = last.data;

        last = last.previous;
        last.next = null;

        return itemToRemove;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    // unit testing (required)
    public static void main(String[] args) {
        System.out.println("================ 1 =======================");
        Deque<Integer> deque = new Deque<>();

        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(!deque.isEmpty());
        System.out.println(deque.size() == 2);
        System.out.println(deque.removeFirst() == 1);
        System.out.println(deque.size() == 1);
        System.out.println(deque.removeFirst() == 2);
        System.out.println(deque.size() == 0);
        System.out.println(deque.isEmpty());

        System.out.println("================ 2 =======================");

        Deque<Integer> deque1 = new Deque<>();

        deque1.addLast(2);
        deque1.addFirst(1);
        System.out.println(deque1.removeFirst() == 1);
        System.out.println(deque1.removeFirst() == 2);

        System.out.println("================ 3 =======================");

        Deque<Integer> deque2 = new Deque<>();

        deque2.addLast(2);
        System.out.println(deque2.removeFirst() == 2);

        System.out.println("================ 4 =======================");

        Deque<Integer> deque3 = new Deque<>();

        deque3.addFirst(1);
        System.out.println(deque3.removeLast() == 1);

        System.out.println("================ 5 =======================");

        Deque<Integer> deque4 = new Deque<>();
        deque4.addFirst(2);
        deque4.addFirst(1);
        deque4.addLast(3);
        deque4.addLast(4);
        deque4.addLast(5);
        deque4.addFirst(0);

        System.out.println("================ 6 =======================");

        for (int i : deque4) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}