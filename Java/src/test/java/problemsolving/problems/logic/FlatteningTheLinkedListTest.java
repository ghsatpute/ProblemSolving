package problemsolving.problems.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlatteningTheLinkedListTest {
    @Test
    public void testCase01() {
        FlatteningTheLinkedList.ListNode one = new FlatteningTheLinkedList.ListNode(1);
        FlatteningTheLinkedList.ListNode three = new FlatteningTheLinkedList.ListNode(3);
        FlatteningTheLinkedList.ListNode six = new FlatteningTheLinkedList.ListNode(6);

        one.down = three;
        three.down = six;

        FlatteningTheLinkedList.ListNode five = new FlatteningTheLinkedList.ListNode(5);
        FlatteningTheLinkedList.ListNode eight = new FlatteningTheLinkedList.ListNode(8);
        FlatteningTheLinkedList.ListNode nine = new FlatteningTheLinkedList.ListNode(9);

        five.down = eight;
        eight.down = nine;

        FlatteningTheLinkedList.ListNode seven = new FlatteningTheLinkedList.ListNode(7);
        FlatteningTheLinkedList.ListNode eleven = new FlatteningTheLinkedList.ListNode(11);

        seven.down = eleven;

        one.next = five;
        five.next = seven;

        FlatteningTheLinkedList.ListNode flattenedList = FlatteningTheLinkedList.solve(one);

        assertEquals(1, flattenedList.data);
        assertEquals(3, flattenedList.down.data);
        assertEquals(5, flattenedList.down.down.data);
        assertEquals(6, flattenedList.down.down.down.data);
        assertEquals(7, flattenedList.down.down.down.down.data);
        assertEquals(8, flattenedList.down.down.down.down.down.data);
        assertEquals(9, flattenedList.down.down.down.down.down.down.data);
        assertEquals(11, flattenedList.down.down.down.down.down.down.down.data);
    }
}