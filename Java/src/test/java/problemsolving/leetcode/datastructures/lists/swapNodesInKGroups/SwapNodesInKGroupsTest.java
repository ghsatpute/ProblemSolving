package problemsolving.leetcode.datastructures.lists.swapNodesInKGroups;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInKGroupsTest {

    @Test
    public void testSwapKNodesInGroups_nullInput_shouldReturnNull() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(null, 5);

        assertNull(result);
    }

    @Test
    public void testSwapKNodesInGroups_singleNode_shouldReturnSingleNode() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(5, null);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(head, 5);

        assertEquals(head, result);
        assertNull(result.next);
    }

    @Test
    public void testSwapKNodesInGroups_twoNodeListAndSizeLessThanK_shouldReturnReversedList() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, null);
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(head, 5);

        assertEquals(result, second);
        assertEquals(result.next, head);
        assertNull(result.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_leetCodeVersion_twoNodeListAndSizeLessThanK_shouldReturnReversedList() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = true;
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, null);
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(head, 5);

        assertEquals(result, head);
        assertEquals(result.next, second);
        assertNull(result.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_threeNodeListAndSizeLessThanK() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, null);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(head, 5);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(head, result.next.next);
        assertNull(result.next.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_leetCodeVersion_threeNodeListAndSizeLessThanK() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = true;
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, null);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(head, 5);

        assertEquals(head, result);
        assertEquals(second, result.next);
        assertEquals(third, result.next.next);
        assertNull(result.next.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_twoGroupsOfKSize() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, null);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode first = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(first, 3);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(first, result.next.next);

        assertEquals(six, result.next.next.next);
        assertEquals(five, result.next.next.next.next);
        assertEquals(four, result.next.next.next.next.next);
        assertNull(result.next.next.next.next.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_threeGroupsOfKSize() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;

        SwapNodesInKGroups.ListNode nine = new SwapNodesInKGroups.ListNode(9, null);
        SwapNodesInKGroups.ListNode eight = new SwapNodesInKGroups.ListNode(8, nine);
        SwapNodesInKGroups.ListNode seven = new SwapNodesInKGroups.ListNode(7, eight);
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, seven);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode first = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(first, 3);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(first, result.next.next);

        assertEquals(six, result.next.next.next);
        assertEquals(five, result.next.next.next.next);
        assertEquals(four, result.next.next.next.next.next);

        assertEquals(nine, result.next.next.next.next.next.next);
        assertEquals(eight, result.next.next.next.next.next.next.next);
        assertEquals(seven, result.next.next.next.next.next.next.next.next);

        assertNull(result.next.next.next.next.next.next.next.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_leetCodeVersion_threeGroupsOfKSize() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = true;

        SwapNodesInKGroups.ListNode nine = new SwapNodesInKGroups.ListNode(9, null);
        SwapNodesInKGroups.ListNode eight = new SwapNodesInKGroups.ListNode(8, nine);
        SwapNodesInKGroups.ListNode seven = new SwapNodesInKGroups.ListNode(7, eight);
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, seven);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode first = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(first, 3);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(first, result.next.next);

        assertEquals(six, result.next.next.next);
        assertEquals(five, result.next.next.next.next);
        assertEquals(four, result.next.next.next.next.next);

        assertEquals(nine, result.next.next.next.next.next.next);
        assertEquals(eight, result.next.next.next.next.next.next.next);
        assertEquals(seven, result.next.next.next.next.next.next.next.next);

        assertNull(result.next.next.next.next.next.next.next.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_threeGroupsOfKSizeAndChange() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;

        SwapNodesInKGroups.ListNode nine = new SwapNodesInKGroups.ListNode(9, null);
        SwapNodesInKGroups.ListNode eight = new SwapNodesInKGroups.ListNode(8, nine);
        SwapNodesInKGroups.ListNode seven = new SwapNodesInKGroups.ListNode(7, eight);
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, seven);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode three = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode two = new SwapNodesInKGroups.ListNode(2, three);
        SwapNodesInKGroups.ListNode one = new SwapNodesInKGroups.ListNode(1, two);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(one, 5);

        assertEquals(five, result);
        assertEquals(four, result.next);
        assertEquals(three, result.next.next);
        assertEquals(two, result.next.next.next);
        assertEquals(one, result.next.next.next.next);

        assertEquals(nine, result.next.next.next.next.next);
        assertEquals(eight, result.next.next.next.next.next.next);
        assertEquals(seven, result.next.next.next.next.next.next.next);
        assertEquals(six, result.next.next.next.next.next.next.next.next);

        assertNull(result.next.next.next.next.next.next.next.next.next);
    }

    @Test
    public void testSwapKNodesInGroups_leetCodeVersion_threeGroupsOfKSizeAndChange() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = true;

        SwapNodesInKGroups.ListNode nine = new SwapNodesInKGroups.ListNode(9, null);
        SwapNodesInKGroups.ListNode eight = new SwapNodesInKGroups.ListNode(8, nine);
        SwapNodesInKGroups.ListNode seven = new SwapNodesInKGroups.ListNode(7, eight);
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, seven);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode three = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode two = new SwapNodesInKGroups.ListNode(2, three);
        SwapNodesInKGroups.ListNode one = new SwapNodesInKGroups.ListNode(1, two);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup(one, 5);

        assertEquals(five, result);
        assertEquals(four, result.next);
        assertEquals(three, result.next.next);
        assertEquals(two, result.next.next.next);
        assertEquals(one, result.next.next.next.next);

        assertEquals(six, result.next.next.next.next.next);
        assertEquals(seven, result.next.next.next.next.next.next);
        assertEquals(eight, result.next.next.next.next.next.next.next);
        assertEquals(nine, result.next.next.next.next.next.next.next.next);

        assertNull(result.next.next.next.next.next.next.next.next.next);
    }


    @Test
    public void testReverseKGroup2_nullInput_shouldReturnNull() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(null, 5);

        assertNull(result);
    }

    @Test
    public void testReverseKGroup2_singleNode_shouldReturnSingleNode() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();

        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(5, null);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(head, 5);

        assertEquals(head, result);
        assertNull(result.next);
    }

    @Test
    public void testReverseKGroup2_twoNodeListAndSizeLessThanK_shouldReturnReversedList() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, null);
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(head, 5);

        assertEquals(result, second);
        assertEquals(result.next, head);
        assertNull(result.next.next);
    }

    @Test
    public void testReverseKGroup2_threeNodeListAndSizeLessThanK() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, null);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode head = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(head, 5);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(head, result.next.next);
        assertNull(result.next.next.next);
    }

    @Test
    public void testReverseKGroup2_twoGroupsOfKSize() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        swap.IS_LEET_CODE_PROBLEM = false;
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, null);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode first = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(first, 3);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(first, result.next.next);

        assertEquals(six, result.next.next.next);
        assertEquals(five, result.next.next.next.next);
        assertEquals(four, result.next.next.next.next.next);
        assertNull(result.next.next.next.next.next.next);
    }

    @Test
    public void testReverseKGroup2_kIsOne() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, null);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode first = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(first, 1);

        assertEquals(first, result);
        assertEquals(second, result.next);
        assertEquals(third, result.next.next);
        assertEquals(four, result.next.next.next);
        assertEquals(five, result.next.next.next.next);
        assertEquals(six, result.next.next.next.next.next);
        assertNull(result.next.next.next.next.next.next);
    }

    @Test
    public void testReverseKGroup2_threeGroupsOfKSize() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();

        SwapNodesInKGroups.ListNode nine = new SwapNodesInKGroups.ListNode(9, null);
        SwapNodesInKGroups.ListNode eight = new SwapNodesInKGroups.ListNode(8, nine);
        SwapNodesInKGroups.ListNode seven = new SwapNodesInKGroups.ListNode(7, eight);
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, seven);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode third = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode second = new SwapNodesInKGroups.ListNode(2, third);
        SwapNodesInKGroups.ListNode first = new SwapNodesInKGroups.ListNode(1, second);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(first, 3);

        assertEquals(third, result);
        assertEquals(second, result.next);
        assertEquals(first, result.next.next);

        assertEquals(six, result.next.next.next);
        assertEquals(five, result.next.next.next.next);
        assertEquals(four, result.next.next.next.next.next);

        assertEquals(nine, result.next.next.next.next.next.next);
        assertEquals(eight, result.next.next.next.next.next.next.next);
        assertEquals(seven, result.next.next.next.next.next.next.next.next);

        assertNull(result.next.next.next.next.next.next.next.next.next);
    }

    @Test
    public void testReverseKGroup2_threeGroupsOfKSizeAndChange() {
        SwapNodesInKGroups swap = new SwapNodesInKGroups();

        SwapNodesInKGroups.ListNode nine = new SwapNodesInKGroups.ListNode(9, null);
        SwapNodesInKGroups.ListNode eight = new SwapNodesInKGroups.ListNode(8, nine);
        SwapNodesInKGroups.ListNode seven = new SwapNodesInKGroups.ListNode(7, eight);
        SwapNodesInKGroups.ListNode six = new SwapNodesInKGroups.ListNode(6, seven);
        SwapNodesInKGroups.ListNode five = new SwapNodesInKGroups.ListNode(5, six);
        SwapNodesInKGroups.ListNode four = new SwapNodesInKGroups.ListNode(4, five);
        SwapNodesInKGroups.ListNode three = new SwapNodesInKGroups.ListNode(3, four);
        SwapNodesInKGroups.ListNode two = new SwapNodesInKGroups.ListNode(2, three);
        SwapNodesInKGroups.ListNode one = new SwapNodesInKGroups.ListNode(1, two);

        SwapNodesInKGroups.ListNode result = swap.reverseKGroup2(one, 5);

        assertEquals(five, result);
        assertEquals(four, result.next);
        assertEquals(three, result.next.next);
        assertEquals(two, result.next.next.next);
        assertEquals(one, result.next.next.next.next);

        assertEquals(nine, result.next.next.next.next.next);
        assertEquals(eight, result.next.next.next.next.next.next);
        assertEquals(seven, result.next.next.next.next.next.next.next);
        assertEquals(six, result.next.next.next.next.next.next.next.next);

        assertNull(result.next.next.next.next.next.next.next.next.next);
    }
}