public /**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
// https://leetcode.com/problems/maximum-width-of-binary-tree/

class Solution {
   public static class Pair{
       TreeNode node=null;
       int idx = 0;
       Pair(int idx,TreeNode node){
           this.idx=idx;
           this.node=node;
       }
       
   }   
   
   public int widthOfBinaryTree(TreeNode root) {
       
       ArrayDeque<Pair> q = new ArrayDeque();
       q.add(new Pair(0,root));
       
       int max=0;

       
       while(q.size()>0){
           
           int size = q.size();
           int l = q.getFirst().idx;
           int r = q.getFirst().idx;
           
           while(size-->0){
               Pair rp = q.removeFirst();
               r=rp.idx;
               if(rp.node.left!=null)
                   q.add(new Pair(rp.idx*2+1,rp.node.left));
               
               if(rp.node.right!=null)
                   q.add(new Pair(rp.idx*2+2,rp.node.right));
               
               
           }
           max=Math.max(max,r-l+1);

           
       }
       
       return max;
   }
}