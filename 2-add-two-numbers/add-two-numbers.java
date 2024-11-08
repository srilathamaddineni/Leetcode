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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=l1;
        ListNode l4=l2;
        int carry=0;
        ListNode head=new ListNode(0);
        ListNode current=head;
        while(l3!=null || l4!=null)
        {   int x=0,y=0;
              if(l3==null)x=0;
              else x=l3.val;
              if(l4==null)y=0;
              else y=l4.val;
              int value=x+y+carry;
              carry=value/10;
              current.next=new ListNode(value%10);
              current=current.next;
              if(l3!=null)
              {
                l3=l3.next;
              }
              if(l4!=null)
              {
                l4=l4.next;
              }
              
        }
        if(carry!=0)
        {
            current.next=new ListNode(carry);
        }
       
        return head.next;
    }
    public ListNode reverse(ListNode l1)
    {
        ListNode prev=null;
        ListNode curr=l1;
        ListNode nxt=new ListNode();
        if(l1==null)
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