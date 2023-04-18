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
// https://leetcode.com/problems/palindrome-linked-list/
class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> q = new ArrayDeque<>();
        while(head!=null){
            q.add(head);
            head=head.next;
        }
        
        while(q.size()>1){
            if(q.pollFirst().val!=q.pollLast().val)
                return false;
         }
        return true;
    }
}

/*********************************************/
// space O(1)

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
        
        ListNode slow = head , fast = head;
        
        //placing slow to middle of LL
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reverse right half of LL
        slow.next = reverseList(slow.next);
        
        //move slow to one step further
        slow = slow.next;
        
        //now make dummynode from start of LL ,
        // and slow is at new middle(which is reversed),
        // so dummynode and slow slow should be equal if not then it is not palindrome
        
        ListNode dummy = head;
        while(slow!=null){
            if(slow.val!=dummy.val){
                return false;
            }
            slow=slow.next;
            dummy=dummy.next;
        }
        
        return true;
        
         
        
    }
    public ListNode reverseList(ListNode head){
        
        
        ListNode newHead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
            
        }
        return newHead;
        
        
    }
}