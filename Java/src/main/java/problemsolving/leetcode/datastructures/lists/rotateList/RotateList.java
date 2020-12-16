package problemsolving.leetcode.datastructures.lists.rotateList;

public class RotateList {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k < 1) {
                return head;
            }

            int len = 1;
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
                len++;
            }

            ListNode last = current;

            System.out.println(len);

            k = k % len;
            if (k == 0) {
                return head;
            }

            ListNode prev = head;
            current = head.next;
            int i = 1;
            while (i != (len - k)) {
                prev = current;
                current = current.next;
                i++;
            }

            prev.next = null;
            last.next = head;
            return current;
        }
    }
}
