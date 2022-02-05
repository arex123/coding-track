class Solution {
/*
Minimum number of deletions and insertions. 

problem Link: https://practice.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions0209/1/
  */
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(),m=str2.length();
        int[][]dp = new int[n+1][m+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
        int l=n,r=m;
        String revss=""; //reverse shortest common superseq.
        while(l!=0 && r!=0){
            if(str1.charAt(l-1)==str2.charAt(r-1)){
                revss+=str1.charAt(l-1);
                l--;
                r--;
            }else{
                if(dp[l-1][r]>dp[l][r-1]){
                    revss+=str1.charAt(l-1);
                    l--;
                }else{
                    revss+=str2.charAt(r-1);
                    r--;
                }
                
                
            }
        }
        while(l!=0){
            revss+=str1.charAt(l-1);
            l--;
        }
        while(r!=0){
            revss+=str2.charAt(r-1);
            r--;
        }
        
        String scs = "";
    
        for(int c=revss.length()-1;c>=0;c--){
            scs+=revss.charAt(c);
        }
        
       
        return scs;
        
        
        
    }
}