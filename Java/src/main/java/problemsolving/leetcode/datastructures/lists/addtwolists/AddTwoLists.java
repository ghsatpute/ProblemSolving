package problemsolving.leetcode.datastructures.lists.addtwolists;

public class AddTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = addTwoLists(l1, l2, 0);

        int length1 = calculateLength(l1);
        int length2 = calculateLength(l2);

        System.out.println("List 1 length is " + length1 + " & list 2 length is " + length2);

        return result;
    }

    private ListNode addTwoLists(ListNode list1, ListNode list2, int carry) {
        if (list1 == null && list2 == null && carry == 0) {
            return null;
        }

        if (list1 == null && list2 == null && carry != 0) {
            return new ListNode(carry, null);
        }

        int sum = 0;
        if (list1 != null) {
            sum += list1.val;
        }

        if (list2 != null) {
            sum += list2.val;
        }

        sum += carry;

        int carryNext = 0;
        if (sum > 9) {
            sum = sum % 10;
            carryNext = 1;
        }

        ListNode result = addTwoLists(
                list1 != null ? list1.next : null,
                list2 != null ? list2.next : null,
                carryNext);

        return new ListNode(sum, result);
    }

    private int calculateLength(ListNode list) {
        if (list == null) {
            return 0;
        }
        int length = 1;
        ListNode current = list;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        return length;
    }
}
