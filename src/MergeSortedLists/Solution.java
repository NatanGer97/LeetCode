/*
package MergeSortedLists;

import org.w3c.dom.*;

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



     public class Solution {
         public static void main(String[] args) {
             ListNode list1 = new ListNode();
             list1.val = 1;

         }
         public void addToTheLast(ListNode node)
         {
             if (head == null)
             {
                 head = node;
             }
             else
             {
                 Node temp = head;
                 while (temp.next != null)
                     temp = temp.next;
                 temp.next = node;
             }
         }

         */
/* Method to print linked list *//*

         void printList()
         {
             Node temp = head;
             while (temp != null)
             {
                 System.out.print(temp.data + " ");
                 temp = temp.next;
             }
             System.out.println();
         }

         public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
         {
            ListNode headRes = new ListNode();
            */
/* ListNode listNode1Ptr = list1;
            ListNode listNode2Ptr = list2;*//*

             ListNode tail = headRes;
            while (true)
            {
                if (list1.val <= list2.val)
                {
                    tail.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else {
                    tail.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                if (list1 == null){
                    tail.next = list2;
                    break;

                }
                if (list2 == null)
                {
                    tail.next = list1;
                    break;
                }
            }

            return headRes;
         }
     }
 }
*/
