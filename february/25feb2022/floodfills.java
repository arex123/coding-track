
// https://leetcode.com/problems/flood-fill/
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor) return image;
        int color = image[sr][sc];
        fillColor(image,sr,sc,newColor,color);
        return image;
        
    }
    
    public void fillColor(int[][] image, int sr,int sc,int newColor,int color){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length ||
          image[sr][sc]!=color)
            return;
        
        
        image[sr][sc]=newColor;
        fillColor(image,sr+1,sc,newColor,color);
        fillColor(image,sr-1,sc,newColor,color);
        fillColor(image,sr,sc+1,newColor,color);
        fillColor(image,sr,sc-1,newColor,color);
        
    }
    
}