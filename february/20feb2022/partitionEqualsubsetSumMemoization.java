class Solution {
    // https://leetcode.com/problems/partition-equal-subset-sum/
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2!=0)
            return false;
        else
        {
            int s = sum/2;
            Integer[][] dp = new Integer[nums.length+1][s+1];
            boolean ans = subseq(0,0,s,dp,nums);
            return ans;
        }
    }
    public boolean subseq(int i,int cs,int t,Integer[][] dp,int[] nums){
        if(i==nums.length || cs>t) return false;
        
        
        if(cs==t){
            return true;
        }
        
        if(dp[i][cs]!=null){
            if(dp[i][cs]==1)
                return true;
            else
                return false;
        }
        
        boolean one = subseq(i+1,cs+nums[i],t,dp,nums);
        boolean zero = subseq(i+1,cs,t,dp,nums);
        
        boolean res = one||zero;
        
        if(res==true){
            dp[i][cs]=1;
        }else{
            dp[i][cs]=0;
        }
        
        return res;
        
    }
}