// https://leetcode.com/problems/max-area-of-island/
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max = Math.max(max,area(i,j,grid));
                }
            }
        }
        
        return max;
    }
    
    public int area(int i,int j,int[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=-1;
        return 1+area(i+1,j,grid)+area(i-1,j,grid)+area(i,j+1,grid)+area(i,j-1,grid);
        
        
    }
}

/*

[0,0,1,0,0,0,0,1,0,0,0,0,0]
[0,0,0,0,0,0,0,1,1,1,0,0,0]
[0,1,1,0,1,0,0,0,0,0,0,0,0]
[0,1,0,0,1,1,0,0,1,0,1,0,0]
[0,1,0,0,1,1,0,0,1,1,1,0,0]
[0,0,0,0,0,0,0,0,0,0,1,0,0]
[0,0,0,0,0,0,0,1,1,1,0,0,0]
[0,0,0,0,0,0,0,1,1,0,0,0,0]


*/