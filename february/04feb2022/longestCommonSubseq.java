class Solution {
    public int longestCommonSubsequenceRecursion(String text1, String text2) {
      return lcs(text1,text2,text1.length(),text2.length());
    }
    public int lcs(String x, String y, int n, int m){
        if(n==0 || m==0) return 0;
        
        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+lcs(x,y,n-1,m-1);
        }else{
            return Math.max(lcs(x,y,n,m-1), lcs(x,y,n-1,m) );
        }
    }
        
}

/*///////////////*/

class Solution {
    public int longestCommonSubsequenceMemoization(String text1, String text2) {
      
        Integer[][] mem=new Integer[text1.length()+1][text2.length()+1];
        
        
        return lcs(text1,text2,text1.length(),text2.length(),mem);
    }
    public int lcs(String x, String y, int n, int m,Integer[][] mem){
        if(n==0 || m==0) return 0;
        
        if(mem[n][m]!=null) return mem[n][m];
        
        
        if(x.charAt(n-1)==y.charAt(m-1)){
            mem[n][m] = 1+lcs(x,y,n-1,m-1,mem);
            return mem[n][m];
        }else{
            mem[n][m] = Math.max(lcs(x,y,n,m-1,mem), lcs(x,y,n-1,m,mem));
            return mem[n][m];
            
        }
    }
        
}