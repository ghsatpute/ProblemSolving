package problemsolving.leetcode.datastructures.lists.mergeKLists;

public class MergeKLists {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int[] listPointers = new int[lists.length];
        ListNode head = null;
        ListNode tail = null;
        while (true) {
            ListNode minimumNode = null;
            int minIndex = 0;
            for (int i = 0; i < lists.length; i++) {

                if ((minimumNode == null && lists[i] != null)
                        || (lists[i] != null  && lists[i].val < minimumNode.val)) {
                    minimumNode = lists[i];
                    minIndex = i;
                }
            }
            if (minimumNode == null) {
                break;
            }
            System.out.println(minimumNode.val);
            if (head == null) {
                head = minimumNode;
                tail = minimumNode;
            } else {
                tail.next = minimumNode;
                tail = minimumNode;
            }

            lists[minIndex] = minimumNode.next;
            minimumNode.next = null;
        }
        return head;
    }
}
