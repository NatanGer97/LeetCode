class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
class Solution
{
    public boolean isPalindrome(ListNode head)
    {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        // we check fastPtr.next != null -> case we didnt reach to end
        while (fastPtr != null && fastPtr.next !=null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
            // second move
            fastPtr = fastPtr.next;
        }

        // reverse link list
        ListNode prev = reverseLinkList(slowPtr);


        // check if is a palindrome
        ListNode headPtr = head;
        ListNode tailPtr = prev;


        while (tailPtr != null)
        {
            if (headPtr.val != tailPtr.val) return  false;
            tailPtr = tailPtr.next;
            headPtr = headPtr.next;
        }

        return true;





    }

    private ListNode reverseLinkList(ListNode slowPtr) {
        ListNode prev = null;
        while (slowPtr != null)
        {
            ListNode currentNext = slowPtr.next;
            slowPtr.next = prev;
            prev = slowPtr;
            slowPtr = currentNext;
        }
        return prev;
    }
}

