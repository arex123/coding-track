import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int v1 = l1!=null?l1.val:0;
            int v2 = l2!=null?l2.val:0;
            int sum = carry + v1 + v2;
            carry = sum/10;
            
            ListNode t = new ListNode(sum%10);
            temp.next = t;
            temp = temp.next;
            
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        
        return ans.next;
        
    }  
    
    
    
}