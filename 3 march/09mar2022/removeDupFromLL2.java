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
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap();
        ListNode temp=head;
        while(temp!=null){
            int v=temp.val;
            map.put(v,map.getOrDefault(v,0)+1);
            temp=temp.next;
            }
        ListNode ans = new ListNode(-1);
        ListNode t1=ans;
      	temp=head;
        while(temp!=null){
            if(map.get(temp.val)==1){
                t1.next=temp;
                t1=t1.next;
            }else{
                t1.next=null;
            }
            temp=temp.next;
        }
                
                return ans.next;
        
    }
}