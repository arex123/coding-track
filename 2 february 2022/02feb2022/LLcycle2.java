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
// https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(true && head!=null){
            if(set.contains(head)){
                return head;
            }else{
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
}

// space O(1)
public ListNode detectCycle(ListNode head) {
        
    ListNode slow = head, fast = head;
    
    while(fast!=null && fast.next!=null ){
        slow=slow.next;
        fast=fast.next.next;            
        if(slow==fast) break;
        
    }
    if(fast==null || fast.next==null) return null;
    
    while(head!=slow){
        head=head.next;
        slow=slow.next;
    }
    // System.out.println(head.val);
    return head;
    
    
    
    
}