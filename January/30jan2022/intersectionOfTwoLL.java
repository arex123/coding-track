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
        if(headA==null && headB==null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a!=b){
            
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
            
        }
        
        return a;
        
    }
}

/*
2nd solution by finding length

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=length(headA),l2=length(headB);
        
        while(l1>l2){
            headA = headA.next;
            l1--;
        }
        while(l2>l1){
            headB = headB.next;
            l2--;
        }
        
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        
        return headA;
        
        
    }
    private int length(ListNode node) {
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
}
*/