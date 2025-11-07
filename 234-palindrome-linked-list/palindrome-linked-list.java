/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
               fast=fast.next.next;
               slow=slow.next;
        }
        if(fast!=null)slow=slow.next;
        ListNode p1=head;
        ListNode p2=reverseLinkedList(slow);
        while(p1!=null && p2!=null)
        {
            if(p1.val!=p2.val)
            {
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        
        return true;
    }
    public ListNode reverseLinkedList(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null, nxt=null;
        if(head==null || head.next==null)
        {
            return head;
        }
        while(curr!=null)
        {
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}