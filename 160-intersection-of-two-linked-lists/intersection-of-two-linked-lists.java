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
        //Brute Froce
        // HashMap<ListNode,Integer> map=new HashMap<>();
        // ListNode temp1=headA;
        // ListNode temp2=headB;
        // while(temp1!=null)
        // {
        //     map.put(temp1,1);
        //     temp1=temp1.next;
        // }
        // while(temp2!=null)
        // {
        //     if(map.containsKey(temp2))
        //     {
        //        return temp2;
        //     }
        //     temp2=temp2.next;
        // }
        // return null;
        ListNode temp1=headA;
        ListNode temp2=headB;
        int cnt1=0, cnt2=0;
        while(temp1!=null)
        {
            cnt1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            cnt2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(cnt1>cnt2)
        {
            while(cnt1>cnt2 && temp1!=null)
            {
                temp1=temp1.next;
                cnt1--;
            }
        }
        else
        {
            while(cnt2>cnt1 && temp2!=null)
            {
                temp2=temp2.next;
                cnt2--;
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