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
    public ListNode middleNode(ListNode head) {
        
        int s = 0;
        ListNode temp = head;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        
        int mid = s/2;
        while(mid-->0){
            head=head.next;
        }
        return head;
        
    }
}

// 5/2=2