package LinkedListCycle;

import java.util.*;

public class Solution {

    public static boolean hasCycle(ListNode head) {
        // solution with 0(1) space complexity
        if (head == null || head.next == null) return false;


        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;





       /* Set<ListNode> visitedNodes = new HashSet<>();
        ListNode current = new ListNode(-1);

        current = head;

        while (current != null){
            if (!visitedNodes.add(current)){
                return true;
            }
            current = current.next;

        }

        return false;*/
    }

    public static void main(String[] args) {
        // 141. Linked List Cycle
        // https://leetcode.com/problems/linked-list-cycle/
        // test case 1
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        System.out.println(hasCycle(head));


    }
}
