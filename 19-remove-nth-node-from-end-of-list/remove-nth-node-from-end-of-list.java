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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head!=null)
        {
            
        }
        ListNode current=new ListNode();
        ListNode prev=null;
        current =head;
        int cnt=0;
        
        while(current!=null)
        {
            current=current.next;
            cnt++;
        }
        System.out.println(cnt);
        int target=cnt-n;
        ListNode curr=head;
        if(target==0)
        {
            return head.next;
        }
        int counter=1;

        while(counter<target)
        {
            curr=curr.next;
            counter++;      
        }
        curr.next=curr.next.next;
        return head;
    }
}