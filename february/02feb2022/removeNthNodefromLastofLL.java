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
        int s = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            s++;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        for(int i=0;i<s-n;i++){
            node.next = head;
            head = head.next;
            node = node.next;
        }
        node.next = head.next;
        return dummy.next;
        
    }
}