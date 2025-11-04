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
        // l1=reverse(l1);
        // l2=reverse(l2);
        // ListNode dummy=new ListNode(0);
        // ListNode curr=dummy;

        // int carry=0;
        // while(l1!=null || l2!=null || carry!=0)
        // {
        //     int val1=(l1==null)?0:l1.val;
        //     int val2=(l2==null)?0:l2.val;
        //     int val3=val1+val2+carry;
        //     carry=val3/10;
        //     curr.next=new ListNode(val3%10);
        //     curr=curr.next;
        //     if(l1!=null)l1=l1.next;
        //     if(l2!=null)l2=l2.next;
        // }

        // return reverse(dummy.next);

        //Using Stacks
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(l1!=null)
        {
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            st2.push(l2.val);
            l2=l2.next;
        }
        ListNode head=null;
        int carry=0;
        while(!st1.isEmpty() || !st2.isEmpty() || carry!=0)
        {
            int val1=(st1.isEmpty())?0:st1.peek();
            int val2=(st2.isEmpty())?0:st2.peek();
            int val3=val1+val2+carry;
            carry=val3/10;
            ListNode newNode=new ListNode(val3%10);
            newNode.next=head;
            head=newNode;
            if(!st1.isEmpty())st1.pop();
            if(!st2.isEmpty())st2.pop();

        }
        return head;

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