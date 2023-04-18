class Solution {
    // https://leetcode.com/problems/excel-sheet-column-number/
    public int titleToNumber(String s) {
        
        int ans=0; 
        for(char c:s.toUpperCase().toCharArray()){
            ans=ans*26;
            int v = c-'A'+1;
            ans+=v;
            
        }
        
        return ans;
        
        
    }
}