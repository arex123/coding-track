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

// https://leetcode.com/problems/sort-list/
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode m = mid(head); //finding middle of LL
        ListNode afterMid = m.next; //saving nodes after mid in afterMid
        m.next = null; //now spliting the head from start to mid and mid+1 to end
        
        ListNode l = sortList(head);
        ListNode r = sortList(afterMid);
        
        return merge(l,r);
        
        
        
    }
    //finding middle of linkedlist
    public ListNode mid(ListNode head){
        if(head==null || head.next==null) return head;
        
        ListNode slow = head,fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
        
        
    } 
    //merging two sorted linkedlist
    public ListNode merge(ListNode first,ListNode second){
        
        if(first==null) return second;
        if(second==null) return first;
        
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(first!=null && second!=null){
            if(first.val<second.val){
                temp.next = first;
                first=first.next;
            }else{
                temp.next = second;
                second=second.next;
            }
            temp=temp.next;
            
        }
        
        if(first!=null){
            temp.next = first;
        }
        if(second!=null){
            temp.next = second;
        }
        return dummy.next;
        
        
    }
    
    
}



















