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
// https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val>l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        
        ListNode res = l1;
        while(l1!=null && l2!=null){
            ListNode temp = null;
            while(l1!=null && l1.val<=l2.val){
                temp = l1;
                l1 = l1.next;
            }
            
            temp.next = l2;
            
            //swap, we want to keep l1 small so if l2's head is small we will now say l2 is l1 now
            ListNode tm = l1;
            l1=l2;
            l2 = tm;
            
            
        }
        return res;
        
    }
}



















