// https://leetcode.com/problems/number-of-provinces/
class Solution {
    public int findCircleNum(int[][] isConnected) {
        //using BFS
        
        return helper(0,isConnected); //we are passing 0,count of provinces and adjacency matrix        
        
    }
    public int helper(int cnt, int[][] mat){
        //for bfs we need to make visited[] for each node, and we need a queue also which we will make in another function
        
        int prov=0;//no. of provinces
        
        boolean[] vis = new boolean[mat.length];
        for(int i=0;i<mat.length;i++){
            if(vis[i]==false){
                prov++;
                helper1(i,vis,mat);// i is that element which is not visited
            }
        }
        
        return prov;
    }
    public void helper1(int i,boolean[] vis,int[][] mat){
        Queue<Integer> q = new LinkedList();
        q.add(i);// i is element which is not visited now we will visit it in for loop
        
        vis[i]=true;// assigning i as visited
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int t=0;t<mat.length;t++){//t for traversing in row
                if(mat[temp][t]==1 && vis[t]==false){
                    q.add(t);
                    vis[t]=true;
                }
            }
        }
        
        
        
        
    }
   
}