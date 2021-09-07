package cs103.project;

import java.util.List;

/*
Date su “glave” (“heads”) jednostruko povezane liste headA i headB. 
Vratiti “čvor” (“node”) u kojem se dve liste ukrštaju.
Ukoliko 2 povezane liste nemaju ukrštanje vratiti vrednost null.
*/

public class IntersectionLinkedLists {

    List<Integer> listA;
    List<Integer> listB;
    int skipA, skipB;
    int intersectVal = 0;

//  Definition for singly-linked list.
    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        if (headA == null || headB == null) {
            return null;
        }

        while (pointer1 != pointer2) {

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

            if (pointer1 == pointer2) {
                return pointer1;
            }

            if (pointer1 == null) {
                pointer1 = headB;
            }

            if (pointer2 == null) {
                pointer2 = headA;
            }
        }

        return pointer1;
    }

}
