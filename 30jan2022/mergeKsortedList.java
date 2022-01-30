
class Solution {
        //time: O(n), space=O(n)

    public ListNode mergeKLists(ListNode[] lists) {
        // if(lists.length==0) return lists;
        ListNode ans=new ListNode(0);
        ListNode sans = ans;
        // if(sans.next==null)
        // System.out.println(sans);
        for(int i=0;i<lists.length;i++){
            
           sans.next = merge(sans.next,lists[i]);
            
            // sans = sans.next;
            
        }
        return ans.next;
    }
    public static ListNode merge(ListNode l1, ListNode l2){
        if(l1==null) {
            // System.out.println("null");
            return l2;
        }
        if(l2==null) return l1;

        ListNode ans= new ListNode(0);
        ListNode prev=ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                prev.next = l1;
                l1=l1.next;
            }else{
                prev.next=l2;
                l2=l2.next;
            }
            prev = prev.next;
            
        }
        
        if(l1!=null) {
            prev.next = l1;
        }
        if(l2!=null){
            prev.next = l2;
        }
        return ans.next;
    }
}