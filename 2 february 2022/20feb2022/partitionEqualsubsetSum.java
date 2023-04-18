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
            boolean ans = subseq(0,0,sum/2,nums);
            return ans;
        }
    }
    public boolean subseq(int i,int cs,int t,int[] nums){
        if(i==nums.length) return false;
        
        if(cs>t){
            return false;
        }
        if(cs==t){
            return true;
        }
        
        boolean one = subseq(i+1,cs+nums[i],t,nums);
        boolean zero = subseq(i+1,cs,t,nums);
        
        return (one || zero);
        
    }
}