class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length,m=grid[0].length;
        // int[][] dp = new int[n][m];
        
        //fill 0th row and 0th col of dp
        // int sum = grid[0][0];
        for(int r=1;r<n;r++){
            grid[r][0]+=grid[r-1][0];
        }
        for(int c=1;c<m;c++){
            grid[0][c]+=grid[0][c-1];
        }
        
        for(int r=1;r<n;r++){
            for(int c=1;c<m;c++){
                
                grid[r][c]+=Math.min(grid[r-1][c],grid[r][c-1]);
                
            }
        }
        
        return grid[n-1][m-1];
        
        
        
    }
}