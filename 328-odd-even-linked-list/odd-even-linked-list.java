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
    public ListNode oddEvenList(ListNode head) {
        int cnt=0;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode temp=head;
        while(temp!=null)
        {
            if((cnt+1)%2!=0)
            {
                ListNode newNode=new ListNode(temp.val);
                curr.next=newNode;
                curr=curr.next;
            }
            cnt++;
            temp=temp.next;
        }
        temp=head;
        cnt=0;
        while(temp!=null)
        {
           if((cnt+1)%2==0)
            {
                ListNode newNode=new ListNode(temp.val);
                curr.next=newNode;
                curr=curr.next;
            }
            cnt++;
            temp=temp.next;
        }
      return dummy.next;
    }
}