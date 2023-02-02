package IntersectionOfTwoLinkedLists;


import java.util.*;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Boolean> visitedNodes = new HashMap<>();

        while(headA != null){
            visitedNodes.put(headA,true);
            headA = headA.next;
        }

        while(headB != null) {
            if (visitedNodes.containsKey(headB))
            {
                return headB;
            }
            headB = headB.next;
        }
        return null;

    }


}
