// https://leetcode.com/problems/all-paths-from-source-to-target/
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        /*
        [[1,2],[3],[3],[]] //this is what we are given
        so how this is graph
        
        every index is considered as node going to array
        like index 0 is going to  [1,2] 
        means node 0 is going to node 1 and node 2
        
        then 1 is going to 3
        
        then 2 is going to 3 
        
        then 3 is going to nowhere
        (for more details view look in its graph image link: https://assets.leetcode.com/uploads/2020/09/28/all_1.jpg)
        
        ->So basically we have to reach from 0 index to end of index
        we have to print all direction
        
        In above example we have to find all possible ways to reach 
        3 from 0,
        or simply say, 0 --> 3
        
        
        Ex-2: graph = [[4,3,1],[3,2,4],[3],[4],[]]
        (graph image link: https://assets.leetcode.com/uploads/2020/09/28/all_2.jpg)
        
        we have to find all path from 0 to 4
        
        */
        List<List<Integer>> ans = new ArrayList();
        List<Integer> sa = new ArrayList();
        sa.add(0);
        dfs(0,sa,ans,graph);
        return ans;
    }
    public void dfs(int src,List<Integer> sa,List<List<Integer>> ans,int[][] graph){
        if(src==graph.length-1){ //so when we will reach 0 to 3 we will add it to the answer
            ans.add(new ArrayList(sa));
            return;
        }
        
        //bactracking if found path then ok, nahi to add try then remove
        for(int a:graph[src]){
            sa.add(a);
            dfs(a,sa,ans,graph);
            sa.remove(sa.size()-1);//removing last element
        }
        
        
    }
}











