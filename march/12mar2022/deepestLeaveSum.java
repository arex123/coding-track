/**
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

// https://leetcode.com/problems/deepest-leaves-sum/
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        /*
        problem: we have to find sum of depeest leave ,deepest there can be 1 leave or more than 1 in given example there are 2 leafs 7 and 8 at deepest level
        
        Ex:  [1,2,3,4,5,null,6,7,null,null,null,null,8]
        
        image of above example: https://assets.leetcode.com/uploads/2019/07/31/1483_ex1.png
        
        
        Approach: so in bfs we travel at every level
        so while traveling at certaing node keep sum variable 
        and if there is another next level then make sum=0
        and again start adding node to the sum
        
        */
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int s = q.size();
            
            sum=0;
            for(int i=0;i<s;i++){
                TreeNode temp = q.poll();
                
                sum+=temp.val;
                
                if(temp.left!=null) q.add(temp.left);
                
                if(temp.right!=null) q.add(temp.right);
                
                
            }
            
            
        }
        return sum;
        
        
    }
}


















