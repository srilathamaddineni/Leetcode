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
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int val1=(l1==null)?0:l1.val;
            int val2=(l2==null)?0:l2.val;
            int val3=val1+val2+carry;
            carry=val3/10;
            curr.next=new ListNode(val3%10);
            curr=curr.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }

        return reverse(dummy.next);

    }
    public ListNode reverse(ListNode l1)
    {
        if(l1==null)
        {
            return null;
        }
        ListNode curr=l1;
        ListNode prev=null;
        ListNode temp=null;
        while(curr!=null)
        {
             temp=curr.next;
             curr.next=prev;
             prev=curr;
             curr=temp;
        }
        return prev;
    }
}