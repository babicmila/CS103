package cs103.project;

/**
 * Data je “glava” (“head”) jednostruko povezane liste. Rotirati listu u desno
 * za k mesta.
 */
public class RotateList {

    // Definition for singly-linked list.
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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        if (k == 0) {
            return head;
        }

        int size = 1;
        ListNode tail = head;

        while (tail.next != null) {

            tail = tail.next;
            size++;
        }

        tail.next = head;

        size = size - (k % size);

        for (int i = 0; i < size; i++) {
            tail = tail.next;
            head = head.next;
        }

        tail.next = null;

        return head;
    }

}
