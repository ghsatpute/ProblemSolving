package problemsolving.problems.logic;

public class FlatteningTheLinkedList {
    // https://www.geeksforgeeks.org/flattening-a-linked-list/
    public static class ListNode {
        public int data;
        public ListNode next;
        public ListNode down;

        public ListNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + "";
        }
    }

    public static ListNode solve(ListNode head) {
        if (head == null) {
            return null;
        }

        while (head.next != null) {
            ListNode list2 = head.next;
            head.next = list2.next;
            list2.next = null;
            head = merge(head, list2);
        }
        return head;
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode tail = null;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                if (head == null) {
                    head = list1;
                    tail = list1;
                } else {
                    tail.down = list1;
                    tail = tail.down;
                }
                list1 = list1.down;
            } else {
                if (head == null) {
                    head = list2;
                    tail = list2;
                } else {
                    tail.down = list2;
                    tail = tail.down;
                }
                list2 = list2.down;
            }
        }

        if (list2 != null) {
            tail.down = list2;
        }
        if (list1 != null) {
            tail.down = list1;
        }
        return head;
    }
}
