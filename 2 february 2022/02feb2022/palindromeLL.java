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
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> q = new ArrayDeque<>();
        while(head!=null){
            q.add(head);
            head = head.next;
        }
        
        while(q.size()!=1 && q.size()!=0 ){
            if(q.removeFirst().val!=q.removeLast().val){
                return false;
            }
        }
        
        return true;
    }
}