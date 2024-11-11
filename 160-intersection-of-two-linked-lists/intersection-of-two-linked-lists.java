/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0, lenB=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null)
        {
            temp1=temp1.next;
            lenA++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            lenB++;
        }
        temp1=headA;
        temp2=headB;
        while(lenA!=lenB)
        {
            if(lenA>lenB)
            {
                temp1=temp1.next;
                lenA--;
            }
            else
            {
                temp2=temp2.next;
                lenB--;
            }
        }
        while(temp1!=null && temp2!=null)
        {
            if(temp1==temp2)
            {
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}