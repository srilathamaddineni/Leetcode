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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reversedSecondHalf=reverse(slow);
        ListNode firstHalfPointer=head;
        ListNode secondHalfPointer=reversedSecondHalf;
        while(secondHalfPointer!=null)
        {
            if(firstHalfPointer.val!=secondHalfPointer.val)
            {
                return false;
            }
            firstHalfPointer=firstHalfPointer.next;
            secondHalfPointer=secondHalfPointer.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode nxt=new ListNode();
        if(head==null)
        {
            return null;
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