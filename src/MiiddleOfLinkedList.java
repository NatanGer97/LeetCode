public class MiiddleOfLinkedList {
    class ListNode
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
    public ListNode middleNode(ListNode head)
    {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        int listSize = 0;
        while (fastPtr != null && fastPtr.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

}
