/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(slow!=null)
        {
            if(fast==null || fast.next==null)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
             return true;
        }
        return false;
    }
}