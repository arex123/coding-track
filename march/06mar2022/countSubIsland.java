// https://leetcode.com/problems/count-sub-islands/
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length;
        int m = grid1[0].length;
        int count=0;
        
        //remove all lands which are in grid2 and not in grid1
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid1[i][j]==0 && grid2[i][j]==1){
                    dfs(grid1,grid2,i,j);
                }
            }
        }
        
        //counting island present in both
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid1[i][j]==1 && grid2[i][j]==1){
                    dfs(grid1,grid2,i,j);
                    count+=1;
                }
            }
        }
        
        return count;
    }
    public void dfs(int[][] grid1,int[][] grid2,int i,int j){
        if(i<0 || j<0 || i==grid1.length || j==grid1[0].length || grid2[i][j]==0)
            return;
        
        grid2[i][j]=0;
        dfs(grid1,grid2,i+1,j);
        dfs(grid1,grid2,i-1,j);
        dfs(grid1,grid2,i,j+1);
        dfs(grid1,grid2,i,j-1);

        
    }
    
}