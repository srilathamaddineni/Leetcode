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
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            cnt++;
        }
        int index=cnt-n;
        if(index==0)
        {
            return head.next;
        }
        cnt=0;
        temp=head;
        while(cnt<index-1)
        {
           temp=temp.next;
           cnt++;
        }
        temp.next=(temp.next!=null)?temp.next.next:null;
        return head;
    }
}