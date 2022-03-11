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
// https://leetcode.com/problems/rotate-list/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        
        //finding the length
        ListNode curr = head;
        int len=1;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        //as now curr is pointing at null, curr is at last position of head, we will point it to head 
        
        //go to the kth node from last
        curr.next=head;
        k=k%len; //if k>len it will normalize k
        k=len-k; //to (k-1)th node will be the end node now
        
        while(k-->0)
        {
            curr=curr.next;
        }
        
        head=curr.next;//this is kth node from last
        curr.next = null;
        
        return head;
       
    }
   
}











