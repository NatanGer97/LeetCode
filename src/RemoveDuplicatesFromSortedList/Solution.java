package RemoveDuplicatesFromSortedList;

public class Solution {



    public static  ListNode deleteDuplicates(ListNode head) {

        ListNode currPtr = head;
        while (currPtr != null) {
            ListNode tempPtr = currPtr;
            while (tempPtr != null && tempPtr.val == currPtr.val) {
                tempPtr = tempPtr.next;
            }

            currPtr.next = tempPtr; // deletion
            // move to next node
            currPtr = currPtr.next;

        }

        return currPtr;





    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
      /*  ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(1)*/;
        listNode.next = listNode1;
        listNode1.next = listNode3;
       /* listNode3.next = listNode4;
        listNode4.next = listNode5;*/

        ListNode listNode2 = deleteDuplicates(listNode);
        while (listNode2 != null){
            System.out.println(listNode2.val);
            listNode2 = listNode2.next;
        }

    }
}
