package problemsolving.leetcode.datastructures.lists.swapNodesInKGroups;

public class SwapNodesInKGroups {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override public String toString() {
            return "val=" + val;
        }
    }

    // In Leet Code version they don't want to sort the last group if it's under length of k
    public boolean IS_LEET_CODE_PROBLEM = true;
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }

        ListNode newHead = null;
        ListNode previous = null;
        ListNode current = head;

        ListNode prevGroupTailAfterReversed = null;
        ListNode currGroupTailAfterReversed = null;

        while (current != null) {
            int i = 0;
            currGroupTailAfterReversed = current; // This is going to be tail after reversed

            // This if condition is solely for LeetCode, in leet code problem they don't
            if(IS_LEET_CODE_PROBLEM && !isKElementsPresentAhead(current, k)) {
                if (prevGroupTailAfterReversed != null) {
                    prevGroupTailAfterReversed.next = current;
                }
                if (newHead == null) {
                    newHead = head;
                }
                break;
            }

            while (i < k && current != null) {
                ListNode next = current.next;

                current.next = previous;

                previous = current;
                current = next;
                i++;
            }

            // Created this variable for readability
            ListNode currGroupHeadAfterReversed = previous;

            if (prevGroupTailAfterReversed != null) {
                prevGroupTailAfterReversed.next = currGroupHeadAfterReversed;
            } else {
                newHead = currGroupHeadAfterReversed;
            }

            prevGroupTailAfterReversed = currGroupTailAfterReversed;
        }

        if (!IS_LEET_CODE_PROBLEM || current == null) {
            currGroupTailAfterReversed.next = null;
        }
        return newHead;
    }

    private boolean isKElementsPresentAhead(ListNode current, int k) {
        int i = 0;
        while (i < k && current != null) {
            current = current.next;
            i++;
        }
        return i == k;
    }
}
