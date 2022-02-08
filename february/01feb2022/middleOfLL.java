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
// https://leetcode.com/problems/middle-of-the-linked-list/

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

/*
Second Approach: Using Two pointers

Let's think of a scenario where you have a field 200m long and there are two people, A is running with 1x speed and B is running with 2x, so at any given point A will be at half of what B has reached.

Say both starts at 0m, when Person B reaches 50m then Person A will be at 25m. When Person B reaches 100m then Person A will be at 50m.

After sometime If Person B reaches 200m then Person A will be at 100m.
Hence Person A is at mid of the field, when B reaches the end.

In order to solve this problem, we are going to use Two pointers, one pointer which moves with 1x speed and another one with 2x speed.

In this case Time Complexity will be O(N) and Space Complexity will be O(1).

*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}