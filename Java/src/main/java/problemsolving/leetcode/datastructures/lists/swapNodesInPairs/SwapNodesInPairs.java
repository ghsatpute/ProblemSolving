package problemsolving.leetcode.datastructures.lists.swapNodesInPairs;

public class SwapNodesInPairs {
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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        ListNode previousFirst = null;
        head = second;

        while (first != null && second != null) {
            first.next = second.next;
            second.next = first;
            if (previousFirst != null) previousFirst.next = second;

            previousFirst = first;
            first = first.next;
            second = first != null ? first.next : null;
        }
        return head;
    }
}
