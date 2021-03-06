class Solution {
    // 1312. Minimum Insertion Steps to Make a String Palindrome
    // https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/
    public int minInsertions(String s) {
        int n =s.length();
        int[][] dp = new int[n+1][n+1];
        
        String rev = "";
        for(int c=n-1;c>=0;c--){
            rev+=s.charAt(c);
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
        
        return n-dp[n][n];
        
    }
}